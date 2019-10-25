package com.silvester.LCK;

/**
 * LC1016
 */
public class LC1016 {

    public boolean queryString(String S, int N) {
        if (N > S.length()) return false;

        for (int i = ((N >> 1) + 1); i <= N; i++) {
            if (!testX(S, i)) return false;
        }
        return true;

    }
    
    public boolean testX(String S, int X) {
        String s = Integer.toBinaryString(X);
        return S.indexOf(s) >= 0;
    }
}

