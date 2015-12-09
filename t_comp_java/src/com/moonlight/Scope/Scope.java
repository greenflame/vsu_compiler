package com.moonlight.Scope;

import java.util.Map;

/**
 * Created by Alexander on 08/12/15.
 */
public class Scope {
    private FuncNode rootFunc;
    private FuncNode currentFunc;

    public Scope() {
        setRootFunc(new FuncNode("void"));
        setCurrentFunc(getRootFunc());
    }

    public void levelUp(String returnType, String functionName) {
        if (!getCurrentFunc().getChildFuncs().containsKey(functionName)) {
            getCurrentFunc().getChildFuncs().put(functionName, new FuncNode(returnType, currentFunc));
        }
        currentFunc = getCurrentFunc().getChildFuncs().get(functionName);
    }

    public void levelDown() {
        currentFunc = currentFunc.getParentFunc();
    }

    public void addArgVar(String type, String name) throws ScopeException {
        getCurrentFunc().addArgVar(type, name);
    }

    public void addLocalVar(String type, String name) throws ScopeException {
        getCurrentFunc().addLocalVar(type, name);
    }

    @Override
    public String toString() {
        return toStringRecursive(getRootFunc(), "");
    }

    private String toStringRecursive(FuncNode node, String indent) {
        String result = "";
        result += indent + node.toString();

        for (Map.Entry<String, FuncNode> childFunc : node.getChildFuncs().entrySet()) {
            result += indent + "cf: [" + childFunc.getKey() + "]\n";
            result += toStringRecursive(childFunc.getValue(), indent + "\t");
        }

        return result;
    }

    public FuncNode getRootFunc() {
        return rootFunc;
    }

    public void setRootFunc(FuncNode rootFunc) {
        this.rootFunc = rootFunc;
    }

    public FuncNode getCurrentFunc() {
        return currentFunc;
    }

    public void setCurrentFunc(FuncNode currentFunc) {
        this.currentFunc = currentFunc;
    }
}

