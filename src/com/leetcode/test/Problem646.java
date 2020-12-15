package com.leetcode.test;

import java.util.Arrays;

/**
 * @author xiaowen
 * @date 2020/11/29 9:56 下午
 *
 * 646. 最长数对链
 */
public class Problem646 {
//    public int findLongestChain(int[][] pairs) {
//        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
//        int N = pairs.length;
//        int[] dp = new int[N];
//        Arrays.fill(dp, 1);
//
//        for (int j = 1; j < N; ++j) {
//            for (int i = 0; i < j; ++i) {
//                if (pairs[i][1] < pairs[j][0])
//                    dp[j] = Math.max(dp[j], dp[i] + 1);
//            }
//        }
//
//        int ans = 0;
//        for (int x : dp) {
//            if (x > ans) {
//                ans = x;
//            }
//        }
//        return ans;
//    }
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> a[0] - b[0]);
        int N = pairs.length;
        int[] dp = new int[N];
        Arrays.fill(dp, 1);
        for (int j = 1; j < N; j++) {
            for (int i = 0; i < j; i++) {
                if (pairs[i][1] < pairs[j][0]) {
                    dp[j] = Math.max(dp[j], dp[i] + 1);
                }
            }
        }
        int ans = 0;
        for (int x : dp) {
            if (x > ans) {
                ans = x;
            }
        }
        return ans;
    }
}