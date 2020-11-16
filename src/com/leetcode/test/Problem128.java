package com.leetcode.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaowen
 * @date 2020/9/16 10:12 下午
 *
 * 128. 最长连续序列
 */
public class Problem128 {

//    public int longestConsecutive(int[] nums) {
//        Set<Integer> num_set = new HashSet<Integer>();
//        for (int num : nums) {
//            num_set.add(num);
//        }
//        int longestStreak = 0;
//        for (int num : num_set) {
//            if (!num_set.contains(num - 1)) {
//                int currentNum = num;
//                int currentStreak = 1;
//
//                while (num_set.contains(currentNum + 1)) {
//                    currentNum += 1;
//                    currentStreak += 1;
//                }
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
            if (!num_set.contains(num-1)){
                int currentNUm = num;
                int currentStreak = 1;
                while (num_set.contains(currentNUm + 1)) {
                    currentNUm += 1;
                    currentNUm += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
