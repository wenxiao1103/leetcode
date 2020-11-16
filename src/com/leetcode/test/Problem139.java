package com.leetcode.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author xiaowen
 * @date 2020/9/16 11:32 下午
 *
 * 139. 单词拆分
 */
public class Problem139 {

//    public boolean wordBreak(String s, List<String> wordDict) {
//        Set<String> wordDictSet = new HashSet(wordDict);
//        boolean[] dp = new boolean[s.length() + 1];
//        dp[0] = true;
//        for (int i = 1; i <= s.length(); i++) {
//            for (int j = 0; j < i; j++) {
//                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
//                    dp[i] = true;
//                    break;
//                }
//            }
//        }
//        return dp[s.length()];
//    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDIctSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDIctSet.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
