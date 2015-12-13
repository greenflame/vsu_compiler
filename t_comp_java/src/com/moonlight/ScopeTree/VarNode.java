package com.moonlight.ScopeTree;

/**
 * Created by Alexander on 08/12/15.
 */
public class VarNode {
    private String type;
    private int index;
    private VarLocation location;

    public VarNode(String type, int index, VarLocation decType) {
        setType(type);
        setIndex(index);
        setLocation(decType);
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s", type, index, location);
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

    public VarLocation getLocation() {
        return location;
    }

    public void setLocation(VarLocation location) {
        this.location = location;
    }
}
