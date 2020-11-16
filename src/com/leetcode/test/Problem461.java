package com.leetcode.test;
//汉明距离，计算两个数对应二进制为不同的个数
public class Problem461 {
//    public int hammingDistance(int x, int y) {
//        int cnt = 0;
//        while (x != 0 || y != 0) {
//            if ((x & 1) != (y & 1)) {
//                cnt++;
//            }
//            x >>= 1;
//            y >>= 1;
//        }
//        return cnt;
//    }
    public int hammingDistance(int x, int y) {
        int count = 0;
        while (x != 0 && y != 0) {
            if ((x & 1) != (y & 1)){
                count++;
            }
            x >>= 1;
            y >>= 1;
        }
        return count;
    }
}
