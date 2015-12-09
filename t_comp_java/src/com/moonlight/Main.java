package com.moonlight;

import com.moonlight.Scope.Scope;
import com.moonlight.Scope.ScopeException;
import com.moonlight.SemanticChecker.SemanticChecker;
import com.moonlight.SemanticChecker.SemanticCheckerException;
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

        Scope scope = new Scope();

        SemanticChecker semanticChecker = new SemanticChecker(scope, program);
        try {
            semanticChecker.checkSemantic();
        } catch (SemanticCheckerException e) {
            e.printStackTrace();
        } catch (ScopeException e) {
            e.printStackTrace();
        }

        System.out.println("---------- Ast tree ----------");
        AstNodePrinter.print(program);

        System.out.println("---------- Scope tree ----------");
        System.out.println(scope.toString());
    }
}
