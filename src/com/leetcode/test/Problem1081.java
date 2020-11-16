package com.leetcode.test;

import java.util.Stack;

//不同字符的最小子序列
public class Problem1081 {
//    public  String smallestSubsequence(String text) {
//        int len = text.length();
//        char tmp;
//        StringBuffer sb = new StringBuffer();
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < len; i++) {
//            tmp = text.charAt(i);
//            if (stack.contains(tmp))
//                continue;
//            while (!stack.isEmpty() && tmp < stack.peek() && text.lastIndexOf(stack.peek()) > i) {
//                stack.pop();
//            }
//            stack.push(tmp);
//        }
//        while (!stack.isEmpty())
//            sb.append(stack.pop());
//        return sb.reverse().toString();
//    }
    public String smallestSubsequence(String text) {
        int len = text.length();
        char tmp;
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        //这个for循环是关键
        for (int i = 0; i < len; i++) {
            tmp = text.charAt(i);
            if (stack.contains(tmp))
                continue;
            while (!stack.isEmpty() && tmp < stack.peek() && text.lastIndexOf(stack.peek()) > i) {
                stack.pop();
            }//这步是关键，保证了按照字典的排序的最小子序列，就是将前面比当前字符小的出栈，但是这个出栈的数在后面还有
            stack.push(tmp);
        }
        while (!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
