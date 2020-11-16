package com.leetcode.JZoffer;

import java.util.Arrays;

//最小的k个数
public class Problem40 {
//        public int[] getLeastNumbers(int[] arr, int k) {
//            if (k == 0 || arr.length == 0) {
//                return new int[0];
//            }
//            return quickSearch(arr, 0, arr.length - 1, k - 1);
//        }
//
//        private int[] quickSearch(int[] nums, int lo, int hi, int k) {
//            int j = partition(nums, lo, hi);
//            if (j == k) {
//                return Arrays.copyOf(nums, j + 1);
//            }
//            return j > k ? quickSearch(nums, lo, j - 1, k) : quickSearch(nums, j + 1, hi, k);
//        }
//
//        private int partition(int[] nums, int lo, int hi) {
//            int v = nums[lo];
//            int i = lo, j = hi + 1;
//            while (true) {
//                while (++i <= hi && nums[i] < v) ;
//                while (--j >= lo && nums[j] > v) ;
//                if (i >= j) {
//                    break;
//                }
//                int t = nums[j];
//                nums[j] = nums[i];
//                nums[i] = t;
//            }
//            nums[lo] = nums[j];
//            nums[j] = v;
//            return j;
//        }
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }
    public int[] quickSearch(int[] nums, int lo, int hi, int k) {
        int j = partition(nums, lo, hi);
        if (j == k) {
            return Arrays.copyOf(nums, j + 1);
        }
        return j > k ? quickSearch(nums, lo, j - 1, k) : quickSearch(nums, j + 1, hi, k);
    }
    private int partition(int[] nums, int lo, int hi) {
        int v = nums[lo];
        int i = lo, j = hi + 1;
        while(true) {
            while (++i <= hi && nums[i] < v);
            while (--j >= lo && nums[j] > v);
            if (i >= j) {
                break;
            }
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
        }
        nums[lo] = nums[j];
        nums[j] = v;
        return j;
    }
}