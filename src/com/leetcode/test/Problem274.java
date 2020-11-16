package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/8/27 10:37 下午
 */
public class Problem274 {
//    public int hIndex(int[] citations) {
//        int n = citations.length;
//        int[] papers = new int[n + 1];
//        // 计数
//        for (int c: citations)
//            papers[Math.min(n, c)]++;
//        // 找出最大的 k
//        int k = n;
//        for (int s = papers[n]; k > s; s += papers[k])
//            k--;
//        return k;
//    }
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] papers = new int[n + 1];

        for (int c : citations) {
            papers[Math.min(n, c)]++;
        }

        int k = n;
        for (int s = papers[n]; k > s; s += papers[k])
            k--;
        return k;
    }
}
