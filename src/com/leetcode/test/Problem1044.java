package com.leetcode.test;

import java.util.HashSet;

//最长重复子串
public class Problem1044 {
//    public int search(int L, int a, long modulus, int n, int[] nums) {
//        long h = 0;
//        for (int i = 0; i < L; ++i) h = (h * a + nums[i]) % modulus;
//
//        HashSet<Long> seen = new HashSet();
//        seen.add(h);
//        long aL = 1;
//        for (int i = 1; i <= L; ++i) aL = (aL * a) % modulus;
//
//        for (int start = 1; start < n - L + 1; ++start) {
//            h = (h * a - nums[start - 1] * aL % modulus + modulus) % modulus;
//            h = (h + nums[start + L - 1]) % modulus;
//            if (seen.contains(h)) return start;
//            seen.add(h);
//        }
//        return -1;
//    }
//
//    public String longestDupSubstring(String S) {
//        int n = S.length();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; ++i) nums[i] = (int)S.charAt(i) - (int)'a';
//        int a = 26;
//        long modulus = (long)Math.pow(2, 32);
//
//        int left = 1, right = n;
//        int L;
//        while (left != right) {
//            L = left + (right - left) / 2;
//            if (search(L, a, modulus, n, nums) != -1) left = L + 1;
//            else right = L;
//        }
//
//        int start = search(left - 1, a, modulus, n, nums);
//        return start != -1 ? S.substring(start, start + left - 1) : "";
//    }

    public static void main(String[] args) {
        String S = "abcd";
        System.out.println(longestDupSubstring(S));
    }
public static String longestDupSubstring(String S) {
    if(S == null || S.length() == 0){
        return "";
    }

    int n = S.length();
    int res = 0;
    int start = -1;
    int end = -1;
    int [][] dp = new int[n+1][n+1];
    for(int i = 1; i<=n; i++){
        for(int j = 1; j<i; j++){
            if(S.charAt(i-1) == S.charAt(j-1)){
                dp[i][j] = dp[i-1][j-1]+1;
                if (res < dp[i][j]){
                    res = dp[i][j];
                    start = j-res;
                    end = j;
                }
            }
        }
    }
    return start == -1 ? "" : S.substring(start, end);
}
    //整数数组num表示字符串
    //
}
