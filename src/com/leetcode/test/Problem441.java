package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/5 4:41 下午
 */
public class Problem441 {
    public int arrangeCoins(int n) {
        return (int) (Math.sqrt(2) * Math.sqrt(n + 0.125) - 0.5);
    }

    //Math.sqrt()参数是double，而n是int型，这样 (int)(Math.sqrt(2.0 * n + 0.25) - 0.5) 就不会越界了
}