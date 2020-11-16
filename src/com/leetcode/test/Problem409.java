package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/4 9:37 下午
 *
 * 409. 最长回文串
 */
public class Problem409 {
//    public int longestPalindrome(String s) {
//        int[] count = new int[128];
//        for (char c : s.toCharArray())
//            count[c]++;
//
//        int ans = 0;
//        for (int v : count) {
//            ans += v / 2 * 2;
//            if (v % 2 == 1 && ans % 2 == 0)
//                ans++;
//        }
//        return ans;
//    }
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) count[c]++;
        int result = 0;
        for (int v : count) {
            result += v/2*2;
            if (v % 2 == 1 && result % 2 == 0)
                result++;
        }
        return result;
    }
}