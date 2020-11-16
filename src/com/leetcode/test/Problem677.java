package com.leetcode.test;

import java.util.HashMap;

/**
 * @author xiaowen
 * @date 2020/10/20 11:03 下午
 *
 * 677. 键值映射
 */
public class Problem677 {
//    public class MapSum {
//        HashMap<String, Integer> map;
//
//        public MapSum() {
//            map = new HashMap<>();
//        }
//
//        public void insert(String key, int val) {
//            map.put(key, val);
//        }
//
//        public int sum(String prefix) {
//            int sum = 0;
//            for (String s : map.keySet()) {
//                if (s.startsWith(prefix)) {
//                    sum += map.get(s);
//                }
//            }
//            return sum;
//        }
//    }
    public class MapSum {
        HashMap<String, Integer> map;
        public MapSum() {
            map = new HashMap<>();
        }
        public void insert(String key, int val) {
            map.put(key, val);
        }
        public int sum(String prefix) {
            int sum = 0;
            for (String s : map.keySet()) {
                if (s.startsWith(prefix)) {
                    sum += map.get(s);
                }
            }
            return sum;
        }
    }
}
