package com.leetcode.string;

import java.util.Arrays;

/**
 * @author xiaowen
 * @date 2020/9/20 10:09 下午
 */
public class Problem459 {
//    public boolean repeatedSubstringPattern(String s) {
//        return kmp(s + s, s);
//    }

//    public boolean kmp(String query, String pattern) {
//        int n = query.length();
//        int m = pattern.length();
//        int[] fail = new int[m];
//        Arrays.fill(fail, -1);
//        for (int i = 1; i < m; ++i) {
//            int j = fail[i - 1];
//            while (j != -1 && pattern.charAt(j + 1) != pattern.charAt(i)) {
//                j = fail[j];
//            }
//            if (pattern.charAt(j + 1) == pattern.charAt(i)) {
//                fail[i] = j + 1;
//            }
//        }
//        int match = -1;
//        for (int i = 1; i < n - 1; ++i) {
//            while (match != -1 && pattern.charAt(match + 1) != query.charAt(i)) {
//                match = fail[match];
//            }
//            if (pattern.charAt(match + 1) == query.charAt(i)) {
//                ++match;
//                if (match == m - 1) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }
}
