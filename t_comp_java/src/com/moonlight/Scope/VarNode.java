package com.moonlight.Scope;

/**
 * Created by Alexander on 08/12/15.
 */
public class VarNode {
    private String type;
    private int index;

    public VarNode(String type, int index) {
        setType(type);
        setIndex(index);
    }

    @Override
    public String toString() {
        return String.format("%s, %d", type, index);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
