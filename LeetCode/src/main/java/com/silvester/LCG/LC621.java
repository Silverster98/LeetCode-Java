package com.silvester.LCG;

import java.util.Arrays;

/**
 * LC621
 * 
 * best: O(1)
 * worst: O(tasks.size/(n+1))
 */
public class LC621 {

    public int leastInterval(char[] tasks, int n) {
        int[] taskCount = new int[26];
        for (int i = 0; i < 26; i++) {
            taskCount[i] = 0;
        }

        for (int i = 0; i < tasks.length; i++) {
            int pos = tasks[i] - 'A';
            taskCount[pos] ++;
        }

        int total = 0;

        while (true) {
            Arrays.sort(taskCount);
            for (int i = 0; i < 26/2; i++) {
                int temp = taskCount[i];
                taskCount[i] = taskCount[25-i];
                taskCount[25-i] = temp;
            }
            int limit = n + 1;
            for (int i = 0; i < 26; i++) {
                if (taskCount[i] > 0) {
                    limit --;
                    taskCount[i] --;
                }
                if (limit == 0) break;
            }
            // System.out.println(total + " - " + limit);
            if (limit == 0) {
                total += (n + 1);
            } else {
                int max = 0;
                int maxCount = 0;
                for (int i = 0; i < 26; i++) {
                    if (max < taskCount[i]) {
                        max = taskCount[i];
                        maxCount = 0;
                    }
                    if (max == taskCount[i] && max != 0) maxCount++;
                }
                // System.out.println(max + " " + maxCount);
                if (limit != n + 1) {
                    if (max == 0) total += n + 1 - limit;
                    else total += (n + 1);
                } 
                if (max != 0) total += ((max - 1) * (n + 1) + maxCount);

                break;
            }
        }
        return total;
    }
}