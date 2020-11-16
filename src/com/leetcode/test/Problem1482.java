package com.leetcode.test;

import sun.nio.cs.ext.MacHebrew;

/**
 * @author xiaowen
 * @date 2020/8/26 11:14 下午
 *
 * 制作 m 束花所需的最少天数
 */
public class Problem1482 {
//    public int minDays(int[] bloomDay, int m, int k) {
//        if (m*k > bloomDay.length) {
//            return -1;
//        }
//        // 最大等待的天数是数组里的最大值
//        int max=0;
//        for (int i : bloomDay) {
//            max = Math.max(max, i);
//        }
//        // 最小等待0天
//        int min=0;
//        while (min < max) {
//            // mid:等待天数
//            int mid = min + (max-min)/2;
//            // 等待mid天，有多少组连续的k朵花已经开花🌼了
//            int count = getCount(bloomDay, mid, k);
//            if (count >= m) {
//                max = mid;
//            } else {
//                min = mid+1;
//            }
//        }
//        return min;
//    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length) {
            return -1;
        }
        int max = 0;
        for (int i : bloomDay) {
            max = Math.max(max, i);
        }
        int min = 0;
        while(min < max) {
            int mid = min + (max-min)/2;
            int count = getCount(bloomDay, mid, k);
            if(count >= m) {
                max = mid;
            }else {
                min = mid+1;
            }
        }
        return min;
    }
    public int getCount(int[] arr, int day, int k) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count++;
            }else {
                count = 0;
            }
            if(count == k) {
                res++;
                count = 0;
            }
        }
        return res;
    }
    // 返回等待day天，有多少组连续的k天<=day  这里用的贪心
//    private int getCount(int[] arr, int day, int k) {
//        int re=0;
//        int count=0;
//        for (int i=0; i<arr.length; i++) {
//            if (arr[i] <= day) {
//                count++;
//            } else {
//                count = 0;
//            }
//            //  连续的k朵花🌼开了
//            if (count == k) {
//                re++;
//                count=0;
//            }
//        }
//        return re;
//    }
}
