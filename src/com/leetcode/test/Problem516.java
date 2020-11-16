package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/5 8:45 下午
 *
 * 516. 最长回文子序列
 */
public class Problem516 {
//    public int longestPalindromeSubseq(String s) {
//        if (s == null) {
//            return 0;
//        }
//        int[][] dp = new int[s.length()][s.length()];
//        int n = s.length();
//        for (int i = 0; i < n; i++) {
//            dp[i][i] = 1;
//        }
//        for (int i = n - 1; i >= 0; i--) {
//            for (int j = i + 1; j < n; j++) {
//                if (s.charAt(i) == s.charAt(j)) {
//                    dp[i][j] = dp[i + 1][j - 1] + 2;
//                }
//                else {
//                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
//                }
//            }
//        }
//        return dp[0][n - 1];
//    }
//    public int longestPalindromeSubseq(String s) {
//        if (s == null) return 0;
//        int[][] dp = new int[s.length()][s.length()];
//        int n = s.length();
//        for (int i = 0; i < n; i++) dp[i][i] = 1;
//        for (int i = n - 1; i >= 0; i--) {
//            for (int j = i + 1; j < n; j++) {
//                if (s.charAt(i) == s.charAt(j)) {
//                    dp[i][j] = dp[i + 1][j - 1] + 2;
//                } else {
//                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
//                }
//            }
//        }
//        return dp[0][n - 1];
//    }
    public int longestPalindromeSubseg(String s) {
        if (s == null) return 0;
        int[][] dp = new int[s.length()][s.length()];
        int n = s.length();
        for (int i = 0; i < n; i++) dp[i][i] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
}