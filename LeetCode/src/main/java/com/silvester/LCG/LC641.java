package com.silvester.LCG;

/**
 * LC641
 */
public class LC641 {

    /** Initialize your data structure here. Set the size of the deque to be k. */
    private int[] deque;
    private int head;
    private int tail;
    private int length;
    private int cap;
    public LC641(int k) {
        deque = new int[k];
        head = k - 1;
        tail = k - 1;
        length = 0;
        cap = k;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (length >= cap) return false;
        head = (++head) % cap;
        deque[head] = value;
        length++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (length >= cap) return false;
        deque[tail] = value;
        tail = ((tail - 1) + cap) % cap;
        // System.out.println("tail: " + tail);
        length++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (length == 0) return false;
        head = ((head - 1) + cap) % cap;
        length--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (length == 0) return false;
        tail = (++tail) % cap;
        length--;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if (length == 0) return -1;
        return deque[head];
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if (length == 0) return -1;
        return deque[(tail + 1) % cap];
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return length == 0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return length == cap;
    }
}