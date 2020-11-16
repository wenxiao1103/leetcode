package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/6 10:08 下午
 *
 * 377.组合总和4
 */
public class Problem377 {
//    public int combinationSum4(int[] nums, int target) {
//        int[] dp = new int[target + 1];
//        // 这个值被其它状态参考，设置为 1 是合理的
//        dp[0] = 1;
//
//        for (int i = 1; i <= target; i++) {
//            for (int num : nums) {
//                if (num <= i) {
//                    dp[i] += dp[i - num];
//                }
//            }
//        }
//        return dp[target];
//    }
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if(num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }
}
