package com.leetcode.string;

import java.util.List;

/**
 *
 * 524.通过删除字母匹配到字典里最长的单词
 *
 * */
public class Problem524 {
//    public boolean isSubsequence(String x, String y) {
//        int j = 0;
//        for (int i = 0; i < y.length() && j < x.length(); i++)
//            if (x.charAt(j) == y.charAt(i))
//                j++;
//        return j == x.length();
//    }
//    public String findLongestWord(String s, List< String > d) {
//        String max_str = "";
//        for (String str: d) {
//            if (isSubsequence(str, s)) {
//                if (str.length() > max_str.length() || (str.length() == max_str.length() && str.compareTo(max_str) < 0))
//                    max_str = str;
//            }
//        }
//        return max_str;
//    }
    public boolean isSubsequence(String x, String y) {
        int j = 0;
        for (int i = 0; i < y.length() && j < x.length(); i++) {
            if (x.charAt(j) == y.charAt(i)) j++;
        }
        return j == x.length();
    }
    public String findLongestWord(String s, List<String> d) {
        String max_str = "";
        for (String str : d) {
            if (isSubsequence(str, s)) {
                if (str.length() > max_str.length() || (str.length() == max_str.length() && str.compareTo(max_str) < 0)) max_str = str;
            }
        }
        return max_str;
    }
}
