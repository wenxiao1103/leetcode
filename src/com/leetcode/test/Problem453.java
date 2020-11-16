package com.leetcode.test;

import java.util.Arrays;

/**
 * @author xiaowen
 * @date 2020/9/29 9:43 下午
 *
 * 453. 最小移动次数使数组元素相等
 */
public class Problem453 {
//    public int minMoves(int[] nums) {
//        Arrays.sort(nums);
//        int count = 0;
//        for (int i = nums.length - 1; i > 0; i--) {
//            count += nums[i] - nums[0];
//        }
//        return count;
//    }
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            count += nums[i] - nums[0];
        }
        return count;
    }
}
