package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/11/9 11:57 下午
 *
 * 779. 第K个语法符号
 */
public class Problem779 {
    public int kthGrammar(int N, int K) {
        return Integer.bitCount(K - 1) % 2;
    }
}