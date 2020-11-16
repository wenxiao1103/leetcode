package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/13 5:12 下午
 *
 * 1529. 灯泡开关 IV
 */
public class Problem1529 {

//    public int minFlips(String target) {
//        int flips = 0;
//        char prev = '0';
//        int length = target.length();
//        for (int i = 0; i < length; i++) {
//            char curr = target.charAt(i);
//            if (curr != prev) {
//                flips++;
//                prev = curr;
//            }
//        }
//        return flips;
//    }
    public int minFlips(String target) {
        char pre = '0';
        char cur = '0';
        int count = 0;
        for (int i = 0; i < target.length(); i++) {
            cur = target.charAt(i);
            if(cur != pre) {
                count++;
                pre = cur;
            }
        }
        return count;
    }
}
