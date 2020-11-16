package com.leetcode.dp;

/**
 * @author xiaowen
 * @date 2020/8/27 11:40 下午
 */
public class Problem343 {
//    public int integerBreak(int n) {
//        int[] dp = new int[n + 1];
//        for (int i = 2; i <= n; i++) {
//            int curMax = 0;
//            for (int j = 1; j < i; j++) {
//                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
//            }
//            dp[i] = curMax;
//        }
//        return dp[n];
//    }
    //方法一，动态规划
//    public int integerBreak(int n) {
//        if (n < 4) {
//            return n - 1;
//        }
//        int[] dp = new int[n + 1];
//        dp[2] = 1;
//        for (int i = 3; i <= n; i++) {
//            dp[i] = Math.max(Math.max(2 * (i - 2), 2 * dp[i - 2]), Math.max(3 * (i - 3), 3 * dp[i - 3]));
//        }
//        return dp[n];
//    }
    //方法二. 动态规划优化
    public int integerBreak(int n) {
        if (n < 4) {
            return n - 1;
        }
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(Math.max(2 * (i - 2), 2 * dp[i-2]), Math.max(3 * (i - 3), 3 * dp[i-3]));
        }
        return dp[n];
    }
}
