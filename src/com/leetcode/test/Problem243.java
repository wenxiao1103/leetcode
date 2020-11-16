package com.leetcode.test;

import java.util.List;

/**
 * @author xiaowen
 * @date 2020/8/28 9:49 下午
 */
public class Problem243 {
//    public:
//    int shortestDistance(vector<string>& words, string word1, string word2) {
//        int idx = -1, res = INT_MAX;
//        for (int i = 0; i < words.size(); ++i) {
//            if (words[i] == word1 || words[i] == word2) {
//                if (idx != -1 && words[idx] != words[i]) {
//                    res = min(res, i - idx);
//                }
//                idx = i;
//            }
//        }
//        return res;
//    }
    public int shortestDistance(String[] words, String word1, String word2) {
        int idx = -1;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i  < words.length; i++) {
            if (words[i] == word1 || words[i] == word2) {
                if(idx != -1 && words[idx] != words[i]) {
                    res = Math.min(res, i - idx);
                }
                i = idx;
            }
        }
        return res;
    }
}
