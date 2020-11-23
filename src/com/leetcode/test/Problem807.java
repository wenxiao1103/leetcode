package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/11/22 11:09 下午
 *
 * 807. 保持城市天际线
 */
public class Problem807 {
//    public int maxIncreaseKeepingSkyline(int[][] grid) {
//        int N = grid.length;
//        int[] rowMaxes = new int[N];
//        int[] colMaxes = new int[N];
//
//        for (int r = 0; r < N; ++r)
//            for (int c = 0; c < N; ++c) {
//                rowMaxes[r] = Math.max(rowMaxes[r], grid[r][c]);
//                colMaxes[c] = Math.max(colMaxes[c], grid[r][c]);
//            }
//
//        int ans = 0;
//        for (int r = 0; r < N; ++r)
//            for (int c = 0; c < N; ++c)
//                ans += Math.min(rowMaxes[r], colMaxes[c]) - grid[r][c];
//
//        return ans;
//    }
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int N = grid.length;
        int[] rowMaxes = new int[N];
        int[] colMaxes = new int[N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                rowMaxes[r] = Math.max(rowMaxes[r], grid[r][c]);
                colMaxes[c] = Math.max(colMaxes[c], grid[r][c]);
            }
        }
        int ans = 0;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                ans += Math.min(rowMaxes[r], colMaxes[c]) - grid[r][c];
            }
        }
        return ans;
    }
}