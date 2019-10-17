package com.silvester.LCA;
import java.util.HashMap;
/**
 * LC1
 * O(n)
 */
public class LC1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int vb = target - nums[i];
            if (map.get(vb) != null && map.get(vb) != i) {
                return new int[]{i, map.get(vb)};
            }
        }
        return new int[]{0, 0};
    }
}