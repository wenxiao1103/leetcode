package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/26 10:11 下午
 *
 * 713. 乘积小于K的子数组
 */
public class Problem713 {
//    public int numSubarrayProductLessThanK(int[] nums, int k) {
//        if (k <= 1) return 0;
//        int prod = 1, ans = 0, left = 0;
//        for (int right = 0; right < nums.length; right++) {
//            prod *= nums[right];
//            while (prod >= k) prod /= nums[left++];
//            ans += right - left + 1;
//        }
//        return ans;
//    }
    public int numSubarrayProductLessThank(int[] nums, int k) {
        if (k <= 1) return 0;
        int prod = 1, ans = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) prod /= nums[left++];
            ans += right - left + 1;//核心点是这个函数
        }
        return ans;
    }
}