package com.leetcode.dp;
//目标和
public class Problem494 {
//    public int findTargetSumWays(int[] nums, int S) {
//        int sum=0;
//        for (int n : nums)
//            sum += n;
//        if(sum<S||(S+sum)%2!=0) return 0;
//        int p = (S + sum) / 2;
//        int[] dp=new int [p+1];
//        dp[0]=1;
//        for(int num:nums){
//            for(int i=p;i>=num;i--){
//                dp[i]=dp[i]+dp[i-num];
//            }
//        }
//        return dp[p];
//    }
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if (sum < S || (S+sum) % 2 != 0) return 0;
        //S和sum的总和只能为偶数
        int p = (S + sum) / 2;
        int[] dp = new int[p+1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = p; i >= num; i--) {
                dp[i] = dp[i] + dp[i - num];
            }
        }
        return dp[p];
    }
    //1.因为S和sum的总和只能为偶数，故算法可以转换思路，其实就是求+的组合数量
//    public int findTargetSumWays(int[] nums, int S) {
//        int[][] dp = new int[nums.length][2001];
//        dp[0][nums[0] + 1000] = 1;
//        dp[0][-nums[0] + 1000] += 1;
//        for (int i = 1; i < nums.length; i++) {
//            for (int sum = -1000; sum <= 1000; sum++) {
//                if (dp[i - 1][sum + 1000] > 0) {
//                    dp[i][sum + nums[i] + 1000] += dp[i - 1][sum + 1000];
//                    dp[i][sum - nums[i] + 1000] += dp[i - 1][sum + 1000];
//                }
//            }
//        }
//        return S > 1000 ? 0 : dp[nums.length - 1][S + 1000];
//    }

//    public int findTargetSumWays(int[] nums, int S) {
//        int[][] dp = new int[nums.length][2001];
//        dp[0][nums[0] + 1000] = 1;
//        dp[0][-nums[0] + 1000] += 1;
//        for (int i = 1; i < nums.length; i++) {
//            for (int sum = -1000; sum <= 1000; sum++) {
//                if(dp[i-1][sum+1000] > 0){
//                    dp[i][sum + 1000 + nums[i]] += dp[i-1][sum+1000];
//                    dp[i][sum - nums[i] + 1000] += dp[i-1][sum + 1000];
//                }
//            }
//        }
//        return S>1000 ? 0 :dp[nums.length - 1][S + 1000];
//    }

}
