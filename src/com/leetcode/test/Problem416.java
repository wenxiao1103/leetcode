package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/19 9:28 下午
 *
 * 416. 分割等和子集
 */
public class Problem416 {

//    public boolean canPartition(int[] nums) {
//        int sum = 0;
//        for(int i = 0; i<nums.length; i++) sum += nums[i];
//        if(sum % 2 != 0) return false;
//        sum = sum/2;
//        boolean[][] dp = new boolean[nums.length+1][sum+1];
//        for(int i = 0; i<nums.length+1; i++) dp[i][0] = true;
//        for(int i = 0; i<sum+1; i++) dp[0][i] = false;
//
//
//        for(int i = 1; i<=nums.length; i++){
//            for(int j = 1; j<=sum; j++){
//                if(j < nums[i-1]) dp[i][j] = dp[i-1][j];
//                else{
//                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
//                }
//            }
//        }
//        return dp[nums.length][sum];
//    }
//    public boolean canPartition(int[] nums) {
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) sum += nums[i];
//        if (sum % 2 != 0) return false;
//        sum /= 2;
//        boolean[][] dp = new boolean[nums.length+1][sum+1];
//        for (int i = 0; i < nums.length + 1; i++) dp[i][0] = true;
//
//        for (int i = 1; i <= nums.length; i++) {
//            for (int j = 1; j <= sum; j++) {
//                if(j < nums[i-1]){
//                    dp[i][j] = dp[i-1][j];
//                }
//                else {
//                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
//                }
//            }
//        }
//        return dp[nums.length][sum];
//    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];
        if (sum % 2 != 0) return false;
        sum /= 2;
        boolean[][] dp = new boolean[nums.length+1][sum+1];
        for (int i = 0; i < nums.length + 1; i++) dp[i][0] = true;
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j < nums[i-1]) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[nums.length][sum];
    }

}
