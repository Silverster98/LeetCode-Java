package com.silvester.LCJ;

/**
 * LC997
 */
public class LC997 {

    public int findJudge(int N, int[][] trust) {
        int[][] map = new int[N + 1][N + 1];
        for (int i = 0; i < N + 1; i++)
            for (int j = 0; j < N + 1; j++)
                map[i][j] = 0;
        
        for (int i = 0; i < trust.length; i++) {
            map[trust[i][0]][trust[i][1]] = 1;
        }

        int judge = -1;
        for (int i = 1; i <= N; i++) {
            if (trustNobody(map[i])) {
                int tag = 0;
                for (int j = 1; j <= N; j++) {
                    if (i == j) continue;
                    if (map[j][i] == 0) {
                        tag = 1;
                        break;
                    }
                }

                if (tag == 0) {
                    if (judge == -1) judge = i;
                    else {
                        judge = -1;
                        break;
                    }
                }
            }
        }
        return judge;
    }

    public boolean trustNobody(int[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i] == 1) return false;
        }
        return true;
    }
}