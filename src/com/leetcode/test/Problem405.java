package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/19 8:53 下午
 *
 * 405. 数字转换为十六进制数
 */
public class Problem405 {
//    public String toHex(int num) {
//        StringBuffer buffer = new StringBuffer();
//        char[] arr ="0123456789abcdef".toCharArray();
//        if(num==0) return "0";
//        while (num!=0){
//            int tmp=num&15;
//            buffer.append(arr[tmp]);
//            num=num>>>4;
//        }
//        return buffer.reverse().toString();
//    }
    public String toHex(int num) {
        StringBuffer sb = new StringBuffer();
        char[] arr = "0123456789abcdef".toCharArray();
        if (num == 0) return "0";
        while (num != 0) {
            int tmp = num & 15;
            sb.append(arr[tmp]);
            num = num >> 4;
        }
        return sb.toString();
    }
}
