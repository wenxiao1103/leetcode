package com.leetcode.test;
//分割数组
public class Problem915 {
//    public int partitionDisjoint(int[] A) {
//        if (A == null || A.length == 0) {
//            return 0;
//        }
//
//        int leftMax = A[0];
//        int max = A[0];
//        int index = 0;
//
//        for (int i = 0; i < A.length; i++) {
//            max = Math.max(max, A[i]);
//            if(A[i] < leftMax) {
//                leftMax = max;
//                index = i;
//            }
//        }
//
//        return index + 1;
//    }
//    public int partitionDisjoint(int[] A) {
//        if (A == null || A.length == 0) {
//            return 0;
//        }
//        int leftMax = A[0];
//        int max = A[0];
//        int index = 0;
//
//        for (int i = 0; i < A.length; i++) {
//            max = Math.max(max, A[i]);
//            if (A[i] < leftMax) {
//                leftMax = max;
//                index = i;
//            }
//        }//for循环为核心
//        return index+1;
//    }
    //核心：找出左边数组的最大值，以及左边数组的分界点，
    //当一个数A[i]小于左边的最大值时，分界点等于index = i+1
    public int partitionDisjoint(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int leftMax = A[0];
        int max = A[0];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            max = Math.max(max, A[i]);
            if (A[i] < leftMax) {
                leftMax = max;
                index = i;
            }
        }
        return index+1;
    }
}
