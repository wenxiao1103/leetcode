package com.leetcode.test;
//股票买卖的最佳时机2
public class Problem122 {
//    public int maxProfit(int[] prices) {
//        int maxprofit = 0;
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] > prices[i - 1])
//                maxprofit += prices[i] - prices[i - 1];
//        }
//        return maxprofit;
//    }

    public int maxProfit(int[] prices){
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i-1])
                maxprofit += prices[i] - prices[i-1];
        }
        return maxprofit;
    }
}