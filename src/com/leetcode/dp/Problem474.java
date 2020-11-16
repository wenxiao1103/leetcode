package com.leetcode.dp;
//一和零
public class Problem474 {
//    public int findMaxForm(String[] strs, int m, int n) {
//        int[][] dp = new int[m + 1][n + 1];
//        for (String s: strs) {
//            int[] count = countzeroesones(s);
//            for (int zeroes = m; zeroes >= count[0]; zeroes--)
//                for (int ones = n; ones >= count[1]; ones--)
//                    dp[zeroes][ones] = Math.max(1 + dp[zeroes - count[0]][ones - count[1]], dp[zeroes][ones]);
//        }
//        return dp[m][n];
//    }
//    public int[] countzeroesones(String s) {
//        int[] c = new int[2];
//        for (int i = 0; i < s.length(); i++) {
//            c[s.charAt(i)-'0']++;
//        }
//        return c;
//    }
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (String s : strs) {
            int[] count = countzeroesones(s);
            for (int zeroes = m; zeroes >= count[0]; zeroes--) {
                for (int ones = n; ones >= count[1]; ones--) {
                    dp[zeroes][ones] = Math.max(1+dp[zeroes-count[0]][ones-count[1]], dp[zeroes][ones]);
                }
            }
        }
        return dp[m][n];
    }
    public int[] countzeroesones(String s) {
        int[] c = new int[2];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - '0']++;
        }
        return c;
    }
    //采用动态规划dp
    //1。创建dp数组，dp[m+1[n+1]表示m个0，n个1,能组成最多多少个字符串
    //2。for依次遍历字符串数组
    //3for循环零个数，
    //4。for循环1个数
    //5表示一个该字符串组成的最多的字符串数
    //6。更新dp
    //for (String s : strs) {
    //            int[] count = countzeroesones(s);
    //            for (int zeroes = m; zeroes >= count[0]; zeroes--) {
    //                for (int ones = n; ones >= count[1]; ones--) {
    //                    dp[zeroes][ones] = Math.max(1+dp[zeroes-count[0]][ones-count[1]], dp[zeroes][ones]);
    //                }
    //            }
    //        }
    //7.最后输出dp[m][n]
}
