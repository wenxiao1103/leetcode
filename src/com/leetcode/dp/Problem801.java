package com.leetcode.dp;

import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/9/8 10:11 下午
 *
 *801.使序列递增的最小交换次数
 */
public class Problem801 {
//    public int minSwap(int[] A, int[] B) {
//        // n: natural, s: swapped
//        int n1 = 0, s1 = 1;
//        for (int i = 1; i < A.length; ++i) {
//            int n2 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
//            if (A[i-1] < A[i] && B[i-1] < B[i]) {
//                n2 = Math.min(n2, n1);
//                s2 = Math.min(s2, s1 + 1);
//            }
//            if (A[i-1] < B[i] && B[i-1] < A[i]) {
//                n2 = Math.min(n2, s1);
//                s2 = Math.min(s2, n1 + 1);
//            }
//            n1 = n2;
//            s1 = s2;
//        }
//        return Math.min(n1, s1);
//    }
    public int minSwap(int[] A, int[] B) {
        int n1 = 0, s1 = 1;
        for (int i = 1; i < A.length; i++) {
            int n2 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
            if (A[i-1] < A[i] && B[i-1] < B[i]) {
                n2 = Math.min(n2, n1);
                s2 = Math.min(s2, s1 + 1);
            }
            if (A[i-1] < B[i] && B[i-1] < A[i]) {
                n2 = Math.min(n2, s1);
                s2 = Math.min(s2, n1 + 1);
            }
            n1 = n2;
            s1 = s2;
        }
        return Math.min(n1, s1);
    }
}
