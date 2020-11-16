package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/12 7:02 下午
 *
 * 1567. 乘积为正数的最长子数组长度
 */
public class Problem1567 {

//    public int getMaxLen(int[] nums) {
//        int n=nums.length;
//        int [][] dp=new int[n][2];
//        int res=0;
//        if(nums[0]>0){
//            dp[0][0]=1;
//        }else if(nums[0]<0){
//            dp[0][1]=1;
//        }
//        for(int i=1;i<n;i++){
//            if(nums[i]>0){
//                dp[i][0]=dp[i-1][0]+1;
//                if(dp[i-1][1]>0) dp[i][1]=dp[i-1][1]+1;
//            }else if(nums[i]<0){
//                if(dp[i-1][1]>0) dp[i][0]=dp[i-1][1]+1;
//                dp[i][1]=dp[i-1][0]+1;
//            }
//        }
//        for(int i=0;i<n;i++) res=Math.max(res,dp[i][0]);
//        return res;
//    }
    public int getMaxLen(int[] nums) {
        int res = Integer.MIN_VALUE;
        int[][] dp = new int[nums.length][2];
        if(nums[0] > 0) dp[0][0] = 1;
        else if (nums[0] < 0) dp[0][1] = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > 0) {
                dp[i][0] = dp[i-1][0] + 1;
                if (dp[i-1][1] > 0) dp[i][1] = dp[i-1][1] + 1;
            }else if (nums[i] < 0){
                if(dp[i-1][1] > 0) dp[i][0] = dp[i-1][1] + 1;
                dp[i][1] = dp[i-1][0] + 1;
            }
        }
        for (int i = 0; i < nums.length; i++) res = Math.max(res, dp[i][0]);
        return res;
    }
}
