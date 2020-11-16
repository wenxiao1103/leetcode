package com.leetcode.string;

import java.util.LinkedList;

/**
 * @author xiaowen
 * @date 2020/8/30 9:40 下午
 * 03.无重复字符的最长子串
 */
public class Problem03 {
//    public int lengthOfLongestSubstring(String s) {
//        int result = 0;
//        int curnum = 0;
//        LinkedList<Character> ls = new LinkedList();
//        for (int i = 0; i < s.length(); i++) {
//            if (!ls.contains(s.charAt(i))){
//                ls.add(s.charAt(i));
//                curnum = ls.size();
//                result = Math.max(result, curnum);
//            }else{
//                int first = ls.indexOf(s.charAt(i));
//                for (int j = 0; j < first; j++){
//                    ls.remove();
//                }
//                ls.remove();
//                ls.add(s.charAt(i));
//            }
//        }
//        return result;
//    }
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int curnum = 0;
        LinkedList<Character> ls = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!ls.contains(s.charAt(i))) {
                ls.add(s.charAt(i));
                curnum = ls.size();
                result = Math.max(result, curnum);
            }else {
                int first = ls.indexOf(s.charAt(i));
                for (int j = 0; j < first; j++) {
                    ls.remove();
                }
                ls.remove();
                ls.add(s.charAt(i));
            }
        }
        return result;
    }
}
