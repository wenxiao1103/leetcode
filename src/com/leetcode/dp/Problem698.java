package com.leetcode.dp;

import java.util.Arrays;

/**
 * @author xiaowen
 * @date 2020/10/19 11:03 下午
 *
 * 698. 划分为k个相等的子集
 */
public class Problem698 {
    //    public boolean canPartitionKSubsets(int[] nums, int k) {
//        int N = nums.length;
//        Arrays.sort(nums);
//        int sum = Arrays.stream(nums).sum();
//        int target = sum / k;
//        if (sum % k > 0 || nums[N - 1] > target) return false;
//
//        boolean[] dp = new boolean[1 << N];
//        dp[0] = true;
//        int[] total = new int[1 << N];
//
//        for (int state = 0; state < (1 << N); state++) {
//            if (!dp[state]) continue;
//            for (int i = 0; i < N; i++) {
//                int future = state | (1 << i);
//                if (state != future && !dp[future]) {
//                    if (nums[i] <= target - (total[state] % target)) {
//                        dp[future] = true;
//                        total[future] = total[state] + nums[i];
//                    } else {
//                        break;
//                    }
//                }
//            }
//        }
//        return dp[(1 << N) - 1];
//    }
    private boolean backtracking(int[] nums, int k, int target, int cur, int start, boolean[] used) {
        // 返回条件
        if (k == 0) return true;
        if (cur == target) {
            // 构建下一个集合
            return backtracking(nums, k - 1, target, 0, 0, used);
        }
        for (int i = start; i < nums.length; i++) {
            if (!used[i] && cur + nums[i] <= target) {
                used[i] = true;
                if (backtracking(nums, k, target, cur + nums[i], i + 1, used)) return true;
                used[i] = false;
            }
        }
        return false;
    }

    public boolean canPartitionKSubsets(int[] nums, int k) {
        // 注意nums[i] > 0
        int sum = 0, maxNum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (maxNum < nums[i]) maxNum = nums[i];
        }
        if (sum % k != 0 || maxNum > sum / k) return false;
        boolean[] used = new boolean[nums.length];
        return backtracking(nums, k, sum / k, 0, 0, used);
    }

}