package com.leetcode.test;
//删除重复数组中的重复项
public class Problem24 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int count = 1;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[j-1]){
                count++;
            }
        }
        return count;
    }
}
