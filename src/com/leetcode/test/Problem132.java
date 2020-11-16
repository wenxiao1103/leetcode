package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/13 11:02 下午
 *
 * 132. 分割回文串 II
 */
public class Problem132 {
//    public int minCut(String s) {
//        int[] dp = new int[s.length()];
//        int n = s.length();
//        for (int i = 0; i < n; i++) {
//            dp[i] = i;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            int j = 0;
//            while (true) {
//                if (i - j < 0 || i + j > n - 1) {
//                    break;
//                }
//                if (s.charAt(i - j) == s.charAt(i + j)) {
//                    if (i - j == 0) {
//                        dp[i + j] = 0;
//                    } else {
//                        dp[i + j] = Math.min(dp[i + j], dp[i - j - 1] + 1);
//                    }
//
//                } else {
//                    break;
//                }
//                j++;
//            }
//            j = 1;
//            while (true) {
//                if (i - j + 1 < 0 || i + j > n - 1) {
//                    break;
//                }
//                if (s.charAt(i - j + 1) == s.charAt(i + j)) {
//                    if (i - j + 1 == 0) {
//                        dp[i + j] = 0;
//                    } else {
//                        dp[i + j] = Math.min(dp[i + j], dp[i - j + 1 - 1] + 1);
//                    }
//                } else {
//                    break;
//                }
//                j++;
//            }
//
//        }
//        return dp[n - 1];
//    }

    public int minCut(String s) {
        int[] dp = new int[s.length()];
        int n = s.length();
        for (int i = 0; i < n; i++) dp[i] = i;
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            while (true) {//奇
                if (i-j < 0 || i+j > n-1) break;
                if(s.charAt(i-j) == s.charAt(i+j)){
                    if(i-j == 0) dp[i+j] = 0;
                    else dp[i+j] = Math.min(dp[i+j], dp[i-j-1]+1);
                }else break;
                j++;
            }
            j = 1;
            while (true) {//偶
                if (i-j+1<0 || i+j>n-1) break;
                if(s.charAt(i-j+1) == s.charAt(i+j)){
                    if (i-j+1 == 0) dp[i+j] = 0;
                    else dp[i+j] = Math.min(dp[i+j], dp[i-j]+1);
                }else break;
                j++;
            }
        }
        return dp[n-1];
    }
}
