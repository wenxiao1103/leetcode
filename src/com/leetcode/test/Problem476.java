package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/5 5:31 下午
 *
 * 476. 数字的补数
 */
public class Problem476 {
//    public int findComplement(int num) {
//        int maxBitNum = 0;
//        int tmpNum = num;
//        while (tmpNum > 0) {
//            maxBitNum += 1;
//            tmpNum >>= 1;
//        }
//        return num ^ ((1 << maxBitNum) - 1);
//    }
    public int findComlement(int num) {
        int maxBitNum = 0;
        int tmpNum = num;
        while (tmpNum > 0) {
            maxBitNum += 1;
            tmpNum >>= 1;
        }
        return num^((1 << maxBitNum) - 1);
    }
}
