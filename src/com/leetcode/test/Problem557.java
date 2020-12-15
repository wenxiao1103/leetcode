package com.leetcode.test;

import java.awt.font.ShapeGraphicAttribute;

/**
 * @author xiaowen
 * @date 2020/10/7 9:58 下午
 *
 * 557. 反转字符串中的单词 III
 */
public class Problem557 {
//    public: string reverseWords(string s) {
//        int length = s.length();
//        int i = 0;
//        while (i < length) {
//            int start = i;
//            while (i < length && s[i] != ' ') {
//                i++;
//            }
//
//            int left = start, right = i - 1;
//            while (left < right) {
//                swap(s[left], s[right]);
//                left++;
//                right--;
//            }
//            while (i < length && s[i] == ' ') {
//                i++;
//            }
//        }
//        return s;
//    }
//    public String reverseWords(String s) {
//        int length = s.length();
//        int i = 0;
//        char[] c = s.toCharArray();
//        while (i < length) {
//            int start = i;
//            while (i < length && c[i] != ' ') {
//                i++;
//            }
//            int left = start, right = i - 1;
//            while (left < right) {
//                swap(c, left, right);
//                left++;
//                right--;
//            }
//            while (i < length && c[i] == ' ') {
//                i++;
//            }
//        }
//        return c.toString();
//    }
//    public void swap(char[] c, int left, int right) {
//        char tmp = c[left];
//        c[left] = c[right];
//        c[right] = tmp;
//    }
    //有问题

//    public String reverseWords(String s) {
//        StringBuffer ret = new StringBuffer();
//        int length = s.length();
//        int i = 0;
//        while (i < length) {
//            int start = i;
//            while (i < length && s.charAt(i) != ' ') {
//                i++;
//            }
//            for (int p = start; p < i; p++) {
//                ret.append(s.charAt(start + i - 1 - p));
//            }
//            while (i < length && s.charAt(i) == ' ') {
//                i++;
//                ret.append(' ');
//            }
//        }
//        return ret.toString();
//    }
//    public String reverseWords(String s) {
//        StringBuffer sb = new StringBuffer();
//        int length = s.length();
//        int i = 0;
//        while (i < length) {
//            int start = i;
//            while (i < length && s.charAt(i) != ' ') i++;
//            for (int p = start; p < i; p++) sb.append(s.charAt(start + i - 1 - p));
//            while (i < length && i == ' ') {
//                i++;
//                sb.append(' ');
//            }
//        }
//        return sb.toString();
//    }
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        int length = s.length();
        int i = 0;
        while (i < length) {
            int start = i;
            while (i < length && s.charAt(i) != ' ') i++;
            for (int p = start; p < i; p++) sb.append(s.charAt(start + i - 1 - p));
            while (i < length && i == ' ') {
                i++;
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}