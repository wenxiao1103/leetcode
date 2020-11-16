package com.leetcode.string;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author xiaowen
 * @date 2020/9/8 10:38 下午
 *
 * 767.重构字符串
 */
public class Problem767 {
//    public String reorganizeString(String S) {
//        int N = S.length();
//        int[] counts = new int[26];
//        for (char c: S.toCharArray()) counts[c-'a'] += 100;
//        for (int i = 0; i < 26; ++i) counts[i] += i;
//        //Encoded counts[i] = 100*(actual count) + (i)
//        Arrays.sort(counts);
//
//        char[] ans = new char[N];
//        int t = 1;
//        for (int code: counts) {
//            int ct = code / 100;
//            char ch = (char) ('a' + (code % 100));
//            if (ct > (N+1) / 2) return "";
//            for (int i = 0; i < ct; ++i) {
//                if (t >= N) t = 0;
//                ans[t] = ch;
//                t += 2;
//            }
//        }
//
//        return String.valueOf(ans);
//    }
    public String reorganizeString(String S) {
        int N = S.length();
        int[] counts = new int[26];
        for (char c : S.toCharArray()) counts[c-'a'] += 100;
        for (int i = 0; i < 26; i++) counts[i] += i;
        Arrays.sort(counts);

        char[] ans = new char[N];
        int t = 1;
        for (int code : counts) {
            int ct = code / 100;
            char ch = (char)('a'+(code%100));
            if (ct > (N + 1) / 2) return "";
            for (int i = 0; i < ct; i++) {
                if (t >= N) t = 0;
                ans[t] = ch;
                t += 2;
            }
        }
        return String.valueOf(ans);
    }
}
