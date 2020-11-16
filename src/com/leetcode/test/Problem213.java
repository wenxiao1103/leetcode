package com.leetcode.test;
//打家劫舍2,所有房子围成一圈
public class Problem213 {
//    public int rob(int[] nums) {
//        int n = nums.length;
//        if(n == 0) return 0;
//        if(n == 1) return nums[0];
//        int sum1 = rob(nums, 0, n-1);
//        int sum2 = rob(nums, 1, n);
//        return Math.max(sum1, sum2);
//    }
//
//    public int rob(int[] nums, int start, int end){
//        int pre = 0, cur = 0;
//        for(int i = start; i < end; i++){
//            int next = Math.max(nums[i]+pre, cur);
//            pre = cur;
//            cur = next;
//        }
//        return cur;
//    }

    public int rob(int[] nums){
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int sum1 = rob(nums, 0, n-1);
        int sum2 = rob(nums, 1, n);
        return Math.max(sum1, sum2);
    }

    public int rob(int[] nums, int start, int end){
        int pre = 0, cur = 0;
        for (int i = start; i < end; i++){
            int next = Math.max(nums[i] + pre, cur);
            pre = cur;
            cur = next;
        }
        return cur;
    }
}
