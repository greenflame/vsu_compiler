package com.moonlight.CodeGenerator;

import com.moonlight.Scope.FuncNode;
import com.moonlight.Scope.Scope;
import com.moonlight.Scope.VarNode;
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
    private Scope scope;
    private Tree root;

    public CodeGenerator(Scope scope, Tree root) {
        setScope(scope);
        setRoot(root);
    }

    public void generate() throws CodeGeneratorException {
        if (root.getType() != cLexer.PROGRAM) {
            throw new CodeGeneratorException("Root node's type must be 'PROGRAM'.");
        }

        // Generating root function
        List<String> rootFunc = generateFuncClass("Root", root, scope.getCurrentFunc());

        // Writing to file
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("./root.j");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printWriter.println(String.join("\n", rootFunc));
        printWriter.close();
    }

    private List<String> generateFuncClass(String funcName, Tree astNode, FuncNode scopeNode) {
        List<String> result = new LinkedList<>();

        result.add("; ----- Class info -----");
        result.add(".version 52 0");
        result.add(String.format(".source %s.java", funcName));
        result.add(String.format(".class super public %s", funcName));
        result.add(".super java/lang/Object");
        result.add("");

        result.add("; ----- Fields for local vars -----");
        for (Map.Entry<String, VarNode> var : scopeNode.getLocalVars().entrySet()) {
            result.add(String.format(".field public l%d I", var.getValue().getIndex()));
        }
        result.add("");

        result.add("; ----- Fields for arguments vars -----");
        for (Map.Entry<String, VarNode> var : scopeNode.getArgVars().entrySet()) {
            result.add(String.format(".field public a%d I", var.getValue().getIndex()));
        }
        result.add("");

        // Constructor - initializing fields for local vars
        result.add(".method  <init> : ()V");
//        result.add("\t.limit stack 1");
//        result.add("\t.limit locals 1");
        result.add("\t; ----- Call super constructor -----");
        result.add("\taload_0");
        result.add("\tinvokespecial java/lang/Object <init> ()V");
        result.add("\treturn");
        result.add(".end method");
        result.add("");

        // Main function


        return result;
    }

    private List<String> generateBlock(Tree node) {
        return new LinkedList<>();
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Tree getRoot() {
        return root;
    }

    public void setRoot(Tree root) {
        this.root = root;
    }
}
