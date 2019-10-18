package com.silvester.LCH;

/**
 * LC709
 */
public class LC709 {

    // public String toLowerCase(String str) {
    //     return str.toLowerCase();
    // }

    public String toLowerCase(String str) {
        char[] t = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            t[i] = (char)(str.charAt(i) | 32);
        }
        return new String(t);
    }
}