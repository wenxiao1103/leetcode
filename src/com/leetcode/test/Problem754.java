package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/27 10:19 下午
 *
 * 754. 到达终点数字
 */
public class Problem754 {
//    public int reachNumber(int target) {
//        target = Math.abs(target);
//        int k = 0;
//        while (target > 0)
//            target -= ++k;
//        return target % 2 == 0 ? k : k + 1 + k % 2;
//    }
    public int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0;
        while (target > 0) target -= ++k;
        return target % 2 == 0 ? k : k + 1 + k % 2;
    }
}