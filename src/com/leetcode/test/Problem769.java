package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/27 10:46 下午
 *
 * 769. 最多能完成排序的块
 */
public class Problem769 {
//    public int maxChunksToSorted(int[] arr) {
//        int ans = 0, max = 0;
//        for (int i = 0; i < arr.length; ++i) {
//            max = Math.max(max, arr[i]);
//            if (max == i) ans++;
//        }
//        return ans;
//    }
    public int maxChunksToSorted(int[] arr) {
        int ans = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i) ans++;
        }
        return ans;
    }
}