package com.moonlight.CodeGenerator;

import com.moonlight.ScopeTree.FuncNode;
import com.moonlight.ScopeTree.VarNode;
import com.moonlight.SyntaxesAnalyser.cLexer;
import org.antlr.runtime.tree.Tree;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Alexander on 07/12/15.
 * Class for c-like language code generation with integrated functions support
 */
public class CodeGenerator {

    /**
     * For unique labels generation.
     */
    static int curLabel = 0;

    /**
     * Main function for class file generation. Call it for root function node.
     * @param funcNode Node for generation class file.
     * @throws CodeGeneratorException
     * @throws FileNotFoundException
     */
    public static void generateFuncNode(FuncNode funcNode) throws CodeGeneratorException, FileNotFoundException {
        List<String> code = new LinkedList<>(); // Str list for code
        generateFuncClass(funcNode, code);      // Generating class code

        // Writing to file
        PrintWriter printWriter = new PrintWriter(String.format("./%s.j", funcNode.getName()));
        printWriter.println(String.join("\n", code));
        printWriter.close();

        // Generating classes for child functions recursively
        for (Map.Entry<String, FuncNode> childFunc : funcNode.getChildFuncs().entrySet()) {
            generateFuncNode(childFunc.getValue());
        }
    }

    /**
     * Class generation for funcNode to code string list.
     * @param curFunc Current function node.
     * @param code String list to add commands.
     */
    private static void generateFuncClass(FuncNode curFunc, List<String> code) {
        // Class info block
        code.add("; ----- Class info -----");
        code.add(".version 52 0");
        code.add(String.format(".source %s.java", curFunc.getName()));
        code.add(String.format(".class super public %s", curFunc.getName()));
        code.add(".super java/lang/Object");
        code.add("");


        // Vars block
        code.add("; ----- Fields for function vars -----");
        code.addAll(curFunc.getVars().entrySet().stream()
                .map(var -> String.format(".field public %s I", var.getKey())).collect(Collectors.toList()));
        code.add("");


        // Ref to parent(if isn't root)
        if(curFunc.getParentFunc() != null) {
            code.add("; ----- Reference to parent function call instance -----");
            code.add(String.format(".field public parent L%s;", curFunc.getParentFunc().getName()));
            code.add("");
        }


        // Constructor
        code.add("; ----- Constructor ------");
        if(curFunc.getParentFunc() != null) {   // Parent as param if isn't root
            code.add(String.format(".method  <init> : (L%s;)V", curFunc.getParentFunc().getName()));
        } else {
            code.add(".method  <init> : ()V");
        }
        code.add("\t; ----- Call super constructor -----");
        code.add("\taload 0");
        code.add("\tinvokespecial java/lang/Object <init> ()V");
        if(curFunc.getParentFunc() != null) {   // Initializing parent field
            code.add("; ----- Copying first parameter to parent field -----");
            code.add("\taload_0");
            code.add("\taload_1");
            code.add(String.format("\tputfield %s parent L%s;",
                    curFunc.getName(), curFunc.getParentFunc().getName()));
        }
        code.add("\treturn");
        code.add(".end method");
        code.add("");


        // Run function
        code.add("; ----- Run function -----");
        code.add(".method public run : " + curFunc.getSignature());
        code.add("\t.limit stack 10");  // TODO: 13/12/15 stack size counter?
        code.add("\t.limit locals 10");
        code.add("\t; ----- Initializing fields. Locals with 0, args with input values. -----");
        for (Map.Entry<String, VarNode> var : curFunc.getVars().entrySet()) {
            switch (var.getValue().getLocation()) {
                case LOCAL:
                    code.add("\taload 0");
                    code.add("\tldc 0");
                    code.add(String.format("\tputfield %s %s I", curFunc.getName(), var.getKey()));
                    break;
                case ARGUMENT:
                    code.add("\taload 0");
                    code.add(String.format("\tiload %d", var.getValue().getIndex() + 1)); // Index shift = +1
                    code.add(String.format("\tputfield %s %s I", curFunc.getName(), var.getKey()));
                    break;
            }
        }
        code.add("\t; ----- Body -----");
        generateBlock(curFunc.getBody(), curFunc, code);
        code.add(".end method");
        code.add("");


        // Entry point(for root function)
        if (curFunc.getParentFunc() == null) {
            code.add(".method static public main : ([Ljava/lang/String;)V");
            code.add("\t; method code size: 13 bytes");
            code.add("\t.limit stack 2");
            code.add("\t.limit locals 2");
            code.add("\tnew Root");
            code.add("\tdup");
            code.add("\tinvokespecial Root <init> ()V");
            code.add("\tinvokevirtual Root run ()V");
            code.add("\treturn");
            code.add(".end method");
            code.add("");
        }
    }

    /**
     * Generate code for expression execution. Nothing remains in stack after it.
     * @param node Current ast node.
     * @param curFunc Current func node.
     * @param code Code list to write.
     */
    private static void generateExprExecution(Tree node, FuncNode curFunc, List<String> code) {
        switch (node.getType()) {
            case cLexer.BLOCK:
                generateBlock(node, curFunc, code);
                break;
            case cLexer.ASSIGN:
                generateAssign(node, curFunc, code);
                break;
            case cLexer.WRITE:
                generateWrite(node, curFunc, code);
                break;
            case cLexer.RETURN:
                generateReturn(node, curFunc, code);
                break;
            case cLexer.VAR_DEC:
                generateVarDec(node, curFunc, code);
                break;
            case cLexer.FUNC_CALL:
                generateFuncCall(node, curFunc, code);
                break;
        }
    }

    private static void generateBlock(Tree node, FuncNode curFunc, List<String> code) {
        for (int i = 0; i < node.getChildCount(); i++) {
            generateExprExecution(node.getChild(i), curFunc, code);
        }
    }

    private static void generateAssign(Tree node, FuncNode curFunc, List<String> code) {
        String varName = node.getChild(0).toString();
        FuncNode varOwner = curFunc;

        code.add("\taload 0");
        while (!varOwner.getVars().containsKey(varName)) {  // Recursive descent to var in ancestor scope
            code.add(String.format("\tgetfield %s parent L%s;",
                    varOwner.getName(), varOwner.getParentFunc().getName()));
            varOwner = varOwner.getParentFunc();
        }
        generateExprSolution(node.getChild(1), curFunc, code);  // Generating value
        code.add(String.format("\tputfield %s %s I", varOwner.getName(), varName)); // Writing value to field
    }

    private static void generateVarDec(Tree node, FuncNode curFunc, List<String> code) {
        for (int i = 0; i < node.getChild(2).getChildCount(); i++) {    // Generate expressions for assignments
            generateExprExecution(node.getChild(2).getChild(i), curFunc, code);
        }
    }

    private static void generateReturn(Tree node, FuncNode curFunc, List<String> code) {
        if (node.getChildCount() != 0) {    // If there is expression after return
            generateExprSolution(node.getChild(0), curFunc, code);
            code.add("\tireturn");
        } else {
            code.add("\treturn");
        }
    }

    private static void generateWrite(Tree node, FuncNode curFunc, List<String> code) {
        for (int i = 0; i < node.getChildCount(); i++) {    // For each param
            if (node.getChild(i).getType() == cLexer.STRING) {
                code.add("\tgetstatic java/lang/System out Ljava/io/PrintStream;");
                String str = node.getChild(i).toString();
                str = str.substring(1, str.length() - 2);
                code.add(String.format("\tldc '%s'", str));
                code.add("\tinvokevirtual java/io/PrintStream println (Ljava/lang/String;)V");
            } else {
                code.add("\tgetstatic java/lang/System out Ljava/io/PrintStream;");
                generateExprSolution(node.getChild(i), curFunc, code);
                code.add("\tinvokevirtual java/io/PrintStream println (I)V");
            }
        }
    }

    private static void generateExprSolution(Tree node, FuncNode curFunc, List<String> code) {
        switch (node.getType()) {
            case cLexer.NUMBER:
                code.add(String.format("\tldc %d", Integer.parseInt(node.toString())));
                break;
            case cLexer.ID:
                generateIdExtraction(node, curFunc, code);
                break;
            case cLexer.FUNC_CALL:
                generateFuncCall(node, curFunc, code);
                break;

            case cLexer.ADD:
                generateExprSolution(node.getChild(0), curFunc, code);
                generateExprSolution(node.getChild(1), curFunc, code);
                code.add("\tiadd");
                break;
            case cLexer.SUB:
                generateExprSolution(node.getChild(0), curFunc, code);
                generateExprSolution(node.getChild(1), curFunc, code);
                code.add("\tisub");
                break;
            case cLexer.MUL:
                generateExprSolution(node.getChild(0), curFunc, code);
                generateExprSolution(node.getChild(1), curFunc, code);
                code.add("\timul");
                break;
            case cLexer.DIV:
                generateExprSolution(node.getChild(0), curFunc, code);
                generateExprSolution(node.getChild(1), curFunc, code);
                code.add("\tidiv");
                break;

            case cLexer.LT:
                generateExprSolution(node.getChild(0), curFunc, code);
                generateExprSolution(node.getChild(1), curFunc, code);
                code.add(String.format("\tif_icmplt L%d", curLabel++));
                code.add("\tldc 0");
                code.add(String.format("\tgoto L%d", curLabel++));
                code.add(String.format("L%d:", curLabel - 2));
                code.add("\tldc 1");
                code.add(String.format("L%d:", curLabel - 1));
                break;
        }
    }

    private static void generateIdExtraction(Tree node, FuncNode curFunc, List<String> code) {
        String varName = node.toString();
        FuncNode varOwner = curFunc;

        code.add("\taload 0");
        while (!varOwner.getVars().containsKey(varName)) {  // Recursive descent to parent scope
            code.add(String.format("\tgetfield %s parent L%s;",
                    varOwner.getName(), varOwner.getParentFunc().getName()));
            varOwner = varOwner.getParentFunc();
        }
        code.add(String.format("\tgetfield %s %s I", varOwner.getName(), varName)); // Extracting field
    }

    private static void generateFuncCall(Tree node, FuncNode curFunc, List<String> code) {
        String callFuncName = node.getChild(0).getChild(0).toString();
        FuncNode callFuncParent = curFunc;

        // Creating class
        code.add(String.format("\tnew %s", callFuncName));
        code.add("\tdup");

        // Recursive descent to first common ancestor
        code.add("\taload 0");
        while(!callFuncParent.getChildFuncs().containsKey(callFuncName)) {
            code.add(String.format("\tgetfield %s parent L%s;",
                    callFuncParent.getName(), callFuncParent.getParentFunc().getName()));
            callFuncParent = callFuncParent.getParentFunc();
        }

        // Calling constructor
        code.add(String.format("\tinvokespecial %s <init> (L%s;)V", callFuncName, callFuncParent.getName()));

        // Laying parameters onto stack
        for (int i = 0; i < node.getChild(1).getChildCount(); i++) {
            generateExprSolution(node.getChild(1).getChild(i), curFunc, code);
        }

        // Run call
        code.add(String.format("\tinvokevirtual %s run %s",
                callFuncName, callFuncParent.getChildFuncs().get(callFuncName).getSignature()));
    }
}
