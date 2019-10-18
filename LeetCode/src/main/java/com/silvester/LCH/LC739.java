package com.silvester.LCH;

import java.util.Stack;

/**
 * LC739
 */
public class LC739 {

    class Node {
        int index;
        int value;
        public Node(int i, int v) {
            index = i;
            value = v;
        }
    }
    
    public int[] dailyTemperatures(int[] T) {
        Stack<Node> s = new Stack<Node>();
        int[] ans = new int[T.length];

        for (int i = 0; i < T.length; i++) {
            if (s.empty()) {
                s.push(new Node(i, T[i]));
                continue;
            }
            
            while(T[i] > s.peek().value) {
                Node n = s.pop();
                ans[n.index] = i - n.index;
                if (s.empty()) break;
            }

            s.push(new Node(i, T[i]));
        }

        while(!s.empty()) {
            ans[s.pop().index] = 0;
        }

        // for (int i = 0; i < T.length; i++) {
        //     System.out.println(ans[i]);
        // }
        return ans;
    }
}