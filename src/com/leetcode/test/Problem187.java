package com.leetcode.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/8/27 10:23 下午
 *
 * 187. 重复的DNA序列
 */
public class Problem187 {
//    public List<String> findRepeatedDnaSequences(String s) {
//        int L = 10, n = s.length();
//        HashSet<String> seen = new HashSet(), output = new HashSet();
//
//        // iterate over all sequences of length L
//        for (int start = 0; start < n - L + 1; ++start) {
//            String tmp = s.substring(start, start + L);
//            if (seen.contains(tmp)) output.add(tmp);
//            seen.add(tmp);
//        }
//        return new ArrayList<String>(output);
//    }
    public List<String> findRepeatedDnaSequences(String s){
        int L = 10, n = s.length();
        HashSet<String> seen = new HashSet<>();
        HashSet<String> output = new HashSet<>();

        for (int start = 0; start < n - L + 1; start++) {
            String tmp = s.substring(start, start + L);
            if (seen.contains(tmp)) output.add(tmp);
            seen.add(tmp);
        }
        return new ArrayList<String>(output);
    }
}
