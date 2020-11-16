package com.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//非递增顺序的最小子序列
public class Problem1403 {
//    public List<Integer> minSubsequence(int[] nums) {
//        List<Integer> list=  new ArrayList<Integer>();
//        int total=0;
//        for(int s:nums){
//            total+=s;
//        }
//        Arrays.sort(nums);
//        int temp=0;
//        for(int i=nums.length-1;i>=0;i--){
//            temp+=nums[i];
//            list.add(nums[i]);
//            if(2*temp>total){
//                break;
//            }
//        }
//        return list;
//    }
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int total = 0;
        for (int s : nums) {
            total += s;
        }
        Arrays.sort(nums);
        int temp = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            temp += nums[i];
            list.add(nums[i]);
            if (2*temp > total) {
                break;
            }
        }
        return list;
    }
}
