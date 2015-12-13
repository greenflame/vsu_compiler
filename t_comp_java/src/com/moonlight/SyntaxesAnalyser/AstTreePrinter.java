package com.moonlight.SyntaxesAnalyser;

import java.io.UnsupportedEncodingException;
import org.antlr.runtime.tree.Tree;
/**
 *
 * @author vlad
 */
public class AstTreePrinter
{
    public static final int connectCharDosCode  = 0xB3;
    public static final int middleNodeCharDosCode = 0xC3;
    public static final int lastNodeCharDosCode   = 0xC0;

    public static char connectChar    = '|';
    public static char middleNodeChar = '*';
    public static char lastNodeChar   = '-';

    public AstTreePrinter() {
        try {
            this.connectChar = (new String(Integer.toString(connectCharDosCode).getBytes("UTF-8"),"CP866")).charAt(0);
            this.middleNodeChar = (new String(Integer.toString(middleNodeCharDosCode).getBytes("UTF-8"),"CP866")).charAt(0);
            this.lastNodeChar = (new String(Integer.toString(lastNodeCharDosCode).getBytes("UTF-8"),"CP866")).charAt(0);
        } catch (UnsupportedEncodingException e) {}
    }

    private static String getStringSubTree(Tree node, String indent, boolean root) {
        if (node == null)
            return "";

        String result = indent;
        if (!root)
            if(node.getChildIndex() < node.getParent().getChildCount() - 1) {
                result += middleNodeChar + " ";
                indent += connectChar + " ";
            } else {
                result += lastNodeChar + " ";
                indent += "  ";
            }
        result += node.toString() + "\n";
        for(int i = 0; i < node.getChildCount(); i++)
            result += getStringSubTree(node.getChild(i), indent, false);

        return result;
    }

    public static String astNodeToAdvancedDosStringTree(Tree node) {
        return getStringSubTree(node, "", true);
    }

    public static void print(Tree node) {
        String tree = astNodeToAdvancedDosStringTree(node);
        System.out.println(tree);
    }
}
