package com.leetcode.test;

import sun.nio.cs.ext.MacHebrew;

import java.util.Arrays;

/**
 * @author xiaowen
 * @date 2020/9/10 10:16 下午
 *
 * 16. 最接近的三数之和
 */
public class Problem16 {
//    public int threeSumClosest(int[] nums, int target) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        int best = 10000000;
//        for (int i = 0; i < n; ++i) {
//            if (i > 0 && nums[i] == nums[i - 1]) {
//                continue;
//            }
//            int j = i + 1, k = n - 1;
//            while (j < k) {
//                int sum = nums[i] + nums[j] + nums[k];
//                if (sum == target) {
//                    return target;
//                }
//                if (Math.abs(sum - target) < Math.abs(best - target)) {
//                    best = sum;
//                }
//                if (sum > target) {
//                    int k0 = k - 1;
//                    while (j < k0 && nums[k0] == nums[k]) {
//                        --k0;
//                    }
//                    k = k0;
//                } else {
//                    int j0 = j + 1;
//                    while (j0 < k && nums[j0] == nums[j]) {
//                        ++j0;
//                    }
//                    j = j0;
//                }
//            }
//        }
//        return best;
//    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int left0 = i + 1;
            int right0 = nums.length-1;
            while(left0 < right0) {
                int sum = nums[i] + nums[left0] + nums[right0];
                if(sum == target) return target;
                if(Math.abs(sum - target) < Math.abs(best - target)){
                    best = sum;
                }
                if (sum > target) {
                    int left1 = left0 + 1;
                    while (left1 < right0 && nums[left1] == nums[left0]){
                        left1++;
                    }
                    left0 = left1;
                }else {
                    int right1 = right0 - 1;
                    while(right1 > left0 && nums[right1] == nums[right0]){
                        right1--;
                    }
                    right0 = right1;
                }
            }
        }
        return best;
    }
}
