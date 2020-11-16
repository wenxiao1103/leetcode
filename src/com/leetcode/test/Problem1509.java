package com.leetcode.test;

import java.util.Arrays;

/**
 * @author xiaowen
 * @date 2020/9/13 5:34 下午
 *
 * 1509. 三次操作后最大值与最小值的最小差
 */
public class Problem1509 {

//    public int minDifference(int[] nums) {
//        int n = nums.length;
//        if (n <= 4) {
//            return 0;
//        }
//
//        Arrays.sort(nums);
//        int ret = Integer.MAX_VALUE;
//        for (int i = 0; i < 4; i++) {
//            ret = Math.min(ret, nums[n - 4 + i] - nums[i]);
//        }
//        return ret;
//    }
    public int minDifference(int[] nums) {
        int result = Integer.MAX_VALUE;
        if (nums.length <= 4) return 0;
        Arrays.sort(nums);
        for (int i = 0; i < 4; i++) {
            result = Math.min(result, nums[nums.length - 4 + i] - nums[i]);
        }
        return result;
    }
}
