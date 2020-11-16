package com.leetcode.test;
public class Problem188 {
//    public int maxProfit(int k, int[] prices) {
//        if(prices==null||prices.length<=1) return 0;
//        if(k>=(prices.length)/2){
//            //这时候可以全部都买下来
//            int max=0;
//            for (int i = 1; i <prices.length; i++) {
//                if(prices[i]-prices[i-1]>0) max+=prices[i]-prices[i-1];
//            }
//            return max;
//        }
//        int []dp=new int[2*k+1];
//        //dp[0][i]=0;就ok了
//        for (int i = 1; i <prices.length; i++) {
//            for (int j = 2; j <2*k+1; j+=2) {//偶数，是没有股票的状态
//                dp[j]=Math.max(dp[j],dp[j-1]+prices[i]-prices[i-1]);
//            }
//            for (int j = 1; j < 2*k+1; j+=2) {//奇数,是有股票的状态
//                dp[j]=Math.max(dp[j]+prices[i]-prices[i-1],dp[j-1]);
//            }
//        }
//        int max=0;
//        for (int i = 0; i <2*k+1; i+=2) {
//            if(dp[i]>max) max=dp[i];
//        }
//        return max;
//    }
    public int maxProfit(int k, int[] prices){
        if(prices == null || prices.length <= 1) return 0;
        if(k >= (prices.length/2)){
            int max = 0;
            for (int i = 1; i < prices.length; i++){
                if(prices[i] > prices[i-1])
                    max += prices[i]-prices[i-1];
            }
            return max;
        }
        int[] dp = new int[2*k + 1];
        for (int i = 1; i < prices.length; i++){
            for (int j = 2; j < 2*k + 1; j += 2){
                dp[j] = Math.max(dp[j], dp[j-1] + prices[i] - prices[i-1]);
                //偶数代表不持股
            }
            for (int j = 1; j < 2*k + 1; j += 2) {
                dp[j] = Math.max(dp[j] + prices[i] - prices[i-1], dp[j]);
                //奇数代表持股
            }
        }
        int max = 0;
        for (int i = 0; i < 2*k + 1; i += 2)
            if (dp[i] > max) {
                max = dp[i];
            }
        return max;
    }
}
