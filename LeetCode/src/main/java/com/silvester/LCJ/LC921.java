package com.silvester.LCJ;

import java.util.Stack;
/**
 * LC921
 */
public class LC921 {

    public int minAddToMakeValid(String S) {
        Stack<Character> s = new Stack<Character>();
        int cnt = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') s.push('(');
            else if (S.charAt(i) == ')') {
                if (!s.empty()) s.pop();
                else cnt ++;
            }
        }

        cnt += s.size();
        return cnt;
    }
}