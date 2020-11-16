package com.leetcode.dp;
//两个字符串的删除操作
public class Problem583 {
//    public int minDistance(String s1, String s2) {
//        int[] dp = new int[s2.length() + 1];
//        for (int i = 0; i <= s1.length(); i++) {
//            int[] temp=new int[s2.length()+1];
//            for (int j = 0; j <= s2.length(); j++) {
//                if (i == 0 || j == 0)
//                    temp[j] = i + j;
//                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
//                    temp[j] = dp[j - 1];
//                else
//                    temp[j] = 1 + Math.min(dp[j], temp[j - 1]);
//            }
//            dp=temp;
//        }
//        return dp[s2.length()];
//    }
    //public int minDistance(String s1, String s2) {
//        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
//        for (int i = 0; i <= s1.length(); i++) {
//            for (int j = 0; j <= s2.length(); j++) {
//                if (i == 0 || j == 0)
//                    dp[i][j] = i + j;
//                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
//                    dp[i][j] = dp[i - 1][j - 1];
//                else
//                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
//            }
//        }
//        return dp[s1.length()][s2.length()];
//    }
    public int minDistance(String s1, String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = i + j;
                }else if (s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
    //采用动态规划，现在 dp[i][j]dp[i][j] 表示 s1s1 串前 ii 个字符和 s2s2 串前 jj 个字符匹配的最少删除次数。
    // 同样我们逐行求解 dpdp 数组。为了求出 dp[i][j]dp[i][j] ，我们只考虑 2中情况：
    //
    //s1[i-1]s1[i−1] 和 s2[j-1]s2[j−1] 匹配，那么我们只需要让 dp[i][j]dp[i][j] 赋值为 dp[i-1][j-1]dp[i−1][j−1] 即可。
    // 这是因为两个字符串能匹配的字符不需要被删除。
    //
    //字符 s1[i-1]s1[i−1] 和 s2[j-1]s2[j−1]不匹配。这种情况下，我们需要考虑删除两个字符中的哪一个，同时需要增加一次删除操作。
    // 两种可能的选择是 dp[i-1][j]dp[i−1][j] 和 dp[i][j-1]dp[i][j−1]。我们从中选择较小值。
    //
    //最后，dp[m][n]dp[m][n] 就是我们需要的最少删除次数，mm 和 nn 分别是字符串 s1s1 和字符串 s2s2 的长度。
}
