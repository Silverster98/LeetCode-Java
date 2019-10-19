package com.silvester.LCK;

/**
 * LC1042
 */
public class LC1042 {

    public int[] gardenNoAdj(int N, int[][] paths) {
        int[][] g = new int[N][3];
        int[] p = new int[N];
        for (int i = 0; i < N; i++) p[i] = 0;
        for (int i = 0; i < paths.length; i++) {
            int a = paths[i][0] - 1;
            int b = paths[i][1] - 1;
            
            g[a][p[a]++] = b;
            g[b][p[b]++] = a;
        }

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) ans[i] = -1;
        ans[0] = 0;
        for (int i = 1; i < N; i++) {
            int[] tag = new int[]{0,0,0,0};
            for (int j = 0; j < p[i]; j++) {
                int col = ans[g[i][j]];
                if (col != -1) tag[col] = 1;
            }
            for (int j = 0; j < 4; j++) {
                if (tag[j] == 0) {
                    ans[i] = j;
                    break;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            ans[i] = ans[i] + 1;
            // System.out.println(ans[i]);
        }
        return ans;
    }
}