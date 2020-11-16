package com.leetcode.dp;

/**
 * @author xiaowen
 * @date 2020/9/29 10:50 下午
 */
public class Problem357 {
//    public int countNumbersWithUniqueDigits(int n) {
//        if (n == 0) return 1;
//        int res = 10, k = 9, temp = 9;
//        for (int i = 2; i <= Math.min(n, 10); ++i){
//            temp *= k;
//            k--;
//            res += temp;
//        }
//        return res;
//    }
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int res = 10, k = 9, temp = 9;
        for (int i = 2; i <= Math.min(n, 10); i++){
            temp *= k;
            k--;
            res += temp;
        }
        return res;
    }
}
