package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/20 10:20 下午
 *
 * 657. 机器人能否返回原点
 *
 */
public class Problem657 {
//    public boolean judgeCircle(String moves) {
//        int x = 0, y = 0;
//        int length = moves.length();
//        for (int i = 0; i < length; i++) {
//            char move = moves.charAt(i);
//            if (move == 'U') {
//                y--;
//            } else if (move == 'D') {
//                y++;
//            } else if (move == 'L') {
//                x--;
//            } else if (move == 'R') {
//                x++;
//            }
//        }
//        return x == 0 && y == 0;
//    }
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        int length = moves.length();
        for (int i = 0; i < length; i++) {
            char move = moves.charAt(i);
            if (move == 'U') y--;
            else if (move == 'D') y++;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        }
        return x == 0 && y == 0;
    }
}