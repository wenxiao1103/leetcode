package com.leetcode.tanxin;

import java.util.Stack;

//移掉k位数字
public class Problem402 {
//    public String removeKdigits(String num, int k) {
//        int len = num.length();
//        //corner case
//        if(k==len)
//            return "0";
//        Stack<Character> stack = new Stack<>();
//        int i =0;
//        while(i<num.length()){
//            //whenever meet a digit which is less than the previous digit, discard the previous one
//            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
//                stack.pop();
//                k--;
//            }
//            stack.push(num.charAt(i));
//            i++;
//        }
//        // corner case like "1111"
//        while(k>0){
//            stack.pop();
//            k--;
//        }
//        //construct the number from the stack
//        StringBuilder sb = new StringBuilder();
//        while(!stack.isEmpty())
//            sb.append(stack.pop());
//        sb.reverse();
//        //remove all the 0 at the head
//        while(sb.length()>1 && sb.charAt(0)=='0')
//            sb.deleteCharAt(0);
//        return sb.toString();
//    }
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if (k == len) return "0";
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < num.length()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        return sb.toString();
    }

    //采用贪心的思想
    //1。如何移除的位数k等于字符串的长度，则返回"0"
    //2。while（i<num.length())循环依次遍历字符串的每个字符
    //3。在第一个while循环里嵌套的while循环，这步是重点
    //while (i < num.length()) {
    //            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
    //                stack.pop();
    //                k--;
    //            }
    //            stack.push(num.charAt(i));
    //            i++;
    //        }
    //第二个循环，判断应该移除那些字符，当k>0并且栈非空和栈定的元素大于当前遍历到的元素则弹出，
    //5。将遍历的字符压栈，遍历下一个字符
    //6。当前面的遍历没有删除够位数，则这个循环就移除将栈顶元素出栈
}
