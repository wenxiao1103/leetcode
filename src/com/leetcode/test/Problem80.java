package com.leetcode.test;
//删除排序数组中重复项，每个数字只能最多保留2个
public class Problem80 {
//    public int removeDuplicates(int[] nums) {
//        int i = 0;
//        for (int n : nums) {
//            if(i < 2 || n > nums[i-2]){
//                nums[i++] = n;
//            }
//        }
//        return i;
//    }
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if(i < 2 || n > nums[i-2]){
                nums[i++] = n;
            }
        }
        return i;
    }
}
