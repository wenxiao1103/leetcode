package com.leetcode.string;
//翻转字符串里的单词
public class Problem151 {
//    public String reverseWords(String s){
//        String[] words = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for(int i = words.length-1; i >= 0; i--){
//            if(words[i].equals("")){
//                continue;
//            }
//            if(i != words.length-1){
//                sb.append(" ");
//            }
//            sb.append(words[i]);
//        }
//        return sb.toString();
//    }
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length-1; i >= 0; i--) {
            if(str[i].equals("")) continue;
            if(i != str.length-1){
                sb.append(" ");
            }
            sb.append(str[i]);
        }
        return sb.toString();
    }
}
