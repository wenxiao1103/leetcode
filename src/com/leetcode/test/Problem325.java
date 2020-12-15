package com.leetcode.test;

import java.util.HashMap;

/**
 * @author xiaowen
 * @date 2020/11/29 10:54 下午
 *
 * 325.和等于 k 的最长子数组长度
 */
public class Problem325 {
//    public int maxSubArrayLen(int[] nums, int k) {
//        if (nums.length == 0) return 0;
//        int sum = 0, max = 0;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(0, -1);
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            if (map.containsKey(sum - k)) {
//                max = Math.max(max, i - map.get(sum - k));
//            }
//            if (!map.containsKey(sum)) map.put(sum, i);
//        }
//        return max;
//    }
    public int maxSubArrayLen(int[] nums, int k) {
        if (nums.length == 0) return 0;
        int sum = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                max = Math.max(max, i - map.get(sum - k));
            }
            if (!map.containsKey(sum)) map.put(sum, i);
        }
        return max;
    }
}
