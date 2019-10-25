package com.silvester.LCF;

import java.util.Arrays;

/**
 * LC581
 */
public class LC581 {

    public int findUnsortedSubarray(int[] nums) {
        int[] t = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            t[i] = nums[i];
        }

        Arrays.sort(t);
        int i, j;
        for (i = 0; i < nums.length; i++) 
            if (t[i] != nums[i]) break;

        for (j = nums.length - 1; j >= 0; j--) 
            if (t[j] != nums[j]) break;
        // System.out.println(i + " " + j);
        return j > i ? j - i + 1 : 0;
    }
}