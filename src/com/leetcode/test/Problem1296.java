package com.leetcode.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/8/30 8:38 下午
 *
 *1296. 划分数组为连续数字的集合
 */
public class Problem1296 {
//    public boolean isPossibleDivide(int[] nums, int k) {
//        int len = nums.length;
//        if (len % k != 0) {
//            return false;
//        }
//        Arrays.sort(nums);
//        Map<Integer, Integer> countMap = new HashMap<>();
//        for (int num : nums) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//        int needKSetCount = len / k;
//        int kCount = 0;
//        for (int num: nums) {
//            int curNumCount = countMap.get(num);
//            if (curNumCount == 0) {
//                continue;
//            }
//            countMap.put(num, curNumCount - 1);
//            for (int i = 1; i < k; i++) {
//                int count = countMap.getOrDefault(num + i, 0);
//                if (count == 0) {
//                    return false;
//                }
//                countMap.put(num + i, count - 1);
//            }
//            kCount++;
//            if (kCount == needKSetCount) {
//                return true;
//            }
//        }
//        return true;
//    }
//    public boolean isPossibleDivide(int[] nums, int k) {
//        int len = nums.length;
//        if (len % k != 0) return false;
//        Arrays.sort(nums);
//        Map<Integer, Integer> countMap = new HashMap<>();
//        for (int num : nums) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//        int needKSetCount = len / k;
//        int kCount = 0;
//        for (int num : nums) {
//            int curNumCount = countMap.get(num);
//            if (curNumCount == 0) continue;
//            countMap.put(num, curNumCount - 1);
//            for (int i = 1; i < k; i++) {
//                int count = countMap.getOrDefault(num + i, 0);
//                if (count == 0) return false;
//                countMap.put(num + i, count - 1);
//            }
//            kCount++;
//            if (kCount == needKSetCount) return true;
//        }
//        return true;
//    }
//    public boolean isPossibleDivide(int[] nums, int k) {
//        int len = nums.length;
//        if (len % k != 0) return false;
//        Arrays.sort(nums);
//        Map<Integer, Integer> countMap = new HashMap<>();
//        for (int num : nums) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//        int needKSetCount = len / k;
//        int kCount = 0;
//        for (int num : nums) {
//            int curNumCount = countMap.get(num);
//            if (curNumCount == 0) continue;
//            countMap.put(num, curNumCount - 1);
//            for (int i = 1; i < k; i++) {
//                int count = countMap.getOrDefault(num + i, 0);
//                if (count == 0) return false;
//                countMap.put(num + i, count - 1);
//            }
//            kCount++;
//            if(kCount == needKSetCount) return true;
//        }
//        return true;
//    }
    public boolean isPossibleDivide(int[] nums, int k) {
        int len = nums.length;
        if (len % k != 0) return false;
        Arrays.sort(nums);
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int needKSetCount = len / k;
        int kCount = 0;
        for (int num : nums) {
            int curNumCount = countMap.get(num);
            if (curNumCount == 0) continue;
            countMap.put(num, curNumCount - 1);
            for (int i = 1; i < k; i++) {
                int count = countMap.getOrDefault(num + 1, 0);
                if (count == 0) return false;
                countMap.put(num, count-1);
            }
            kCount++;
            if (kCount == needKSetCount) return true;
        }
        return true;
    }
}
