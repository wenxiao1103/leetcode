package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/19 9:11 下午
 *
 * 413. 等差数列划分
 */
public class Problem413 {

//    public int numberOfArithmeticSlices(int[] A) {
//        int count = 0;
//        for (int s = 0; s < A.length - 2; s++) {
//            int d = A[s + 1] - A[s];
//            for (int e = s + 2; e < A.length; e++) {
//                if (A[e] - A[e - 1] == d)
//                    count++;
//                else
//                    break;
//            }
//        }
//        return count;
//    }
    public int numberOfArithmeticsSlices(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length - 2; i++) {
            int d = A[i+1] - A[i];
            for (int j = i + 2; j < A.length; j++) {
                if (A[j] - A[j - 1] == d){
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
