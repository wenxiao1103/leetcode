package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/30 11:13 下午
 *
 * 397. 整数替换
 */
public class Problem397 {
//    public int integerReplacement(int n) {
//        int count = 0;
//        long m = n;
//        while (m != 1) {
//            if (m % 2 == 0) {
//                m >>= 1;
//            } else if (m == 3) {// 3 另外拿出来
//                return count + 2;
//            } else if ((m & 2) == 2) {// 7 → +1 、 5 → -1
//                m += 1;
//            } else {
//                m -= 1;
//            }
//            count++;
//        }
//        return count;
//    }
    public int integerReplacement(int n) {
        int count = 0;
        long m = n;
        while (m != 1) {
            if (m % 2 == 0) {
                m >>= 1;
            } else if (m == 3) {
                return count+2;
            } else if ((m & 2) == 2) {
                m += 1;
            } else {
                m -= 1;
            }
            count++;
        }
        return count;
    }
}
