package com.leetcode.test;

import java.util.Arrays;

//重新排列句子中的单词
public class Problem1451 {
    public String arrangeWords(String text) {
        String[] s = text.toLowerCase().split(" ");
        Arrays.sort(s, (o1, o2)->{
            return o1.length()-o2.length();
        });

        char first = s[0].charAt(0);
        first = (char)(first-32);
        s[0] = first + s[0].substring(1);
        return String.join(" ", s);
    }
}
