package com.moonlight.Scope;

import java.util.*;

/**
 * Created by Alexander on 08/12/15.
 */
public class FuncNode {
    private FuncNode parentFunc;
    private Map<String, FuncNode> childFuncs;

    private String returnType;
    private Map<String, VarNode> argVars;
    private Map<String, VarNode> localVars;

    public FuncNode(String returnType)
    {
        setChildFuncs(new HashMap<>());

        setReturnType(returnType);
        setArgVars(new HashMap<>());
        setLocalVars(new HashMap<>());
    }

    public FuncNode(String returnType, FuncNode parentFunc) {
        this(returnType);
        this.setParentFunc(parentFunc);
    }

    public void addArgVar(String type, String name) throws ScopeException {
        if (getArgVars().containsKey(name)) {
            throw new ScopeException("Variable with this name already exists in current scope.");
        }

        getArgVars().put(name, new VarNode(type, getArgVars().size()));
    }

    public void addLocalVar(String type, String name) throws ScopeException {
        if (getLocalVars().containsKey(name)) {
            throw new ScopeException("Variable with this name already exists in current scope.");
        }

        getLocalVars().put(name, new VarNode(type, getLocalVars().size()));
    }

    @Override
    public String toString() {
        return String.format("rt: [%s], av: %s, lv: %s\n",
                getReturnType(), varMapToStr(getArgVars()), varMapToStr(getLocalVars()));
    }

    private String varMapToStr(Map<String, VarNode> vars) {
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");

        for (Map.Entry<String, VarNode> var : vars.entrySet()) {
            stringJoiner.add(String.format("(%s, %s)", var.getKey(), var.getValue().toString()));
        }

        return stringJoiner.toString();
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

    public Map<String, VarNode> getArgVars() {
        return argVars;
    }

    public void setArgVars(Map<String, VarNode> argVars) {
        this.argVars = argVars;
    }

    public Map<String, VarNode> getLocalVars() {
        return localVars;
    }

    public void setLocalVars(Map<String, VarNode> localVars) {
        this.localVars = localVars;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }
}
