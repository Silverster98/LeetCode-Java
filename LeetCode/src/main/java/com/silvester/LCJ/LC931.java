package com.silvester.LCJ;

/**
 * LC931
 */
public class LC931 {

    public int minFallingPathSum(int[][] A) {
        int N = A.length;
        if (N == 1) return A[0][0];
        int[][] ans = new int[N][N];
        for (int i = 0; i < N; i++) {
            ans[0][i] = A[0][i];
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == 0) {
                    ans[i][j] = findMin(ans[i-1][j], ans[i-1][j+1]) + A[i][j];
                    continue;
                }
                if (j == N - 1) {
                    ans[i][j] = findMin(ans[i-1][j-1], ans[i-1][j]) + A[i][j];
                    continue;
                }

                ans[i][j] = findMin(ans[i-1][j-1], ans[i-1][j], ans[i-1][j+1]) + A[i][j];
            }
        }
        int min = ans[N-1][0];
        for (int i = 1; i < N; i++) {
            if (min > ans[N-1][i]) min = ans[N-1][i];
        }
        return min;
    }

    public int findMin(int a, int b) {
        return a < b ? a : b;
    }

    public int findMin(int a, int b, int c) {
        return a < b ? (a < c ? a : c) : (b < c ? b : c); 
    }

    
}