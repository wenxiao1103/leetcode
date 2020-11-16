package com.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/8/27 9:45 下午
 *
 * 1553. 吃掉 N 个橘子的最少天数
 */
public class Problem1553 {
//    Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
//
//    public int minDays(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        if (memo.containsKey(n)) {
//            return memo.get(n);
//        }
//        memo.put(n, Math.min(n % 2 + 1 + minDays(n / 2), n % 3 + 1 + minDays(n / 3)));
//        return memo.get(n);
//    }
    Map<Integer, Integer> memo = new HashMap<>();

    public int minDays(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) return memo.get(n);
        memo.put(n, Math.min(n%2 + 1 + minDays(n/2), n%3 + 1 + minDays(n / 3)));
        return memo.get(n);
    }
}
