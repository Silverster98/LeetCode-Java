package com.silvester.LCB;

import java.util.ArrayList;
import java.util.List;

/**
 * LC155
 */
public class LC155 {

    private List<Integer> list;
    private int size;
    private int min;

    public LC155() {
        list = new ArrayList<Integer>();
        size = 0;
    }
    
    public void push(int x) {
        if (size++ == 0) min = x;
        else if (min > x) min = x;
        list.add(x);
    }
    
    public void pop() {
        if (size == 0) return;
        int r = list.get(--size);
        if (r == min && size != 0) {
            min = list.get(0);
            for (int i = 0; i < size; i++) min = (min > list.get(i)) ? list.get(i) : min;
        }
        
        list.remove(size);
    }
    
    public int top() {
        return list.get(size-1);
    }
    
    public int getMin() {
        return size == 0 ? 0 : min;
    }
}