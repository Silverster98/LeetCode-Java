package com.silvester.LCK;

import java.util.*;
/**
 * LC1090
 * 
 * TIME: O(nlogn) ?
 * 
 * MEM: O(maxLabel + n)
 */
public class LC1090 {

    class VL implements Comparable<VL>{
        int value;
        int label;
        public VL(int v, int l) {
            this.value = v;
            this.label = l;
        }
        public int compareTo(VL o) {
            // TODO Auto-generated method stub
            return o.value - this.value;
        }
    }
    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
        int[] labelCount = new int[20001];
        for (int i = 0; i < 20001; i++) {
            labelCount[i] = 0;
        }
        Queue<VL> pq = new PriorityQueue<VL>();;
        for (int i = 0; i < values.length; i++) {
            pq.add(new VL(values[i], labels[i]));
        }
        int total = 0;
        // System.out.println(pq.size());
        while(num_wanted > 0) {
            VL vl = pq.poll();
            if (vl != null) {
                // System.out.println(vl.value + " " + vl.label);
                if (labelCount[vl.label] + 1 > use_limit) continue;
                else {
                    total += vl.value;
                    labelCount[vl.label] += 1;
                    num_wanted --;
                }
            } else {
                break;
            }
        }
        return total;
    }
}