package com.leetcode.dp;

/**
 * @author xiaowen
 * @date 2020/9/30 10:26 下午
 */
public class Problem375 {
//    public int getMoneyAmount(int n) {
//        int[][] dp = new int[n + 1][n + 1];
//        for (int len = 2; len <= n; len++) {
//            for (int start = 1; start <= n - len + 1; start++) {
//                int minres = Integer.MAX_VALUE;
//                for (int piv = start; piv < start + len - 1; piv++) {
//                    int res = piv + Math.max(dp[start][piv - 1], dp[piv + 1][start + len - 1]);
//                    minres = Math.min(res, minres);
//                }
//                dp[start][start + len - 1] = minres;
//            }
//        }
//        return dp[1][n];
//    }
//    public int getMoneyAmount(int n) {
//        int[][] dp = new int[n+2][n+2];
//        for(int i = n; i >= 1; i--){
//            for(int j = i; j <= n; j++){
//                if(i == j){
//                    dp[i][j] = 0;
//                }
//                else{
//                    dp[i][j] = Integer.MAX_VALUE;
//                    for(int x = i; x <= j; x++){
//                        dp[i][j] = Math.min(dp[i][j], Math.max(dp[i][x-1], dp[x+1][j])+x);
//                    }
//                }
//            }
//        }
//        return dp[1][n];
//
//    }
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n+1][n+1];
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                if (i == j) {
                    dp[i][j] = 0;
                }else {
                    dp[i][j] = Integer.MAX_VALUE;
                    for (int x = i; x <= j; x++) {
                        dp[i][j] = Math.min(dp[i][j], Math.min(dp[i][x-1], dp[x+1][j])+x);
                    }
                }
            }
        }
        return dp[1][n];
    }
    //dp[1][n]表示至少需要拥有多少现金才能确保你能赢得这个游戏。1和n表示从中任选一个数
}