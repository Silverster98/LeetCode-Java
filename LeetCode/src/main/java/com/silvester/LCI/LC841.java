package com.silvester.LCI;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LC841
 */
public class LC841 {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] access = new int[rooms.size()];
        for (int i = 0; i < access.length; i++) access[i] = 0;
        access[0] = 1;

        Queue<Integer> que = new LinkedList<Integer>();
        for (Integer key: rooms.get(0)) {
            if (key != 0) que.add(key);
        }

        while (!que.isEmpty()) {
            int room = que.poll();
            if (access[room] == 1) continue;
            
            for (Integer k : rooms.get(room)) {
                if (access[k] == 0) que.add(k);
            }

            access[room] = 1;
        }

        for (int i = 0; i < access.length; i++) {
            if (access[i] == 0) return false;
        }
        return true;
    }
}