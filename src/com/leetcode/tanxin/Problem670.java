package com.leetcode.tanxin;

/**
 * @author xiaowen
 * @date 2020/10/11 4:30 下午
 *
 * 670. 最大交换
 */
public class Problem670 {
//    public int maximumSwap(int num) {
//        char[] A = Integer.toString(num).toCharArray();
//        int[] last = new int[10];
//        for (int i = 0; i < A.length; i++) {
//            last[A[i] - '0'] = i;
//        }
//
//        for (int i = 0; i < A.length; i++) {
//            for (int d = 9; d > A[i] - '0'; d--) {
//                if (last[d] > i) {
//                    char tmp = A[i];
//                    A[i] = A[last[d]];
//                    A[last[d]] = tmp;
//                    return Integer.valueOf(new String(A));
//                }
//            }
//        }
//        return num;
//    }
    public int maximumSwap(int num) {
        char[] A = Integer.toString(num).toCharArray();
        int[] last = new int[10];
        for (int i = 0; i < A.length; i++) {
            last[A[i] - '0'] = i;
        }
        for (int i = 0; i < A.length; i++) {
            for (int d = 9; d > A[i] - 0; d--) {
                if (last[d] > i) {
                    char tmp = A[i];
                    A[i] = A[last[d]];
                    A[last[d]] = tmp;
                    return Integer.valueOf(new String(A));
                }
            }
        }
        return num;
    }
}
