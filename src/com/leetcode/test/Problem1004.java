package com.leetcode.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xiaowen
 * @date 2020/8/30 5:12 下午
 *
 * 1004.最大连续1的个数3
 */
public class Problem1004 {
//    public int longestOnes(int[] A, int K) {
//        int res = 0;
//        int left = 0;
//        Queue<Integer> queue = new LinkedList<>();
//        for (int right = 0; right < A.length; right++) {
//            if (A[right] == 0) queue.add(right);
//            if (queue.size() > K) {
//                left = queue.peek() + 1;
//                queue.poll();
//            }
//            res = Math.max(res, right-left+1);
//        }
//        return res;
//    }
    public int longestOnes(int[] A, int K) {
        int res = 0;
        int left = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int right = 0; right < A.length; right++) {
            if (A[right] == 0) queue.add(right);
            if (queue.size() > K) {
                left = queue.peek() + 1;
                queue.poll();
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
