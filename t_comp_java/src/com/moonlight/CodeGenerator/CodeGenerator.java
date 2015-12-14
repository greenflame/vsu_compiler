package com.moonlight.CodeGenerator;

import com.moonlight.ScopeTree.FuncNode;
import com.moonlight.ScopeTree.VarLocation;
import com.moonlight.ScopeTree.VarNode;
import com.moonlight.SyntaxesAnalyser.cLexer;
import org.antlr.runtime.tree.Tree;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Alexander on 07/12/15.
 */
public class CodeGenerator {

    public static void generate(FuncNode funcNode) throws CodeGeneratorException {
        List<String> code = new LinkedList<>();
        generateFuncClass(funcNode, code);
        writeStrList(code, String.format("./%s.j", funcNode.getName()));

        for (Map.Entry<String, FuncNode> childFunc : funcNode.getChildFuncs().entrySet()) {
            generate(childFunc.getValue());
        }
    }

    private static void writeStrList(List<String> stringList, String fileName) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printWriter.println(String.join("\n", stringList));
        printWriter.close();
    }

    private static void generateFuncClass(FuncNode curFunc, List<String> code) {
        code.add("; ----- Class info -----");
        code.add(".version 52 0");
        code.add(String.format(".source %s.java", curFunc.getName()));
        code.add(String.format(".class super public %s", curFunc.getName()));
        code.add(".super java/lang/Object");
        code.add("");

        code.add("; ----- Fields for function vars -----");
        for (Map.Entry<String, VarNode> var : curFunc.getVars().entrySet()) {
            code.add(String.format(".field public %s I", var.getKey()));
        }
        code.add("");

        if(curFunc.getParentFunc() != null) {
            code.add("; ----- Reference to parent function call instance -----");
            code.add(String.format(".field public parent L%s;", curFunc.getParentFunc().getName()));
            code.add("");
        }

        code.add("; ----- Constructor ------");

        if(curFunc.getParentFunc() != null) {
            code.add(String.format(".method  <init> : (L%s;)V", curFunc.getParentFunc().getName()));
        } else {
            code.add(".method  <init> : ()V");
        }

        code.add("\t; ----- Call super constructor -----");
        code.add("\taload 0");
        code.add("\tinvokespecial java/lang/Object <init> ()V");

        if(curFunc.getParentFunc() != null) {
            code.add("; ----- Copying first parameter to parent field -----");
            code.add("\taload_0");
            code.add("\taload_1");
            code.add(String.format("\tputfield %s parent L%s;",
                    curFunc.getName(), curFunc.getParentFunc().getName()));
        }

        code.add("\treturn");
        code.add(".end method");
        code.add("");

        code.add("; ----- Main function -----");
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

        // Entry point
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

    private static void generateBlock(Tree node, FuncNode curFunc, List<String> code) {
        for (int i = 0; i < node.getChildCount(); i++) {
            generateExprExecution(node.getChild(i), curFunc, code);
        }
    }

    private static void generateExprExecution(Tree node, FuncNode curFunc, List<String> code) {
        switch (node.getType()) {
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

    private static void generateVarDec(Tree node, FuncNode curFunc, List<String> code) {
        for (int i = 0; i < node.getChild(2).getChildCount(); i++) {
            generateExprExecution(node.getChild(2).getChild(i), curFunc, code);
        }
    }

    private static void generateReturn(Tree node, FuncNode curFunc, List<String> code) {
        if (node.getChildCount() != 0) {
            generateExprSolution(node.getChild(0), curFunc, code);
            code.add("\tireturn");
        } else {
            code.add("\treturn");
        }
    }

    private static void generateWrite(Tree node, FuncNode curFunc, List<String> code) {
        for (int i = 0; i < node.getChildCount(); i++) {
            code.add("\tgetstatic java/lang/System out Ljava/io/PrintStream;");
            generateExprSolution(node.getChild(i), curFunc, code);
            code.add("\tinvokevirtual java/io/PrintStream println (I)V");
        }
    }

    private static void generateAssign(Tree node, FuncNode curFunc, List<String> code) {
        code.add("\taload 0");

        String varName = node.getChild(0).toString();
        FuncNode varOwner = curFunc;
        while (!varOwner.getVars().containsKey(varName)) {
            code.add(String.format("\tgetfield %s parent L%s;",
                    varOwner.getName(), varOwner.getParentFunc().getName()));
            varOwner = varOwner.getParentFunc();
        }

        generateExprSolution(node.getChild(1), curFunc, code);

        code.add(String.format("\tputfield %s %s I", varOwner.getName(), varName));
    }

    private static void generateExprSolution(Tree node, FuncNode curFunc, List<String> code) {
        switch (node.getType()) {
            case cLexer.NUMBER:
                code.add(String.format("\tldc %d", Integer.parseInt(node.toString())));
                break;
            case cLexer.ID:
                code.add("\taload 0");

                String varName = node.toString();
                FuncNode varOwner = curFunc;
                while (!varOwner.getVars().containsKey(varName)) {
                    code.add(String.format("\tgetfield %s parent L%s;",
                            varOwner.getName(), varOwner.getParentFunc().getName()));
                    varOwner = varOwner.getParentFunc();
                }

                code.add(String.format("\tgetfield %s %s I", varOwner.getName(), varName));
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
        }
    }

    private static void generateFuncCall(Tree node, FuncNode curFunc, List<String> code) {
        String callFuncName = node.getChild(0).getChild(0).toString();
        FuncNode callFuncParent = curFunc;

        code.add(String.format("\tnew %s", callFuncName));
        code.add("\tdup");

        code.add("\taload 0");
        while(!callFuncParent.getChildFuncs().containsKey(callFuncName)) {
            code.add(String.format("\tgetfield %s parent L%s;",
                    callFuncParent.getName(), callFuncParent.getParentFunc().getName()));
            callFuncParent = callFuncParent.getParentFunc();
        }

        code.add(String.format("\tinvokespecial %s <init> (L%s;)V", callFuncName, callFuncParent.getName()));

        // Laying parameters onto stack
        for (int i = 0; i < node.getChild(1).getChildCount(); i++) {
            generateExprSolution(node.getChild(1).getChild(i), curFunc, code);
        }

        code.add(String.format("\tinvokevirtual %s run %s",
                callFuncName, callFuncParent.getChildFuncs().get(callFuncName).getSignature()));
    }
}
