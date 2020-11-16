package com.leetcode.test;
//最大子序和
public class Problem53 {
//    public static int maxSubArray(int[] nums) {
//        int sum = 0;
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            if(sum > max) {
//                max = sum;
//            }
//            if(sum < 0)
//                sum = 0;
//        }
//        return max;
//    }
    public static int maxSubArray(int[] nums){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }
        return max;
    }
}
