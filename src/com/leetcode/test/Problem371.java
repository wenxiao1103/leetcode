package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/17 11:28 下午
 *
 * 371. 两整数之和
 */
public class Problem371 {

    public int getSum(int a, int b) {
        while(b != 0){
            int temp = a ^ b;
            b = (a & b) << 1;
            a = temp;
        }
        return a;
    }
}
