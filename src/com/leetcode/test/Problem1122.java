package com.leetcode.test;
//数组的相对排序
public class Problem1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] nums = new int[1001];
        int[] res = new int[arr1.length];
        int k = 0;
        for (int n : arr1){
            nums[n]++;
        }
        for (int n : arr2) {
            while(nums[n]-- > 0){
                res[k++] = n;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]-- > 0){
                res[k++] = i;
            }
        }
        return res;
    }
}
