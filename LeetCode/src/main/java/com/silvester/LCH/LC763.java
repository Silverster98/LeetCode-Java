package com.silvester.LCH;

import java.util.ArrayList;
import java.util.List;
/**
 * LC763
 * 
 * O(n)
 */
public class LC763 {

    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < 26; i++) {
            last[i] = 0;
        }

        for (int i = 0; i < S.length(); i++) {
            last[S.charAt(i) - 'a'] = i;
        }

        List<Integer> list = new ArrayList<Integer>();
        int[] ans = new int[26];
        int max = 0, index = 0;
        for (int i = 0; i < S.length(); i++) {
            if (max < last[S.charAt(i) - 'a']) max = last[S.charAt(i) - 'a'];
            if (i < max) continue;
            else if (i == max) ans[index++] = max;
        }

        for (int i = index - 1; i > 0; i--) {
            ans[i] = ans[i] - ans[i-1];
        }
        ans[0] += 1;

        for (int i = 0; i < index; i++) {
            list.add(ans[i]);
        }
        
        return list;
    }
}