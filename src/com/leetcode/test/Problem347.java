package com.leetcode.test;

import java.util.*;

public class Problem347 {
//    public List<Integer> topKFrequent(int[] nums, int k) {
//        HashMap<Integer, Integer> count = new HashMap();
//        for (int n: nums) {
//            count.put(n, count.getOrDefault(n, 0) + 1);
//        }
//
//        PriorityQueue<Integer> heap =
//                new PriorityQueue<Integer>((n1, n2) -> count.get(n1) - count.get(n2));
//
//        for (int n: count.keySet()) {
//            heap.add(n);
//            if (heap.size() > k)
//                heap.poll();
//        }
//
//        List<Integer> top_k = new LinkedList();
//        while (!heap.isEmpty())
//            top_k.add(heap.poll());
//        Collections.reverse(top_k);
//        return top_k;
//    }
    public List<Integer> topKFrequent(int[] nums, int k){
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> count.get(n1)-count.get(n2));

        for (int n : count.keySet()){
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }
        List<Integer> top_k = new LinkedList<>();
        while (!heap.isEmpty())
            top_k.add(heap.poll());
        Collections.reverse(top_k);
        return top_k;
    }
    //使用hashmap统计每个数出现的次数，然后采用优先队列PriorityQueue按出现次数升降存放，并且保证优先队列里只有k个数
}
