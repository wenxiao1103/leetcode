package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/11/17 11:46 下午
 *
 * 799. 香槟塔
 */
public class Problem799 {
//    public double champagneTower(int poured, int query_row, int query_glass) {
//        double[][] A = new double[102][102];
//        A[0][0] = (double) poured;
//        for (int r = 0; r <= query_row; ++r) {
//            for (int c = 0; c <= r; ++c) {
//                double q = (A[r][c] - 1.0) / 2.0;
//                if (q > 0) {
//                    A[r + 1][c] += q;
//                    A[r + 1][c + 1] += q;
//                }
//            }
//        }
//
//        return Math.min(1, A[query_row][query_glass]);
//    }
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] A = new double[102][102];
        A[0][0] = (double) poured;
        for (int r = 0; r <= query_row; r++) {
            for (int c = 0; c <= r; c++) {
                double q = (A[r][c] - 1.0) / 2.0;
                if (q > 0) {
                    A[r+1][c] += q;
                    A[r+1][c+1] += q;
                }
            }
        }
        return Math.min(1, A[query_row][query_glass]);
    }
}