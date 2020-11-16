package com.leetcode.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/9/29 10:42 下午
 */
public class Problem318 {

//    public int bitNumber(char ch){
//        return (int)ch - (int)'a';
//    }
//    public int maxProduct(String[] words) {
//        Map<Integer, Integer> hashmap = new HashMap();
//        int bitmask = 0, bitNum = 0;
//        for (String word : words) {
//            bitmask = 0;
//            for (char ch : word.toCharArray()) {
//                bitmask |= 1 << bitNumber(ch);
//            }
//            hashmap.put(bitmask, Math.max(hashmap.getOrDefault(bitmask, 0), word.length()));
//        }
//        int maxProd = 0;
//        for (int x : hashmap.keySet())
//            for (int y : hashmap.keySet())
//                if ((x & y) == 0) maxProd = Math.max(maxProd, hashmap.get(x) * hashmap.get(y));
//        return maxProd;
//    }
    public int bitNumber(char ch) {
        return (int)ch - (int)'a';
    }
    public int maxProduct(String[] words) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        int bitmask = 0, bitNum = 0;
        for (String word : words) {
            bitmask = 0;
            for (char ch : word.toCharArray()) {
                bitmask |= 1 << bitNumber(ch);
            }
            hashmap.put(bitmask, Math.max(hashmap.getOrDefault(bitmask, 0), word.length()));
        }
        int maxProd = 0;
        for (int x : hashmap.keySet())
            for (int y : hashmap.keySet())
                if ((x & y) == 0) maxProd = Math.max(maxProd, hashmap.get(x) * hashmap.get(y));
        return maxProd;
    }
}
