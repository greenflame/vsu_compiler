package com.moonlight.ScopeTree;

import org.antlr.runtime.tree.Tree;

import java.util.*;

/**
 * Created by Alexander on 08/12/15.
 */
public class FuncNode {
    private String name;
    private String returnType;
    private Map<String, VarNode> vars;

    private FuncNode parentFunc;
    private Map<String, FuncNode> childFuncs;

    private Tree body;

    public FuncNode(String returnType, String name, FuncNode parentFunc, Tree bodyNode)
    {
        setName(name);
        setReturnType(returnType);
        setVars(new HashMap<>());

        setParentFunc(parentFunc);
        setChildFuncs(new HashMap<>());

        setBody(bodyNode);
    }

    public void addVar(String type, String name, VarLocation decPlace) throws ScopeException {
        if (getVars().containsKey(name)) {
            throw new ScopeException("Variable with this name already exists in current scope.");
        }

        getVars().put(name, new VarNode(type, getVars().size(), decPlace));
    }

    public String getSignature() {
        String caption = "(";

        for (Map.Entry<String, VarNode> var : getVars().entrySet()) {
            if (var.getValue().getLocation().equals(VarLocation.ARGUMENT)) {
                caption += var.getValue().getType().toUpperCase().charAt(0);
            }
        }

        caption += ")";
        caption += getReturnType().toUpperCase().charAt(0);

        return caption;
    }

    @Override
    public String toString() {
        StringJoiner varsInfo = new StringJoiner(", ", "[", "]");

        for (Map.Entry<String, VarNode> var : vars.entrySet()) {
            varsInfo.add(String.format("(%s, %s)", var.getKey(), var.getValue().toString()));
        }

        return String.format("return: [%s], name [%s] vars: %s\n", getReturnType(), getName(), varsInfo.toString());
    }

    public FuncNode getParentFunc() {
        return parentFunc;
    }

    public void setParentFunc(FuncNode parentFunc) {
        this.parentFunc = parentFunc;
    }

    public Map<String, FuncNode> getChildFuncs() {
        return childFuncs;
    }

    public void setChildFuncs(Map<String, FuncNode> childFuncs) {
        this.childFuncs = childFuncs;
    }

    public Map<String, VarNode> getVars() {
        return vars;
    }

    public void setVars(Map<String, VarNode> vars) {
        this.vars = vars;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tree getBody() {
        return body;
    }

    public void setBody(Tree body) {
        this.body = body;
    }
}
