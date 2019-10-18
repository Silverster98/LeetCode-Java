package com.silvester.LCL;

import java.util.ArrayList;
import java.util.List;

/**
 * LC1106
 */
public class LC1106 {

    public boolean parseBoolExpr(String expression) {
        return boolExpr(expression);
    }

    public boolean boolExpr(String exp) {
        if (exp.charAt(0) == 'f') return false;
        if (exp.charAt(0) == 't') return true;

        String t = exp.substring(2, exp.length());
        String[] g = groupExp(t);
        if (exp.charAt(0) == '!') {
            return !boolExpr(g[0]);
        }

        if (exp.charAt(0) == '&') {
            boolean ans = true;
            for (int i = 0; i < g.length; i++){
                ans = ans & boolExpr(g[i]);
            }
            return ans;
        }

        if (exp.charAt(0) == '|') {
            boolean ans = false;
            for (int i = 0; i < g.length; i++){
                ans = ans | boolExpr(g[i]);
            }
            return ans;
        }
        return false;
    }

    public String[] groupExp(String exp) {
        List<String> list = new ArrayList<String>();
        int left = 0;
        int begin = 0;
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(') left ++;
            else if (exp.charAt(i) == ')') left --;
            else if (exp.charAt(i) == ',') {
                if (left == 0) {
                    list.add(exp.substring(begin, i));
                    begin = i + 1;
                }
            }

            if (i == exp.length() - 1) list.add(exp.substring(begin, i + 1));
        }
        String[] ans = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main( String[] args )
    {
        LC1106 lc = new LC1106();
        String[] a = lc.groupExp("t,t");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}