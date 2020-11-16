package com.leetcode.string;

import sun.nio.cs.ext.MacHebrew;

import java.util.HashSet;
import java.util.Set;

//最长连续序列
public class Problem128 {
//    public int longestConsecutive(int[] nums) {
//        Set<Integer> num_set = new HashSet<Integer>();
//        for (int num : nums) {
//            num_set.add(num);
//        }
//        int longestStreak = 0;
//        for (int num : num_set) {
//            if (!num_set.contains(num-1)) {
//                int currentNum = num;
//                int currentStreak = 1;
//                while (num_set.contains(currentNum+1)) {
//                    currentNum += 1;
//                    currentStreak += 1;
//                }
//
//                longestStreak = Math.max(longestStreak, currentStreak);
//            }
//        }
//        return longestStreak;
//    }
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<>();
        for (int num : nums) {
            num_set.add(num);
        }
        int longestStreak = 0;
        for (int num : num_set) {
            if (!num_set .contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (num_set.contains(currentNum+1)) {
                    currentStreak += 1;
                    currentNum += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
    //使用set集合来存储数组中的数，排除重复的数
    //通过for循环依次变量数组，然后判读当前数为开始是否存在连续的序列
}
