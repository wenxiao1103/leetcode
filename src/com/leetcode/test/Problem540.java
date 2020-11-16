package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/6 10:42 下午
 *
 * 540. 有序数组中的单一元素
 */
public class Problem540 {
//    public int singleNonDuplicate(int[] nums) {
//        int lo = 0;
//        int hi = nums.length - 1;
//        while (lo < hi) {
//            int mid = lo + (hi - lo) / 2;
//            if (mid % 2 == 1) mid--;
//            if (nums[mid] == nums[mid + 1]) {
//                lo = mid + 2;
//            } else {
//                hi = mid;
//            }
//        }
//        return nums[lo];
//    }
    public int singleNonDuplicate(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid % 2 == 1) mid--;
            if (nums[mid] == nums[mid + 1])
                lo = mid + 2;
            else hi = mid;
        }
        return nums[lo];
    }
}
