package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/11/22 11:02 下午
 *
 * 806. 写字符串需要的行数
 */
public class Problem806 {
//    public int[] numberOfLines(int[] widths, String S) {
//        int lines = 1, width = 0;
//        for (char c : S.toCharArray()) {
//            int w = widths[c - 'a'];
//            width += w;
//            if (width > 100) {
//                lines++;
//                width = w;
//            }
//        }
//
//        return new int[]{lines, width};
//    }
    public int[] numberOfLines(int[] widths, String S) {
        int lines = 1, width = 0;
        for (char c : S.toCharArray()) {
            int w = widths[c - 'a'];
            width += w;
            if (width > 100) {
                lines++;
                width = w;
            }
        }
        return new int[]{lines, width};
    }
}