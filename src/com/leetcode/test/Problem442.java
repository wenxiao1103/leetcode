package com.leetcode.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/9/19 10:36 下午
 *
 * 442. 数组中重复的数据
 */
public class Problem442 {
//    public List<Integer> findDuplicates(int[] nums) {
//        List<Integer> res = new ArrayList<>();
//        for (int i = 0; i < nums.length; ++i) {
//            int index = Math.abs(nums[i]) - 1;
//            if (nums[index] < 0)
//                res.add(Math.abs(index + 1));
//            nums[index] = -nums[index];
//        }
//        return res;
//    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                res.add(Math.abs(index) + 1);
            }
            nums[index] = -nums[index];
        }
        return res;
    }
}