package com.leetcode.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author xiaowen
 * @date 2020/9/12 5:54 下午
 *
 * 1557. 可以到达所有点的最少点数目
 */
public class Problem1557 {
//    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
//        List<Integer> ans = new ArrayList<Integer>();
//        Set<Integer> endSet = new HashSet<Integer>();
//        for (List<Integer> edge : edges) {
//            endSet.add(edge.get(1));
//        }
//        for (int i = 0; i < n; i++) {
//            if (!endSet.contains(i)) {
//                ans.add(i);
//            }
//        }
//        return ans;
//    }
    public List<Integer> findSamllestSerOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> endSet = new HashSet<>();
        for (List<Integer> edge : edges) {
            endSet.add(edge.get(1));
        }
        for (int i = 0; i < n; i++){
            if (!endSet.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }//其实就是入度为0的节点的集合
}
