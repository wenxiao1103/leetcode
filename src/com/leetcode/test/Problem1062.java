package com.leetcode.test;
//最长重复子串，与1044类似
public class Problem1062 {
    public int longestRepeatingSubstring(String S) {
        if(S == null || S.length() == 0){
            return 0;
        }

        int n = S.length();
        int res = 0;

        int [][] dp = new int[n+1][n+1];
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<i; j++){
                if(S.charAt(i-1) == S.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    res = Math.max(res, dp[i][j]);
                }
            }
        }
        return res;
    }
    //dp[i][j]表示字符串低i个字符与第j个字符是否相等，如大于0表示相等，等于0表示不等，大于0的整数表示表示包括当前字符，连续相等的个数
}
