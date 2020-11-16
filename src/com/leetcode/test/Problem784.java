package com.leetcode.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/11/12 11:33 下午
 *
 * 784. 字母大小写全排列
 */
public class Problem784 {
//    public List<String> letterCasePermutation(String S) {
//        List<StringBuilder> ans = new ArrayList();
//        ans.add(new StringBuilder());
//
//        for (char c : S.toCharArray()) {
//            int n = ans.size();
//            if (Character.isLetter(c)) {
//                for (int i = 0; i < n; ++i) {
//                    ans.add(new StringBuilder(ans.get(i)));
//                    ans.get(i).append(Character.toLowerCase(c));
//                    ans.get(n + i).append(Character.toUpperCase(c));
//                }
//            } else {
//                for (int i = 0; i < n; ++i)
//                    ans.get(i).append(c);
//            }
//        }
//
//        List<String> finalans = new ArrayList();
//        for (StringBuilder sb : ans)
//            finalans.add(sb.toString());
//        return finalans;
//    }
    public List<String> letterCasePermutation(String S) {
        List<StringBuilder> ans = new ArrayList<>();
        ans.add(new StringBuilder());

        for (char c : S.toCharArray()) {
            int n = ans.size();
            if (Character.isLetter(c)) {
                for (int i = 0; i < n; i++) {
                    ans.add(new StringBuilder(ans.get(i)));
                    ans.get(i).append(Character.toLowerCase(c));
                    ans.get(n + i).append(Character.toUpperCase(c));
                }
            } else {
                for (int i = 0; i < n; i++)
                    ans.get(i).append(c);
            }
        }
        List<String> finalns = new ArrayList<>();
        for (StringBuilder sb : ans)
            finalns.add(sb.toString());
        return finalns;
    }
}