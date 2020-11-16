package com.leetcode.dp;
//最低票价
public class Problem983 {
//    int[] days, costs;
//    Integer[] memo;
//    int[] durations = new int[]{1, 7, 30};
//    public int mincostTickets(int[] days, int[] costs){
//        this.days = days;
//        this.costs = costs;
//        memo = new Integer[days.length];
//
//        return dp(0);
//    }
//    public int dp(int i){//dp函数求解第day[i]天的最小花费
//        if(i >= days.length)
//            return 0;
//        if(memo[i] != null)
//            return memo[i];
//
//        int ans = Integer.MAX_VALUE;
//        int j = i;
//        for(int k = 0; k < 3; k++){
//            while(j < days.length && days[j] < days[i]+durations[k])
//                j++;
//            ans = Math.min(ans, dp(j)+costs[k]);
//        }//for结构是关键
//        memo[i] = ans;
//        return ans;
//    }
    int[] days, costs;
    Integer[] memo;
    int[] durations = new int[]{1, 7, 30};

    public int mincostTickets(int[] days, int[] costs) {
        this.days = days;
        this.costs = costs;
        memo = new Integer[days.length];
        return dp(0);
    }

    public int dp(int i) {
        if (i >= days.length) {
            return 0;
        }
        if (memo[i] != null) {
            return memo[i];
        }
        memo[i] = Integer.MAX_VALUE;
        int j = i;
        for (int k = 0; k < 3; ++k) {
            while (j < days.length && days[j] < days[i] + durations[k]) {
                j++;
            }
            memo[i] = Math.min(memo[i], dp(j) + costs[k]);
        }//for循环是算法核心，尽量用最少的钱，完成尽可能多的旅行
        return memo[i];
    }
//    public int dp(int i) {
//        if (i >= days.length){
//            return 0;
//        }
//        if (memo[i] != null) {
//            return memo[i];
//        }
//        int j = i;
//        for (int k = 0; k < 3; k++) {
//            while (j < days.length && days[j] < days[i] + durations[k]){
//                j++;
//            }
//            memo[i] = Math.min(memo[i], dp(j) + costs[k]);
//        }//for循环是算法核心，尽量用最少的钱，完成尽可能多的旅行
//        return memo[i];
//    }
}
