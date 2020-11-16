package com.leetcode.test;

import java.util.Arrays;
import java.util.Comparator;

//最长字符串链
public class Problem1048 {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int n = words.length;
        int[] dp = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            String a = words[i];
            for (int j = i + 1; j < n; j++) {
                String b = words[j];
                if (isPredecessor(a, b)) {
                    dp[j] = Math.max(dp[j], dp[i] + 1);
                    res = Math.max(dp[j], res);
                }
            }
        }
        return res + 1;
    }
    private boolean isPredecessor(String a, String b) {
        int i = 0, j = 0;
        int m = a.length(), n = b.length();
        if ((m + 1) != n) return false;
        while (i < m && j < n) {
            if (a.charAt(i) == b.charAt(j)) i++;
            j++;
        }
        return i == m;
    }
    //isPredecessor函数判读一个字符a是否能增加一个字符变成b
    //主函数longestStrChain
    //1.首先将字符串数组按照字符串长度升序排序
    //2。设置dp数组，dp[i]表示一字符串words[i]结尾的最长字符链
    //3。第一个for循环依次遍历每个字符串
    //4。第二个嵌套字符串遍历当前字符串之前的字符串
    //5。通过if判断当前字符串能否通过增加一个字符变成另一字符串，
    //6。如能够，则dp[j] = Math.max(dp[j], dp[i] + 1);
}