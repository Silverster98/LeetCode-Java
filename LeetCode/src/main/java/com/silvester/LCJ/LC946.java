package com.silvester.LCJ;

import java.util.Stack;

/**
 * LC946
 */
public class LC946 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<Integer>();

        int i;
        int index = 0;
        for (i = 0; i < popped.length; ) {
            if (!stack.empty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
                continue;
            }

            int flag = 0;
            while(pushed[index] != popped[i]) {
                stack.push(pushed[index]);
                index++;
                if (index == pushed.length) {
                    flag = 1;
                    break;
                }
            }

            i++;
            index++;

            if (index == pushed.length || flag == 1) break;
        }
        
        int tag = 0;
        while(!stack.empty()) {
            if (stack.pop() != popped[i++]) {
                tag = 1;
                break;
            }
        }
        if (i != popped.length) tag = 1;
        return tag == 0;
    }
}