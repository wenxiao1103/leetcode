package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/6 10:02 下午
 *
 * 521. 最长特殊序列 Ⅰ
 */
public class Problem521 {
    public int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;
        return Math.max(a.length(), b.length());
    }
}