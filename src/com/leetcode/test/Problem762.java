package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/27 10:31 下午
 *
 * 762. 二进制表示中质数个计算置位
 */
public class Problem762 {
//    public int countPrimeSetBits(int L, int R) {
//        int ans = 0;
//        for (int x = L; x <= R; ++x)
//            if (isSmallPrime(Integer.bitCount(x)))
//                ans++;
//        return ans;
//    }
//    public boolean isSmallPrime(int x) {
//        return (x == 2 || x == 3 || x == 5 || x == 7 ||
//                x == 11 || x == 13 || x == 17 || x == 19);
//    }
    public int countPrimeSetBits(int L, int R) {
        int ans = 0;
        for (int x = L; x <= R; x++) {
            if (isSmallPrime(Integer.bitCount(x)))
                ans++;
        }
        return ans;
    }
    public boolean isSmallPrime(int x) {
        return (x == 2 || x == 3 || x == 5 || x == 7 ||
                x == 11 || x == 13 || x == 17 || x == 19);
    }
}
