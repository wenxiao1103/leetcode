package com.leetcode.test;
//寻找重复数
public class Problem287 {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(nums[i] != 0) {
            int x = nums[i];
            nums[i] = 0;
            i = x;
        }
        return i;
    }
}
