package com.leetcode.test;
//寻找峰值,大于左右两边的值
public class Problem162 {
//    public int findPeakElement(int[] nums){
//        return search(nums, 0, nums.length-1);
//    }
//    public int search(int[] nums, int l, int r){
//        if(l == r)
//            return l;
//        int mid = (l+r)/2;
//        if(nums[mid]>nums[mid+1])
//            return search(nums, l, mid);
//        return search(nums, mid+1, r);
//    }
    public int findPeakElement(int[] nums){
        return search(nums, 0, nums.length-1);
    }

    public int search(int[] nums, int l, int r){
        if(l == r)
            return l;
        int mid = (l + r)/2;
        if(nums[mid] > nums[mid + 1]){
            return search(nums, l, mid);
        }
        return search(nums, mid + 1, r);
    }
    //使用二分查找法
}
