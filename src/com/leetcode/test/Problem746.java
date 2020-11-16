package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/11/16 11:34 下午
 *
 * 746. 使用最小花费爬楼梯
 */
public class Problem746 {
//    public int minCostClimbingStairs(int[] cost) {
//        int f0=0,f1=0;
//        for(int i=0;i<cost.length;i++){
//            int cur=cost[i]+Math.min(f0,f1);
//            f0=f1;
//            f1=cur;
//        }
//        return Math.min(f0,f1);
//    }
    public int minCostClimbingStairs(int[] cost) {
        int f0 = 0, f1 = 0;
        for (int i = 0; i < cost.length; i++) {
            int cur = cost[i] + Math.min(f0, f1);
            f0 = f1;
            f1 = cur;
        }
        return Math.min(f0, f1);
    }
}