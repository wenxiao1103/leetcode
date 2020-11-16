package com.leetcode.tanxin;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/9/8 11:08 下午
 *
 * 763.分字母区间
 */
public class Problem763 {
//    public List<Integer> partitionLabels(String S) {
//        int[] last = new int[26];
//        for (int i = 0; i < S.length(); ++i)
//            last[S.charAt(i) - 'a'] = i;
//
//        int j = 0, anchor = 0;
//        List<Integer> ans = new ArrayList();
//        for (int i = 0; i < S.length(); ++i) {
//            j = Math.max(j, last[S.charAt(i) - 'a']);
//            if (i == j) {
//                ans.add(i - anchor + 1);
//                anchor = i + 1;
//            }
//        }
//        return ans;
//    }
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); i++) {
            last[S.charAt(i) - 'a'] = i;
        }
        List<Integer> list = new ArrayList<>();
        int right = 0;
        int left = 0;
        for (int i = 0; i < S.length(); i++) {
            right = Math.max(right, last[S.charAt(i)-'a']);
            if(right == i){
                list.add(right-left+1);
                left = i+1;
            }
        }
        return list;
    }
}
