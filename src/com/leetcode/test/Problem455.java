package com.leetcode.test;

import java.util.Arrays;

/**
 * @author xiaowen
 * @date 2020/10/5 5:15 下午
 *
 * 455. 分发饼干
 */
public class Problem455 {
//    public int findContentChildren(int[] grid, int[] size) {
//        if (grid == null || size == null) return 0;
//        Arrays.sort(grid);
//        Arrays.sort(size);
//        int gi = 0, si = 0;
//        while (gi < grid.length && si < size.length) {
//            if (grid[gi] <= size[si]) {
//                gi++;
//            }
//            si++;
//        }
//        return gi;
//    }
    public int findContentChildren(int[] grid, int[] size) {
        if (grid == null || size == null) return 0;
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi = 0;
        int si = 0;
        while (gi < grid.length && si < size.length) {
            if (grid[gi] <= size[si]) gi++;
            si++;
        }
        return gi;
    }
}
