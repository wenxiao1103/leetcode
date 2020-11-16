package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/22 11:10 下午
 */
public class Problem709 {
//    public String toLowerCase(String str) {
//        if (str == null || str.length() == 0) {
//            return str;
//        }
//        char[] ch = str.toCharArray();
//        for (int i = 0; i < str.length(); i++) {
//            if (ch[i] >= 'A' && ch[i] <= 'Z') {
//                ch[i] += 32;
//            }
//        }
//        return String.valueOf(ch);
//    }
    public String toLowerCase(String str) {
        if (str == null || str.length() == 0) return str;
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') ch[i] += 32;
        }
        return String.valueOf(ch);
    }
}