package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/5 4:06 下午
 *
 * 415. 字符串相加
 */
public class Problem415 {
//    public String addStrings(String num1, String num2) {
//        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
//        StringBuffer ans = new StringBuffer();
//        while (i >= 0 || j >= 0 || add != 0) {
//            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
//            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
//            int result = x + y + add;
//            ans.append(result % 10);
//            add = result / 10;
//            i--;
//            j--;
//        }
//        ans.reverse();
//        return ans.toString();
//    }
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int add = 0;
        StringBuffer sb = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i)-'0':0;
            int y = j >= 0 ? num2.charAt(j)-'0':0;
            int result = x + y + add;
            sb.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        sb.reverse();
        return sb.toString();
    }
}