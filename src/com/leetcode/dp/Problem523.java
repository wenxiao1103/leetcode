package com.leetcode.dp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaowen
 * @date 2020/8/30 4:39 下午
 *
 * 连续的子数组和
 */
public class Problem523 {
//    public boolean checkSubarraySum(int[] nums, int k) {
//        if (nums == null || nums.length == 1) return false;
//        if (k == 0) {
//            for (int i=1; i<nums.length; i++) {
//                if (nums[i] == 0 && nums[i-1] == 0) return true;
//            }
//            return false;
//        }
//        k = Math.abs(k);
//
//        Set<Integer> set = new HashSet<>();
//
//        int sum = nums[0] % k;
//        int tmp = 0;
//
//        for (int i=1;i<nums.length;i++) {
//            set.add(tmp);
//            sum = (sum + nums[i]) % k;
//            if (set.contains(sum)) return true;
//            tmp = (tmp + nums[i-1]) %k;
//        }
//
//        return false;
//    }
//    public boolean checkSubarraySum ( int[] nums, int k){
//        int sum = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(0, -1);
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            if (k != 0)
//                sum = sum % k;
//            if (map.containsKey(sum)) {
//                if (i - map.get(sum) > 1)
//                    return true;
//            } else
//                map.put(sum, i);
//        }
//        return false;
//    }
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0)
                sum = sum % k;
            if (hashMap.containsKey(sum)) {
                if (i - hashMap.get(sum) > 1){
                    return true;
                }
            }else{
                hashMap.put(sum, i);
            }

        }
        return false;
    }
}