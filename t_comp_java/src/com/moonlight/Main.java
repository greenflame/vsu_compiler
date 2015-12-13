package com.moonlight;

import com.moonlight.CodeGenerator.CodeGenerator;
import com.moonlight.CodeGenerator.CodeGeneratorException;
import com.moonlight.ScopeTree.FuncNode;
import com.moonlight.ScopeTree.ScopeTree;
import com.moonlight.ScopeTree.ScopeException;
import com.moonlight.SyntaxesAnalyser.AstTreePrinter;
import com.moonlight.SyntaxesAnalyser.cLexer;
import com.moonlight.SyntaxesAnalyser.cParser;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filepath = "./input.c";

        CharStream input = null;
        try {
            input = new ANTLRFileStream(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        cLexer lexer = new cLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        cParser parser = new cParser(tokens);

        Tree program = null;
        try {
            program = (Tree) parser.execute().getTree();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

        System.out.println("---------- Ast tree ----------");
        AstTreePrinter.print(program);



        FuncNode scopeTree = null;
        try {
            scopeTree = ScopeTree.buildScopeTree(program);
        } catch (ScopeException e) {
            e.printStackTrace();
        }

        System.out.println("---------- ScopeTree tree ----------");
        ScopeTree.print(scopeTree);

        try {
            CodeGenerator.generate(scopeTree);
        } catch (CodeGeneratorException e) {
            e.printStackTrace();
        }
    }
}
