package com.silvester.LCI;

/**
 * LC877
 */
public class LC877 {

    public boolean stoneGame(int[] piles) {
        int N = piles.length;
        int[][] ans = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) ans[i][i] = 0 - piles[i-1];

        for (int len = 2; len <= N; len++) {
            for (int i = 1; i <= N - len + 1; i++) {
                if (len % 2 == 0) ans[i][i+len-1] = Math.max(piles[i-1] + ans[i+1][i+len-1], piles[i+len-2] + ans[i][i+len-2]);
                else ans[i][i+len-1] = Math.min(ans[i+1][i+len-1] - piles[i-1], ans[i][i+len-2] - piles[i+len-2]);
            }
        }

        // for (int len = 1; len <= N; len++) {
        //     for (int i = 1; i <= N - len + 1; i++) {
        //         System.out.print(ans[i][i+len-1] + " ");
        //     }
        //     System.out.println();
        // }
        return ans[1][N] > 0;
    }
}