package com.moonlight.CodeGenerator;

import com.moonlight.ScopeTree.FuncNode;
import com.moonlight.ScopeTree.ScopeTree;
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
        List<String> rootFunc = generateFuncClass(funcNode);
        writeStrList(rootFunc, String.format("./%s.j", funcNode.getName()));
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

    private static List<String> generateFuncClass(FuncNode curFunc) {
        List<String> result = new LinkedList<>();

        result.add("; ----- Class info -----");
        result.add(".version 52 0");
        result.add(String.format(".source %s.java", curFunc.getName()));
        result.add(String.format(".class super public %s", curFunc.getName()));
        result.add(".super java/lang/Object");
        result.add("");

        result.add("; ----- Fields for function vars-----");
        for (Map.Entry<String, VarNode> var : curFunc.getVars().entrySet()) {
            result.add(String.format(".field public %s I", var.getKey()));
        }
        result.add("");

        result.add("; ----- Constructor ------");
        result.add(".method  <init> : ()V");
        result.add("\t; ----- Call super constructor -----");
        result.add("\taload 0");    // This
        result.add("\tinvokespecial java/lang/Object <init> ()V");
        result.add("\treturn");
        result.add(".end method");
        result.add("");

        result.add("; ----- Main function -----");
        result.add(".method public run : ()V"); // TODO: 13/12/15 Signature generation

        result.add("\t; ----- Initializing fields. Locals with 0, args with input values. -----");
        for (Map.Entry<String, VarNode> var : curFunc.getVars().entrySet()) {
            switch (var.getValue().getLocation()) {
                case LOCAL:
                    result.add("\taload 0");    // This
                    result.add("\tldc 0");
                    result.add(String.format("\tputfield %s %s I", curFunc.getName(), var.getKey()));
                    break;
                case ARGUMENT:
                    result.add("\taload 0");    // This
                    result.add(String.format("\taload %d", var.getValue().getIndex() + 1)); // Index shift = +1
                    result.add(String.format("\tputfield %s %s I", curFunc.getName(), var.getKey()));
                    break;
            }
        }

        result.add("\t; ----- Body -----");

        result.addAll(generateBlock(curFunc.getBody(),  curFunc));

        result.add("\treturn");
        result.add(".end method");


        return result;
    }

    private static List<String> generateBlock(Tree node, FuncNode curFunc) {
        List<String> result = new LinkedList<>();

        for (int i = 0; i < node.getChildCount(); i++) {
            result.addAll(generateExprExecution(node.getChild(i), curFunc));
        }

        return result;
    }

    private static List<String> generateExprExecution(Tree node, FuncNode curFunc) {
        List<String> result = new LinkedList<>();

        switch (node.getType()) {
            case cLexer.ASSIGN:
                result.add("\taload 0");    // This
                result.addAll(generateExprSolution(node.getChild(1), curFunc));
                result.add(String.format("\tputfield Test %s I", node.getChild(0).toString()));
                break;
        }

        return result;
    }

    private static List<String> generateExprSolution(Tree astNode, FuncNode scopeNode) {
        List<String> result = new LinkedList<>();

        switch (astNode.getType()) {
            case cLexer.NUMBER:
                result.add(String.format("\tldc %d", Integer.parseInt(astNode.toString())));
                break;
            case cLexer.ID:
                result.add("\taload_0");
                result.add("\tgetfield Test a I");
        }

        return result;
    }
}
