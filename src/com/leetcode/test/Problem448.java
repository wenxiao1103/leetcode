package com.leetcode.test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/9/19 10:54 下午
 *
 * 448. 找到所有数组中消失的数字
 */
public class Problem448 {

//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            int newIndex = Math.abs(nums[i]) - 1;
//            if (nums[newIndex] > 0) {
//                nums[newIndex] *= -1;
//            }
//        }
//        List<Integer> result = new LinkedList<Integer>();
//        for (int i = 1; i <= nums.length; i++) {
//
//            if (nums[i - 1] > 0) {
//                result.add(i);
//            }
//        }
//
//        return result;
//    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int newIndex = Math.abs(nums[i]) - 1;
            if (nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }
        List<Integer> result = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] > 0) result.add(i);
        }
        return result;
    }
}
