package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/10 10:15 下午
 *
 * 605. 种花问题
 */
public class Problem605 {
//    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        int i = 0, count = 0;
//        while (i < flowerbed.length) {
//            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
//                flowerbed[i] = 1;
//                count++;
//            }
//            i++;
//        }
//        return count >= n;
//    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            i++;
        }
        return count >= n;
    }
}
