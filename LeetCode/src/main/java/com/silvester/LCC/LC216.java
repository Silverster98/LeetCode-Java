package com.silvester.LCC;

import java.util.List;
import java.util.ArrayList;
import java.lang.Math;;
/**
 * LC216
 */
public class LC216 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        return combinationSumk(k, n, 0);
    }

    public List<List<Integer>> combinationSumk(int k, int n, int b) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (k == 1) {
            if (n > b && n <= 9) {
                List<Integer> next = new ArrayList<Integer>();
                next.add(n);
                ans.add(next);
            }
            return ans;
        }
        
        for (int i = b + 1; i < Math.max(n/k, 10); i++) {
            List<List<Integer>> temp = combinationSumk(k-1, n - i, i);
            for(List<Integer> l: temp) {
                l.add(0, i);
                ans.add(l);
            }
        }
        return ans;
    }
}