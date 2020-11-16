package com.ms.problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaowen
 * @date 2020/8/26 10:41 下午
 */
//最长单词
public class Problem1715 {
    public boolean isComposeWord(Set<String> set, String word) {
        if(word.length() == 0) return true;
        for (int i = 0; i < word.length(); i++) {
            if(set.contains(word.substring(0, i+1)) && isComposeWord(set, word.substring(i+1))){
                return true;
            }
        }
        return false;
    }
    public String longestWord(String[] words) {
        Arrays.sort(words, (o1, o2) -> {
            if(o1.length() == o2.length()){
                return o1.compareTo(o2);
            }else {
                return Integer.compare(o2.length(), o1.length());
            }
        });
        Set<String> set = new HashSet<>(Arrays.asList(words));
        for (String word : words) {
            set.remove(word);
            if(isComposeWord(set, word)){
                return word;
            }
            set.add(word);
        }
        return "";
    }
}
