package com.leetcode.test;

import java.util.Arrays;

/**
 * @author xiaowen
 * @date 2020/10/7 10:26 下午
 *
 * 611. 有效三角形的个数
 */
public class Problem611 {
//    public int triangleNumber(int[] nums) {
//        int count = 0;
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 2; i++) {
//            int k = i + 2;
//            for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
//                while (k < nums.length && nums[i] + nums[j] > nums[k])
//                    k++;
//                count += k - j - 1;
//            }
//        }
//        return count;
//    }
    public int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
                while (k < nums.length && nums[i] + nums[j] > nums[k]) {
                    k++;
                }
                count += k - j - 1;
            }
        }
        return count;
    }
}
