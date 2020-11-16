package com.leetcode.test;
//最长公共子序列
public class Problem1143 {
//    public int longestCommonSubsequence(String text1, String text2) {
//        int m = text1.length();
//        int n = text2.length();
//        int[][] dp = new int[m + 1][n + 1];
//        for(int i = 1; i <= m; i++){
//            for(int j = 1; j <= n; j++){
//                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
//                if(text1.charAt(i - 1) == text2.charAt(j - 1)){
//                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
//                }
//
//            }
//        }
//        return dp[m][n];
//    }
    public int longestCommonSubsequence(String text1, String text2){
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1]+1);
                }
            }
        }
        return dp[m][n];
    }
    //采用动态规划，dp[i][j] 为最大公共子序列，若if(text1.charAt(i-1) == text2.charAt(j-1)) 则取最大公共子序列并且加1，
    // 若不相同也取最大公共子序列
    //LCS最长公共子序列算法
}
