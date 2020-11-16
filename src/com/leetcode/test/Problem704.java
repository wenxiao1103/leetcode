package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/22 11:07 下午
 *
 * 704. 二分查找
 */
public class Problem704 {
//    public int search(int[] nums, int target) {
//        int pivot, left = 0, right = nums.length - 1;
//        while (left <= right) {
//            pivot = left + (right - left) / 2;
//            if (nums[pivot] == target) return pivot;
//            if (target < nums[pivot]) right = pivot - 1;
//            else left = pivot + 1;
//        }
//        return -1;
//    }
    public int search(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) return pivot;
            if (target < nums[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return -1;
    }
}