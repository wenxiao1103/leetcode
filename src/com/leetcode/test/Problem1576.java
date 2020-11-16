package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/12 4:22 下午
 *
 * 1576. 替换所有的问号
 */
public class Problem1576 {
//    public String modifyString(String s) {
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '?') {
//                char ahead = i == 0 ? ' ' : chars[i - 1];
//                char behind  = i == chars.length - 1 ? ' ' : chars[i + 1];
//                char temp = 'a';
//                while (temp == ahead || temp == behind ) {
//                    temp++;
//                }
//                chars[i] = temp;
//            }
//        }
//        return new String(chars);
//    }
    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == '?') {
                char ch = 'a';
                char ahead = i == 0 ? ' ' : chars[i-1];
                char atail = i == s.length()-1 ? ' ' : chars[i+1];
                while (ch == ahead || ch == atail) {
                    ch++;
                }
                chars[i] = ch;
            }
        }
        return new String(chars);
    }
}
