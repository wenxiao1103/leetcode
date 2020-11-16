package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/6 10:05 下午
 *
 * 522. 最长特殊序列 II
 */
public class Problem522 {
//    public boolean isSubsequence(String x, String y) {
//        int j = 0;
//        for (int i = 0; i < y.length() && j < x.length(); i++)
//            if (x.charAt(j) == y.charAt(i))
//                j++;
//        return j == x.length();
//    }
//    public int findLUSlength(String[] strs) {
//        int res = -1;
//        for (int i = 0, j; i < strs.length; i++) {
//            for (j = 0; j < strs.length; j++) {
//                if (j == i)
//                    continue;
//                if (isSubsequence(strs[i], strs[j]))
//                    break;
//            }
//            if (j == strs.length)
//                res = Math.max(res, strs[i].length());
//        }
//        return res;
//    }
//    public boolean isSubsequence(String x, String y) {
//        int j = 0;
//        for (int i = 0; i < y.length() && j < x.length(); i++) {
//            if (x.charAt(j) == y.charAt(i))
//                j++;
//        }
//        return j == x.length();
//    }
//    //判断字符串x是否是字符串y的子序列
//    public int findLUSlength(String[] strs) {
//        int res = -1;
//        for (int i = 0, j; i < strs.length; i++) {
//            for (j = 0; j < strs.length; j++) {
//                if (j == i) continue;
//                if (isSubsequence(strs[i], strs[j])) break;
//            }
//            if (j == strs.length) res = Math.max(res, strs[i].length());
//        }
//        return res;
//    }
    public boolean isSubsequene(String x, String y) {
        int j = 0;
        for (int i = 0; i < y.length() && j < x.length(); i++) {
            if (x.charAt(j) == y.charAt(i)) j++;
        }
        return j == x.length();
    }
    public int findLUSlength(String[] strs) {
        int res = -1;
        for (int i = 0, j; i < strs.length; i++) {
            for (j = 0; j < strs.length; j++) {
                if (j == i) continue;
                if (isSubsequene(strs[i], strs[j])) break;
            }
            if (j == strs.length) res = Math.max(res, strs[i].length());
        }
        return res;
    }
}
