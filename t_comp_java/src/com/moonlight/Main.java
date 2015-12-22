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

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Checking arguments
        if (args.length != 1) {
            System.out.println("Usage: compiler.jar fileName");
            return;
        }

        String filepath = "./" + args[0];
        boolean printTrees = false;

        // Reading file
        CharStream input = null;
        try {
            input = new ANTLRFileStream(filepath);
        } catch (IOException e) {
            System.out.println(String.format("File read error: %s", e.getMessage()));
            return;
        }

        cLexer lexer = new cLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        cParser parser = new cParser(tokens);


        // Generating ast tree
        System.out.println("[compiler]: Building ast tree");
        Tree program = null;
        try {
            program = (Tree) parser.execute().getTree();
        } catch (RecognitionException e) {
            System.out.println(String.format("Error in ast tree builder: %s", e.getMessage()));
            return;
        }

        // Printing ast tree
        if (printTrees) {
            System.out.println("---------- Ast tree ----------");
            AstTreePrinter.print(program);
        }

        // Generating scope tree
        System.out.println("[compiler]: Building scope tree");
        FuncNode scopeTree = null;
        try {
            scopeTree = ScopeTree.buildScopeTree(program);
        } catch (ScopeException e) {
            System.out.println(String.format("Error in scope tree builder: %s", e.getMessage()));
            return;
        }

        // Printing scope tree
        if (printTrees) {
            System.out.println("---------- ScopeTree tree ----------");
            ScopeTree.print(scopeTree);
        }

        // Generating assembler
        System.out.println("[compiler]: Generating assembler");
        try {
            CodeGenerator.generateFuncNode(scopeTree);
        } catch (CodeGeneratorException e) {
            System.out.println(String.format("Error in code generator: %s", e.getMessage()));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
