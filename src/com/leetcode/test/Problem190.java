package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/21 10:33 下午
 *
 * 190. 颠倒二进制位
 */
public class Problem190 {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) + (n & 1);
            n >>= 1;
        }
        return res;
    }
}
