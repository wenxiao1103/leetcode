package com.leetcode.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/11/24 10:31 下午
 *
 * 996. 正方形数组的数目
 */
public class Problem996 {
//    Map<Integer, Integer> count;
//    Map<Integer, List<Integer>> graph;
//    public int numSquarefulPerms(int[] A) {
//        int N = A.length;
//        count = new HashMap();
//        graph = new HashMap();
//        for (int x: A)
//            count.put(x, count.getOrDefault(x, 0) + 1);
//        for (int x: count.keySet())
//            graph.put(x, new ArrayList());
//        for (int x: count.keySet())
//            for (int y: count.keySet()) {
//                int r = (int) (Math.sqrt(x + y) + 0.5);
//                if (r * r == x + y)
//                    graph.get(x).add(y);
//            }
//        int ans = 0;
//        for (int x: count.keySet())
//            ans += dfs(x, N - 1);
//        return ans;
//    }
//    public int dfs(int x, int todo) {
//        count.put(x, count.get(x) - 1);
//        int ans = 1;
//        if (todo != 0) {
//            ans = 0;
//            for (int y: graph.get(x)) if (count.get(y) != 0) {
//                ans += dfs(y, todo - 1);
//            }
//        }
//        count.put(x, count.get(x) + 1);
//        return ans;
//    }
    Map<Integer, Integer> count;
    Map<Integer, List<Integer>> graph;
    public int numSquarefulPerms(int[] A) {
        int N = A.length;
        count = new HashMap<>();
        graph = new HashMap<>();
        for (int x : A) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        for (int x : count.keySet()) {
            graph.put(x, new ArrayList<>());
        }
        for (int x : count.keySet()) {
            for (int y : count.keySet()) {
                int r = (int) (Math.sqrt(x + y) + 0.5);
                if (r * r == x + y)
                    graph.get(x).add(y);
            }
        }
        int ans = 0;
        for (int x : count.keySet()) {
            ans += dfs(x, N - 1);
        }
        return ans;
    }
//    public int dfs(int x, int todo) {
//        count.put(x, count.get(x) - 1);
//        int ans = 1;
//        if (todo != 0) {
//            ans = 0;
//            for (int y : graph.get(x)) if (count.get(y) != 0) {
//                ans += dfs(y, todo - 1);
//            }
//        }
//        count.put(x, count.get(x) + 1);
//        return ans;
//    }
    public int dfs(int x, int num) {
        count.put(x, count.get(x) - 1);
        int ans = 1;
        if (num != 0) {
            ans = 0;
            for (int y : graph.get(x)) {
                if (count.get(y) != 0) {
                    ans += dfs(y, num-1);
                }
            }
        }
        count.put(x, count.get(x) + 1);
        return ans;
    }
}
