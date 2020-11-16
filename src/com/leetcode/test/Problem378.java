package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/8/28 10:47 下午
 *
 * 378. 有序矩阵中第K小的元素
 */
public class Problem378 {
//    public int kthSmallest(int[][] matrix, int k) {
//        int n = matrix.length;
//        int lo = matrix[0][0], hi = matrix[n-1][n-1];
//        while(lo < hi) {
//            int mid = lo + (hi - lo) / 2;
//            int count = 0,  j = matrix[0].length - 1;
//            for(int i = 0; i < matrix.length; i++) {
//                while(j >= 0 && matrix[i][j] > mid) j--;
//                count += (j + 1);
//            }
//            if(count < k)
//                lo = mid + 1;
//            else
//                hi = mid;
//        }
//        return lo;
//    }
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int lo = matrix[0][0], hi = matrix[n-1][n-1];
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int count = 0, j = matrix[0].length - 1;
            for (int i = 0; i < matrix.length; i++) {
                while (j >= 0 && matrix[i][j] > mid) {
                    j--;
                }
                count += (j + 1);
            }
            if (count < k) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
