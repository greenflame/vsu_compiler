package com.moonlight.ScopeTree;

import com.moonlight.SyntaxesAnalyser.cLexer;
import org.antlr.runtime.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Alexander on 08/12/15.
 */
public class ScopeTree {

    public static FuncNode buildScopeTree(Tree astRootNode) throws ScopeException {
        if (astRootNode.getType() != cLexer.PROGRAM) {
            throw new ScopeException("Node type must be 'program'.");
        }

        FuncNode scopeRootFunc = new FuncNode("void", "Root", null, astRootNode);
        buildFunc(scopeRootFunc);
        return scopeRootFunc;
    }

    private static void buildFunc(FuncNode funcNode) throws ScopeException {
        walkAst(funcNode.getBody(), funcNode);
    }

    private static void walkAst(Tree node, FuncNode curFunc) throws ScopeException {
        switch (node.getType()) {
            case cLexer.FUNC_DEC:
                processFuncDec(node, curFunc);
                break;
            case cLexer.VAR_DEC:
                processVarDec(node, curFunc);
                break;
            default:
                for (int i = 0; i < node.getChildCount(); i++) {
                    walkAst(node.getChild(i), curFunc);
                }
        }
    }

    private static void processVarDec(Tree node, FuncNode curFunc) throws ScopeException {
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
            curFunc.addVar(varsType, varName, VarLocation.LOCAL);
        }
    }

    private static void processFuncDec(Tree node, FuncNode curFunc) throws ScopeException {
        // Extracting info
        String funcType = node.getChild(0).getChild(0).toString();
        String funcName = node.getChild(1).getChild(0).toString();

        List<Pair<String, String>> params = new LinkedList<>();
        for (int i = 0; i < node.getChild(2).getChildCount(); i++) {
            String varType = node.getChild(2).getChild(i).getChild(0).toString();
            String varName = node.getChild(2).getChild(i).getChild(1).toString();

            params.add(new Pair<>(varType, varName));
        }


        // Writing info to the scope
        // Creating new function node
        if (curFunc.getChildFuncs().containsKey(funcName)) {
            throw new ScopeException("Function with this name already exists.");
        }

        FuncNode childFunc = new FuncNode(funcType, funcName, curFunc, node.getChild(3));
        curFunc.getChildFuncs().put(funcName, childFunc);

        for (int i = 0; i < params.size(); i++) {
            childFunc.addVar(params.get(i).getFirst(), params.get(i).getSecond(), VarLocation.ARGUMENT);
        }

        buildFunc(childFunc);
    }

    public static void print(FuncNode node) {
        System.out.println(printTreeRecursively(node, ""));
    }

    private static String printTreeRecursively(FuncNode node, String indent) {
        String result = "";
        result += indent + node.toString();

        for (Map.Entry<String, FuncNode> childFunc : node.getChildFuncs().entrySet()) {
            result += printTreeRecursively(childFunc.getValue(), indent + "\t");
        }

        return result;
    }
}

class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }
}