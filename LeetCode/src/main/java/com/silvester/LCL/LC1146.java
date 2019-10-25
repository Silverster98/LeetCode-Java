package com.silvester.LCL;

import java.util.ArrayList;
import java.util.List;
/**
 * LC1146
 */
public class LC1146 {

    class Node {
        int index;
        int val;
        public Node(int a, int b) {
            index = a;
            val = b;
        }
    }
    
    private List<Node>[] array;
    private int snap;
    public LC1146(int length) {
        array = new ArrayList[length];
        for (int i = 0; i < length; i++) array[i] = new ArrayList<LC1146.Node>();
        for (int i = 0; i < length; i++) array[i].add(new Node(0, 0));
        snap = 0;
    }
    
    public void set(int index, int val) {
        if (snap == array[index].get(array[index].size() - 1).index) {
            array[index].remove(array[index].size() - 1);
        }
        array[index].add(new Node(snap, val));
    }
    
    public int snap() {
        return snap++;
    }
    
    public int get(int index, int snap_id) {
        int i;
        for (i = array[index].size() - 1; i >= 0; i--) {
            if (array[index].get(i).index > snap_id) continue;
            else break;
        }
        return array[index].get(i).val;
    }
}