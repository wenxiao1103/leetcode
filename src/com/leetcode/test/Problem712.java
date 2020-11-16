package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/11/2 10:40 下午
 *
 * 712. 两个字符串的最小ASCII删除和
 */
public class Problem712 {
//    public int minimumDeleteSum(String s1, String s2) {
//        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
//
//        for (int i = s1.length() - 1; i >= 0; i--) {
//            dp[i][s2.length()] = dp[i + 1][s2.length()] + s1.codePointAt(i);
//        }
//        for (int j = s2.length() - 1; j >= 0; j--) {
//            dp[s1.length()][j] = dp[s1.length()][j + 1] + s2.codePointAt(j);
//        }
//        for (int i = s1.length() - 1; i >= 0; i--) {
//            for (int j = s2.length() - 1; j >= 0; j--) {
//                if (s1.charAt(i) == s2.charAt(j)) {
//                    dp[i][j] = dp[i + 1][j + 1];
//                } else {
//                    dp[i][j] = Math.min(dp[i + 1][j] + s1.codePointAt(i),
//                            dp[i][j + 1] + s2.codePointAt(j));
//                }
//            }
//        }
//        return dp[0][0];
//    }
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = s1.length() - 1; i >= 0; i--) {
            dp[i][s2.length()] = dp[i + 1][s2.length()] + s1.codePointAt(i);
        }
        for (int i = s2.length() - 1; i >= 0; i--) {
            dp[s1.length()][i] = dp[s1.length()][i + 1] + s2.codePointAt(i);
        }
        for (int i = s1.length() - 1; i >= 0; i--) {
            for (int j = s2.length() - 1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j] + s1.codePointAt(i), dp[i][j + 1] + s2.codePointAt(j));
                }
            }
        }
        return dp[0][0];
    }
    //dp[i][j]表示字符串s1从i到尾部，与s2从j到尾部，是两个字符串相等，删除的字符最小阿时刻吗和。
}