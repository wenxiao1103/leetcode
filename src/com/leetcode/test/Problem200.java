package com.leetcode.test;
//岛屿数量
public class Problem200 {
//    public static void DFS(char[][] grid, int i, int j) {
//        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
//            return;
//        if (grid[i][j] == '1') {
//            grid[i][j] = '2';
//            DFS(grid, i + 1, j);
//            DFS(grid, i - 1, j);
//            DFS(grid, i, j + 1);
//            DFS(grid, i, j - 1);
//        }
//    }
//
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        int row = grid.length, column = grid[0].length, count = 0;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    DFS(grid, i, j);
                }
            }
        return count;
    }

    public static void DFS(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
            return;
        if (grid[i][j] == '1'){
            grid[i][j] = '2';
            DFS(grid,i+1, j);
            DFS(grid, i-1, j);
            DFS(grid, i, j+1);
            DFS(grid, i, j-1);
        }
    }


}
