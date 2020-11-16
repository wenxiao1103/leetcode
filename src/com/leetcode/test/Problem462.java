package com.leetcode.test;

import java.util.Arrays;

/**
 * @author xiaowen
 * @date 2020/9/29 10:05 下午
 */
public class Problem462 {
//    public int minMoves2(int[] nums) {
//        Arrays.sort(nums);
//        int sum = 0;
//        for (int num : nums) {
//            sum += Math.abs(nums[nums.length / 2] - num);
//        }
//        return sum;
//    }

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int num : nums) {
            sum += Math.abs(nums[nums.length/2] - num);
        }
        return sum;
    }
}