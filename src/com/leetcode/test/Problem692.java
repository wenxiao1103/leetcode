package com.leetcode.test;

import java.util.*;

/**
 * @author xiaowen
 * @date 2020/10/21 10:10 下午
 */
public class Problem692 {
//    public List<String> topKFrequent(String[] words, int k) {
//        Map<String, Integer> count = new HashMap();
//        for (String word: words) {
//            count.put(word, count.getOrDefault(word, 0) + 1);
//        }
//        List<String> candidates = new ArrayList(count.keySet());
//        Collections.sort(candidates, (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
//                w1.compareTo(w2) : count.get(w2) - count.get(w1));
//
//        return candidates.subList(0, k);
//    }
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> count = new HashMap<>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        List<String> candidates = new ArrayList<>(count.keySet());
        Collections.sort(candidates, (w1, w2) -> count.get(w1).equals(count.get(w2)) ? w1.compareTo(w2) : count.get(w2) - count.get(w1));
        return candidates.subList(0, k);
    }
}
