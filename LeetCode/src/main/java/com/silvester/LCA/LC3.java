package com.silvester.LCA;

/**
 * LC3
 * O(n^2)
 */
public class LC3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int[] array = new int[s.length()];
        
        array[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            int pos = array[i-1];
            for (int j = i - 1; j >= i - array[i-1]; j--) {
                if (s.charAt(j) == s.charAt(i)) {
                    pos = i - 1 - j;
                    break;
                }
            }
            array[i] = pos + 1;
        }

        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
}