package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/16 11:23 下午
 */
public class Problem136 {
//    public int singleNumber(int[] nums) {
//        int single = 0;
//        for (int num : nums) {
//            single ^= num;
//        }
//        return single;
//    }
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
