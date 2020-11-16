package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/11/11 11:27 下午
 */
public class Problem780 {
//    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
//        while (tx >= sx && ty >= sy) {
//            if (tx == ty) break;
//            if (tx > ty) {
//                if (ty > sy) tx %= ty;
//                else return (tx - sx) % ty == 0;
//            } else {
//                if (tx > sx) ty %= tx;
//                else return (ty - sy) % tx == 0;
//            }
//        }
//        return (tx == sx && ty == sy);
//    }
//    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
//        while (tx >= sx && ty >= sy) {
//            if (tx == ty) break;
//            if (tx > ty) {
//                if (ty > sy) tx %= ty;
//                else return (tx - sx) % ty == 0;
//            } else {
//                if (tx > sx) ty &= tx;
//                else return (ty - sy) % tx == 0;
//            }
//        }
//        return (tx == sx && ty == sy);
//    }
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        if (sx == tx && sy == ty) return true;
        if (sx > tx || sy > ty) return false;
        return reachingPoints(sx + sy, sy, tx, ty) || reachingPoints(sx, sx + sy, tx, ty);
    }//可行，时间复杂度有些高
}
