package com.leetcode.test;

import java.util.HashMap;

/**
 * @author xiaowen
 * @date 2020/10/9 10:02 下午
 *
 * 560. 和为K的子数组
 */
public class Problem560 {
//    public int subarraySum(int[] nums, int k) {
//        int count = 0, pre = 0;
//        HashMap< Integer, Integer > mp = new HashMap < > ();
//        mp.put(0, 1);
//        for (int i = 0; i < nums.length; i++) {
//            pre += nums[i];
//            if (mp.containsKey(pre - k)) {
//                count += mp.get(pre - k);
//            }
//            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
//        }
//        return count;
//    }
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int pre = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        for (int num : nums) {
            pre += num;
            if (hashMap.containsKey(pre - k)) {
                count += hashMap.get(pre - k);
            }
            hashMap.put(pre, hashMap.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
