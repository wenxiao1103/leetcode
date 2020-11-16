package com.leetcode.test;
//含有冻结期的股票买卖
public class Problem309 {
//    public int maxProfit(int[] prices){
//        if(prices == null || prices.length == 0) return 0;
//        int[][] dp = new int[prices.length][2];
//        dp[0][0] = -prices[0];
//        for(int i = 1; i < prices.length; i++){
//            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0]+prices[i]);
//            dp[i][0] = Math.max(dp[i-1][0], (i>2?dp[i-2][1]:0)-prices[i]);
//        }//买入前一天是冷冻期
//        //卖出前一天是买入
//        return dp[prices.length-1][1];
//    }
//    public int maxProfit(int[] prices) {
//        int len = prices.length;
//        if (len < 2) { return 0; }
//        int[][] dp = new int[len][3];
//        dp[0][0] = 0;
//        dp[0][1] = -prices[0];
//        dp[0][2] = 0;
//        for (int i = 1; i < len; i++) {
//            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
//            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][2] - prices[i]);
//            dp[i][2] = dp[i - 1][0];
//        }
//        return Math.max(dp[len - 1][0], dp[len - 1][2]);
//    }
    public int maxProfit(int[] prices){
        int len = prices.length;
        if(len < 2) {return 0;}
        int[][] dp = new int[prices.length][3];
        dp[0][0] = 0 ;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        for (int i = 1; i < len; i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][2] - prices[i]);
            dp[i][2] = dp[i-1][0];
        }
        return Math.max(dp[len-1][0], dp[len-1][2]);
    }
    //状态转移方程
    //不持股可以由这两个状态转换而来：
    //昨天不持股，今天什么都不操作，仍然不持股；
    //昨天持股，今天卖了一股。
    //持股可以由这两个状态转换而来：
    //昨天持股，今天什么都不操作，仍然持股；
    //昨天处在冷冻期，今天买了一股；
    //处在冷冻期只可以由不持股转换而来，因为题目中说，刚刚把股票卖了，需要冷冻 1 天。
    //0表示不持股，也可以表示成卖出
    //1表示持股，也可以表示成买进
    //2表示冻结期，表示前一天卖出
}
