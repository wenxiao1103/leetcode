package com.leetcode.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/10/6 10:28 下午
 *
 * 525. 连续数组
 */
public class Problem525 {
//    public int findMaxLength(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(0, -1);
//        int maxlen = 0, count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            count = count + (nums[i] == 1 ? 1 : -1);
//            if (map.containsKey(count)) {
//                maxlen = Math.max(maxlen, i - map.get(count));
//            } else {
//                map.put(count, i);
//            }
//        }
//        return maxlen;
//    }
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxLen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) maxLen = Math.max(maxLen, i - map.get(count));
            else map.put(count, i);
        }
        return maxLen;
    }
}