package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/11/9 11:45 下午
 *
 * 777. 在LR字符串中交换相邻字符
 */
public class Problem777 {
    //    public boolean canTransform(String start, String end) {
//        int N = start.length();
//        char[] S = start.toCharArray(), T = end.toCharArray();
//        int i = -1, j = -1;
//        while (++i < N && ++j < N) {
//            while (i < N && S[i] == 'X') i++;
//            while (j < N && T[j] == 'X') j++;
//            if ((i < N) ^ (j < N)) return false;
//            if (i < N && j < N) {
//                if (S[i] != T[j] || (S[i] == 'L' && i < j) || (S[i] == 'R' && i > j))
//                    return false;
//            }
//        }
//        return true;
//    }
//    public boolean canTransform(String start, String end) {
//        if (!start.replace("X", "").equals(end.replace("X", "")))
//            return false;
//
//        int t = 0;
//        for (int i = 0; i < start.length(); ++i)
//            if (start.charAt(i) == 'L') {
//                while (end.charAt(t) != 'L') t++;
//                if (i < t++) return false;
//            }
//
//        t = 0;
//        for (int i = 0; i < start.length(); ++i)
//            if (start.charAt(i) == 'R') {
//                while (end.charAt(t) != 'R') t++;
//                if (i > t++) return false;
//            }
//
//        return true;
//    }
    public boolean canTransform(String start, String end) {
        if (!start.replace("X", "").equals(end.replace("X", "")))
            return false;
        int t = 0;
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'L') {
                while (end.charAt(t) != 'L') t++;
                if (i < t++) return false;
            }
        }
        t = 0;
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'R') {
                while (end.charAt(t) != 'R') t++;
                if (i > t++) return false;
            }
        }
        return true;
    }
}