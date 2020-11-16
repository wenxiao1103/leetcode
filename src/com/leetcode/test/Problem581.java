package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/9 10:25 下午
 *
 * 581. 最短无序连续子数组
 */
public class Problem581 {
//    public int findUnsortedSubarray(int[] nums) {
//        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//        boolean flag = false;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] < nums[i - 1])
//                flag = true;
//            if (flag)
//                min = Math.min(min, nums[i]);
//        }
//        flag = false;
//        for (int i = nums.length - 2; i >= 0; i--) {
//            if (nums[i] > nums[i + 1])
//                flag = true;
//            if (flag)
//                max = Math.max(max, nums[i]);
//        }
//        int l, r;
//        for (l = 0; l < nums.length; l++) {
//            if (min < nums[l])
//                break;
//        }
//        for (r = nums.length - 1; r >= 0; r--) {
//            if (max > nums[r])
//                break;
//        }
//        return r - l < 0 ? 0 : r - l + 1;
//    }
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1])
                flag = true;
            if (flag)
                min = Math.min(min, nums[i]);
        }
        flag = false;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1])
                flag = true;
            if (flag)
                max = Math.max(max, nums[i]);
        }
        int l, r;
        for (l = 0; l < nums.length; l++) {
            if (min < nums[l])
                break;
        }
        for (r = nums.length - 1; r >= 0; r--) {
            if (max > nums[r])
                break;
        }
        return r - l < 0 ? 0 : r - l + 1;
    }
}
