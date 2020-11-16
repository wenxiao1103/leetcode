package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/21 10:28 下午
 */
public class Problem191 {
//    public int hammingWeight(int n) {
//        int bits = 0;
//        int mask = 1;
//        for (int i = 0; i < 32; i++) {
//            if ((n & mask) != 0) {
//                bits++;
//            }
//            mask <<= 1;
//        }
//        return bits;
//    }
     public static int hammingWeight(int n) {
         int count = 0;
         while(n != 0) {
             if((n & 1) == 0) count++;
             n >>= 1;
         }
         return count;
     }

     //11111111111111111111111111111101二进制表示4294967293
}