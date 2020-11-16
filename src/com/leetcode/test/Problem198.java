package com.leetcode.test;
//打家劫舍
public class Problem198 {
//    public int rob(int[] nums) {
//        if(nums == null || nums.length == 0)
//            return 0;
//        if(nums.length == 1)
//            return nums[0];
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        dp[1] = Math.max(nums[0], nums[1]);
//        for(int i = 2; i < nums.length; i++){
//            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
//        }
//        return dp[nums.length-1];
//    }
    public int rob(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
    //所有房子围成一圈，相对于problem198打家劫舍来说，分成了两种情况，一种从0到n-1，一种从1到n
}
