package com.leetcode.test;

import java.util.Stack;

//最长有效括号
public class Problem32 {
//    public int longestValidParentheses(String s) {
//        int maxans = 0;
//        Stack<Integer> stack = new Stack<>();
//        stack.push(-1);
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                stack.push(i);
//            } else {
//                stack.pop();
//                if (stack.empty()) {
//                    stack.push(i);
//                } else {
//                    maxans = Math.max(maxans, i - stack.peek());
//                }
//            }
//        }
//        return maxans;
//    }
    public int longestValidParentheses(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }

}
