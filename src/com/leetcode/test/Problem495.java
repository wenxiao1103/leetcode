package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/5 8:01 下午
 *
 * 495. 提莫攻击
 */
public class Problem495 {
//    public int findPoisonedDuration(int[] timeSeries, int duration) {
//        int n = timeSeries.length;
//        if (n == 0) return 0;
//
//        int total = 0;
//        for(int i = 0; i < n - 1; ++i)
//            total += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
//        return total + duration;
//    }
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        if (n == 0) return 0;
        int total = 0;
        for (int i = 0; i < n - 1; i++) {
            total += Math.min(timeSeries[i+1] - timeSeries[i], duration);
        }
        return total + duration;
    }
}
