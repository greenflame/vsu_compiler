package com.moonlight.SemanticChecker;

import com.moonlight.Scope.Scope;
import com.moonlight.Scope.ScopeException;
import com.moonlight.SyntaxesAnalyser.cLexer;
import com.sun.tools.javac.util.Pair;
import org.antlr.runtime.tree.Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alexander on 07/12/15.
 */
public class SemanticChecker {
    private Scope scope;
    private Tree root;

    public SemanticChecker(Scope scope, Tree root) {
        this.scope = scope;
        this.root = root;
    }

    public void checkSemantic() throws SemanticCheckerException, ScopeException {
        if (root.getType() == cLexer.PROGRAM) {
            checkDecs(root);
        } else {
            throw new SemanticCheckerException("Root type is not 'program'.");
        }
    }

    private void checkDecs(Tree node) throws ScopeException {
        switch (node.getType()) {
            case cLexer.FUNC_DEC:
                checkFuncDec(node);
                break;
            case cLexer.VAR_DEC:
                checkVarDec(node);
                break;
            default:
                for (int i = 0; i < node.getChildCount(); i++) {
                    checkDecs(node.getChild(i));
                }
        }
    }

    private void checkVarDec(Tree node) throws ScopeException {
        // Collect info
        String varsType = node.getChild(0).getChild(0).toString();

        List<String> varNames = new LinkedList<>();

        // Not initialized vars
        for (int i = 0; i < node.getChild(1).getChildCount(); i++) {
            varNames.add(node.getChild(1).getChild(i).toString());
        }

        // Initialized vars
        for (int i = 0; i < node.getChild(2).getChildCount(); i++) {
            varNames.add(node.getChild(2).getChild(i).getChild(0).toString());
        }

        // Write info to scope
        for (String varName : varNames) {
            scope.addLocalVar(varsType, varName);
        }
    }

    private void checkFuncDec(Tree node) throws ScopeException {
        // Extracting info
        String funcType = node.getChild(0).getChild(0).toString();
        String funcName = node.getChild(1).getChild(0).toString();

        List<Pair<String, String>> params = new LinkedList<>();
        for (int i = 0; i < node.getChild(2).getChildCount(); i++) {
            String varType = node.getChild(2).getChild(i).getChild(0).toString();
            String varName = node.getChild(2).getChild(i).getChild(1).toString();

            params.add(new Pair<>(varType, varName));
        }

        // Writing info to scope
        scope.levelUp(funcType, funcName);
        for (int i = 0; i < params.size(); i++) {
            scope.addArgVar(params.get(i).fst, params.get(i).snd);
        }

        checkDecs(node.getChild(3));
        scope.levelDown();
    }
}
