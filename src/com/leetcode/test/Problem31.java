package com.leetcode.test;
//下一个排列
public class Problem31 {
    public static void nextPermutation(int[] nums){
        int i = nums.length-2;
        while(i >= 0 && nums[i+1] <= nums[i]){
            i--;
        }
        if(i >= 0){
            int j = nums.length-1;
            while(j > i && nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1);
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start){
        int i = start, j = nums.length-1;
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    //从尾部开始i=nums.length-2;依次比较找到第一个前面数比后面数小的位置i;
    //如何位置i是>=0的，这同样从尾部开始开始找到第一个比较位置i的数大的位置j,然后交换
    //最后将位置i之后即从i+1位置开始的数，升序排序
}
