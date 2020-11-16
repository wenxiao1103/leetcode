package com.leetcode.dp;

import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/9/12 11:08 下午
 *
 * 152. 乘积最大子数组
 */
public class Problem152 {

//    public int maxProduct(int[] nums) {
//        int maxF = nums[0], minF = nums[0], ans = nums[0];
//        int length = nums.length;
//        for (int i = 1; i < length; ++i) {
//            int mx = maxF, mn = minF;
//            maxF = Math.max(mx * nums[i], Math.max(nums[i], mn * nums[i]));
//            minF = Math.min(mn * nums[i], Math.min(nums[i], mx * nums[i]));
//            ans = Math.max(maxF, ans);
//        }
//        return ans;
//    }

//    public int maxProduct(int[] nums) {
//        int maxF = nums[0], minF = nums[0], ans = nums[0];
//        int length = nums.length;
//        for (int i = 1; i < length; i++) {
//            int mx = maxF, mn = minF;
//            maxF = Math.max(mx * nums[i], Math.max(nums[i], mn * nums[i]));
//            minF = Math.min(mn * nums[i], Math.min(nums[i], mx * nums[i]));
//            ans = Math.max(maxF, ans);
//        }
//        return ans;
//    }

//    public int maxProduct(int[] nums) {
//        int[] maxF = new int[nums.length];
//        int[] minF = new int[nums.length];
//        System.arraycopy(nums, 0, maxF, 0, nums.length);
//        System.arraycopy(nums, 0, minF, 0, nums.length);
//        for (int i = 1; i < nums.length; i++) {
//            maxF[i] = Math.max(nums[i], Math.max(maxF[i-1] * nums[i], minF[i-1]*nums[i]));
//            minF[i] = Math.min(nums[i], Math.min(maxF[i-1] * nums[i], minF[i-1]*nums[i]));
//        }
//        int ans = maxF[0];
//        for (int i = 1; i < nums.length; i++) {
//            ans = Math.max(ans, maxF[i]);
//        }
//        return ans;
//    }
    public int maxProduct(int[] nums) {
        int[] maxF = new int[nums.length];
        int[] minF = new int[nums.length];
        System.arraycopy(nums, 0, maxF, 0, nums.length);
        System.arraycopy(nums, 0, minF, 0, nums.length);
        for (int i = 1; i < nums.length; i++) {
            maxF[i] = Math.max(nums[i], Math.max(maxF[i-1] * nums[i], minF[i-1] * nums[i]));
            minF[i] = Math.min(nums[i], Math.min(maxF[i-1] * nums[i], minF[i-1] * nums[i]));
        }
        int ans = maxF[0];
        for (int i = 1; i < nums.length; i++) {
            ans = Math.max(ans, maxF[i]);
        }
        return ans;
    }
}
