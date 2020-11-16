package com.leetcode.dp;

import java.util.Arrays;
//最长上升子序列，给定一个无序的整数数组，找到其中最长上升子序列的长度。二分查找，动态规划
public class Problem300 {
//    public int lengthOfLIS(int[] nums) {
//        int[] dp = new int[nums.length];
//        int len = 0;
//        for (int num : nums) {
//            int i = Arrays.binarySearch(dp, 0, len, num);
//            if (i < 0) {
//                i = -(i + 1);
//            }
//            dp[i] = num;
//            if (i == len) {
//                len++;
//            }
//        }
//        return len;
//    }
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums){
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i+1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }
//采用 int i = Arrays.binarySearch(dp, 0, len, num);二分查找，查找插入位置，如果插入位置刚好是len，则输出长度加一
}
