package com.silvester.LCK;

/**
 * LC1094
 * TIME:O(trips.length * maxDistance)
 * 
 * MEM:O(maxDistance)
 */
public class LC1094 {

    public boolean carPooling(int[][] trips, int capacity) {
        int[] line = new int[1001];
        for (int i = 0; i < 1001; i++) {
            line[i] = 0;

            for (int p = 0 ; p < trips.length; p++) {
                // System.out.println(trips[p][0] + " " + trips[p][1] + " " + trips[p][2]);
                if (trips[p][1] <= i && i < trips[p][2]) {
                    // System.out.println("[" + i + "] " + trips[p][0] + " " + trips[p][1] + " " + trips[p][2]);
                    line[i] += trips[p][0];
                } 
            }
        }

        // for (int i = 0; i < 10; i++) {
        //     System.out.println(line[i]);
        // }
        for (int i = 0; i < 1001; i++) {
            if (line[i] > capacity) return false;
        }
        return true;
    }
}