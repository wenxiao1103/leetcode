package com.leetcode.tanxin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * @author xiaowen
 * @date 2020/9/29 10:19 下午
 */
public class Problem316 {

//    public String removeDuplicateLetters(String s) {
//        Stack<Character> stack = new Stack<>();
//        HashSet<Character> seen = new HashSet<>();
//        HashMap<Character, Integer> last_occurrence = new HashMap<>();
//        for(int i = 0; i < s.length(); i++) last_occurrence.put(s.charAt(i), i);
//
//        for(int i = 0; i < s.length(); i++){
//            char c = s.charAt(i);
//            if (!seen.contains(c)){
//                while(!stack.isEmpty() && c < stack.peek() && last_occurrence.get(stack.peek()) > i){
//                    seen.remove(stack.pop());
//                }
//                seen.add(c);
//                stack.push(c);
//            }
//        }
//        StringBuilder sb = new StringBuilder(stack.size());
//        for (Character c : stack) sb.append(c.charValue());
//        return sb.toString();
//    }
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        HashSet<Character> seen = new HashSet<>();
        HashMap<Character, Integer> last_occurrence = new HashMap<>();
        for (int i = 0; i < s.length(); i++) last_occurrence.put(s.charAt(i), i);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen.contains(c)) {
                while (!stack.isEmpty() && c < stack.peek() && last_occurrence.get(stack.peek()) > i) {
                    seen.remove(stack.pop());
                }
                seen.add(c);
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder(stack.size());
        for (Character c : stack) sb.append(c.charValue());
        return sb.toString();
    }
    //c.charValue()将Character转换成char
}
