package com.moonlight.CodeGenerator;

import com.moonlight.Scope.Scope;
import org.antlr.runtime.tree.Tree;

/**
 * Created by Alexander on 07/12/15.
 */
public class CodeGenerator {
    private Scope scope;

    public CodeGenerator(Scope scope) {
        setScope(scope);
    }

    public String generate(Tree node) {

    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
}
