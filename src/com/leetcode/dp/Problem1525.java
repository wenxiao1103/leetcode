package com.leetcode.dp;

import com.leetcode.test.HashMapTest;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaowen
 * @date 2020/9/13 3:32 下午
 *
 * 1525. 字符串的好分割数目
 */
public class Problem1525 {
//    public int numSplits(String s) {
//        int n = s.length();
//        int[] left = new int[n + 2];
//        int[] right = new int[n + 2];
//        boolean[] recLeft = new boolean[26];
//        boolean[] recRight = new boolean[26];
//        for (int i = 1; i <= n; i++) {
//            int c = s.charAt(i - 1) - 'a';
//            if (recLeft[c]) {
//                left[i] = left[i - 1];
//            } else {
//                recLeft[c] = true;;
//                left[i] = left[i - 1] + 1;
//            }
//        }
//        for (int i = n; i > 0; i--) {
//            int c = s.charAt(i - 1) - 'a';
//            if (recRight[c]) {
//                right[i] = right[i + 1];
//            } else {
//                recRight[c] = true;
//                right[i] = right[i + 1] + 1;
//            }
//        }
//        int ret = 0;
//        for (int i = 1; i < n; i++) {
//            if (left[i] == right[i + 1]) {
//                ret++;
//            }
//        }
//        return ret;
//    }
    public int numSplits(String s) {
        int n = s.length();
        int[] left = new int[n + 2];
        int[] right = new int[n + 2];
        boolean[] recLeft = new boolean[26];
        boolean[] recRight = new boolean[26];
        for (int i = 1; i <= n; i++) {
            int c = s.charAt(i-1) - 'a';
            if(recLeft[c]) {
                left[i] = left[i - 1];
            }else {
                recLeft[c] = true;
                left[i] = left[i - 1] + 1;
            }
        }
        for (int i = n; i > 0; i--) {
            int c = s.charAt(i-1) - 'a';
            if(recRight[c]) {
                right[i] = right[i + 1];
            }else {
                recRight[c] = true;
                right[i] = right[i + 1] + 1;
            }
        }
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (left[i] == right[i+1]){
                result++;
            }
        }
        return result;
    }
}
