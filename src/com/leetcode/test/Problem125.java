package com.leetcode.test;

import com.sun.tools.javac.util.RichDiagnosticFormatter;

/**
 * @author xiaowen
 * @date 2020/9/16 10:19 下午
 *
 * 125. 验证回文串
 */
public class Problem125 {
//    public boolean isPalindrome(String s) {
//        int n = s.length();
//        int left = 0, right = n - 1;
//        while (left < right) {
//            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                ++left;
//            }
//            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                --right;
//            }
//            if (left < right) {
//                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                    return false;
//                }
//                ++left;
//                --right;
//            }
//        }
//        return true;
//    }
    public boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
