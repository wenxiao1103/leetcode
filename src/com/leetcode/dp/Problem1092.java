package com.leetcode.dp;

import java.util.Arrays;

//最短公共超序列
public class Problem1092 {
    public String shortestCommonSupersequence(String str1, String str2) {
        String lcs = lcs(str1, str2);
        int idx1 = 0;
        int idx2 = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lcs.length(); i++) {
            while (idx1 < str1.length() && str1.charAt(idx1) != lcs.charAt(i)) {
                sb.append(str1.charAt(idx1++));
            }
            while (idx2 < str2.length() && str2.charAt(idx2) != lcs.charAt(i)) {
                sb.append(str2.charAt(idx2++));
            }
            sb.append(lcs.charAt(i));
            idx1++;
            idx2++;
        }
        return sb.toString() + str1.substring(idx1) + str2.substring(idx2);
    }

    public String lcs(String str1, String str2) {
        String[][] dp = new String[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], "");
        }
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + str1.charAt(i);
                } else {
                    dp[i + 1][j + 1] = dp[i + 1][j].length() > dp[i][j + 1].length() ? dp[i + 1][j] : dp[i][j + 1];
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }
    //先采用LCS算法，求出两个字符串的公共子序列
    //然后依次遍历两个字符串，将字符串添加到公共子序列中，如下
    //for (int i = 0; i < lcs.length(); i++) {
    //            while (idx1 < str1.length() && str1.charAt(idx1) != lcs.charAt(i)) {
    //                sb.append(str1.charAt(idx1++));
    //            }
    //            while (idx2 < str2.length() && str2.charAt(idx2) != lcs.charAt(i)) {
    //                sb.append(str2.charAt(idx2++));
    //            }
    //            sb.append(lcs.charAt(i));
    //            idx1++;
    //            idx2++;
    //        }
}