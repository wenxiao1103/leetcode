package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/12 11:53 下午
 *
 * 1191. K 次串联后最大子数组之和
 */
public class Problem1191 {
//    public int kConcatenationMaxSum(int[] arr, int k) {
//        if (arr == null || arr.length == 0) return 0;
//        long maxOfEnd = arr[0] > 0 ? arr[0] : 0L, maxSoFar = maxOfEnd, sum = arr[0];
//        for (int i = 1; i < Math.min(k, 2) * arr.length; i++) {
//            maxOfEnd = Math.max(maxOfEnd + arr[i % arr.length], arr[i % arr.length]);
//            maxSoFar = Math.max(maxOfEnd, maxSoFar);
//            if (i < arr.length) sum += arr[i];
//        }
//        while (sum > 0 && --k >= 2)
//            maxSoFar = (maxSoFar + sum) % 1000000007;
//        return (int) maxSoFar;
//    }
//    kabane算法

//        public int kconcatenationMaxSum(int[] arr, int k) {
//        if (arr == null || arr.length == 0) return 0;
//        long maxOfEnd = arr[0] > 0 ? arr[0] : 0L;
//        long maxSoFar = maxOfEnd;
//        long sum = arr[0];
//        for (int i = 1; i < Math.min(k, 2) * arr.length; i++) {
//            maxOfEnd = Math.max(maxOfEnd + arr[i % arr.length], arr[i % arr.length]);
//            maxSoFar = Math.max(maxOfEnd, maxSoFar);
//            if (i < arr.length) sum += arr[i];
//        }
//        while (sum > 0 && --k >= 2)
//            maxSoFar = (maxSoFar + sum) % 1000000007;
//        return (int)maxSoFar;
//    }
    public int kConcatenationMaxSum(int[] arr, int k) {
        int mod = (int) Math.pow(10, 9) + 7;
        long sum = 0, curMax = 0, preMax = 0;
        //求连续两次串联之后的最大子数组连续和
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (sum <= 0) {
                    sum = arr[j];
                } else {
                    sum = sum + arr[j];
                }
                curMax = Math.max(curMax, sum);
            }
            if (i == 1)//i=1时退出，已经计算完毕
                break;
        }
        if (k <= 2)//如果k的值小于等于2 直接返回最大值
            return (int) curMax % mod;
        sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];//求数组和，如果大于0，那么最大值为两个连续子数组最大值加(k-2)*数组和
        return (int) (curMax % mod + (k - 2) * Math.max(sum, 0) % mod) % mod; //返回时切忌计算内部也要取余！！！
    }

    //kadane算法.用于求解数组中和最大的连续最长连续子数组
//    public int largestSubarraySum(int[] arr) {
//        int maxOfEnd, maxSoFar;
//        maxSoFar = maxOfEnd = arr[0] > 0 ? arr[0] : 0;
//        for (int i = 1; i < arr.length; i++) {
//            maxOfEnd = Math.max(maxOfEnd + arr[i], arr[i]);
//            maxSoFar = Math.max(maxOfEnd, maxSoFar);
//        }
//        return maxSoFar;
//    }
    public int largestSubarraySum(int[] arr) {
        int maxOfEnd, maxSoFar;
        maxSoFar = maxOfEnd = arr[0] > 0 ? arr[0] : 0;
        for (int i = 1; i < arr.length; i++) {
            maxOfEnd = Math.max(maxOfEnd + arr[i], arr[i]);
            maxSoFar = Math.max(maxSoFar, maxOfEnd);
        }
        return maxSoFar;
    }
}