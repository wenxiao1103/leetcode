package com.leetcode.test;

import java.util.Map;

//长度最小的子数组
public class Problem209 {
//    public int minSubArrayLen(int s, int[] nums) {
//        if(nums == null || nums.length == 0) return 0;
//        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
//        while(i < nums.length)
//        {
//            sum += nums[i++];
//            while(sum >= s)
//            {
//                min = Math.min(min, i - j);
//                sum -= nums[j++];
//            }
//        }
//        return min == Integer.MAX_VALUE ? 0 : min;
//    }
    //段燕，杜鑫宇01，关少华，洪婷婷
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
        while (i < nums.length) {
            sum += nums[i++];
            while(sum >= s) {
                min = Math.min(min, i-j);
                sum -= nums[j++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
