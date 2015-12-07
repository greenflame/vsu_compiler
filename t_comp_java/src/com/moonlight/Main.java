package com.moonlight;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filepath = "./Input.txt";

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

        AstNodePrinter.print(program);
    }
}
