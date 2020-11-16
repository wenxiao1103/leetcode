package com.leetcode.test;

import java.util.Arrays;

/**
 * @author xiaowen
 * @date 2020/9/12 6:09 下午
 *
 * 1561. 你可以获得的最大硬币数目
 */
public class Problem1561 {
//    public int maxCoins(int[] piles) {
//        Arrays.sort(piles);
//        int length = piles.length;
//        int rounds = length / 3;
//        int coins = 0;
//        int index = length - 2;
//        for (int i = 0; i < rounds; i++) {
//            coins += piles[index];
//            index -= 2;
//        }
//        return coins;
//    }
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int length = piles.length;
        int rounds = length / 3;
        int coins = 0;
        int index = length - 2;
        for (int i = 0; i < rounds; i++) {
            coins += piles[index];
            index -= 2;
        }
        return coins;
    }
}
