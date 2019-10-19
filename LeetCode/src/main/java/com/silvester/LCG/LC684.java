package com.silvester.LCG;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * LC684
 */
public class LC684 {

    /*
     * algorithm 1: DFS         TIME: O(E*N)
     * algorithm 2: Union-Find  TIME: O()
     */
    
    /**
     * DFS
     */
    Set<Integer> set = new HashSet<Integer>();
    public int[] findRedundantConnection(int[][] edges) {
        int N = edges.length;
        ArrayList<Integer>[] g = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++)
            g[i] = new ArrayList<Integer>();

        for (int i = 0; i < edges.length; i++) {
            if (dfs(g, edges[i][0], edges[i][1])) return edges[i];
            g[edges[i][0]].add(edges[i][1]);
            g[edges[i][1]].add(edges[i][0]);
            set.clear();
        }
        
        return null;
    }

    public boolean dfs(ArrayList<Integer>[] g, int s, int d) {
        if (!set.contains(s)) {
            if (s == d) return true;
            set.add(s);
            for(Integer next: g[s]) {
                if (dfs(g, next, d)) return true;
            }
        }
        return false;
    }

    /**
     * Union-Find
     */
    /*
    int [] father;
    int N;
    public int[] findRedundantConnection(int[][] edges) {
        N = edges.length;
        father = new int[N + 1];
        for (int i = 0; i <= N; i++) father[i] = i;

        for (int i = 0; i < edges.length; i++) {
            int f1 = find(edges[i][0]);
            int f2 = find(edges[i][1]);
            if (f1 == f2) return edges[i];

            father[f1] = f2;
        }
        return new int[]{0,0};
    }

    int find(int node) {
        if (node == father[node]) return node;
        else return father[node] = find(father[node]);
    } */
}