package com.leetcode.test;
//最长连续递增序列
public class Problem674 {
//    public int findLengthOfLCIS(int[] nums){
//        int ans = 0, anchor = 0;
//        //anchor是坐指针
//        //i相当于右指针
//        for(int i = 0; i < nums.length; i++){
//            if(i > 0 && nums[i] <= nums[i-1]) anchor = i;
//            ans = Math.max(ans, i-anchor+1);
//        }
//        return ans;
//    }
    public int findLengthOfLCIS(int[] nums) {
        int ans = 0, left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] <= nums[i-1]) left = i;
            ans = Math.max(ans, i-left+1);
        }
        return ans;
    }
}
