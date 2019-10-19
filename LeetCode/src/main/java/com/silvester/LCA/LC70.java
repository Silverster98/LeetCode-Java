package com.silvester.LCA;

/**
 * LC70
 */
public class LC70 {

    public int climbStairs(int n) {
        int[] ans = new int[n + 1];
        if (n == 1) return 1;
        ans[1] = 1;
        ans[2] = 2;
        for (int i = 3; i <= n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n];
    }
}