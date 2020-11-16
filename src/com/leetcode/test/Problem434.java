package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/5 4:31 下午
 *
 * 434. 字符串中的单词数
 */
public class Problem434 {

//    public int countSegments(String s) {
//        int segmentCount = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
//                segmentCount++;
//            }
//        }
//        return segmentCount;
//    }
    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
}
