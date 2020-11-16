package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/5 8:55 下午
 *
 * 518. 零钱兑换 II
 */
public class Problem518 {
//    public int change(int amount, int[] coins) {
//        int[] dp = new int[amount + 1];
//        dp[0] = 1;
//
//        for (int coin : coins) {
//            for (int x = coin; x < amount + 1; ++x) {
//                dp[x] += dp[x - coin];
//            }
//        }
//        return dp[amount];
//    }
//    public int change(int amount, int[] coins) {
//        int[] dp = new int[amount + 1];
//        dp[0] = 1;
//        for (int coin : coins) {
//            for (int x = coin; x < amount + 1; x++) {
//                dp[x] += dp[x - coin];
//            }
//        }
//        return dp[amount];
//    }
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int x = coin; x < amount + 1; x++) {
                dp[x] += dp[x-coin];
            }
        }
        return dp[amount];
    }
}