package com.leetcode.tanxin;
//单调递增的数字
public class Problem738 {
//    public int monotoneIncreasingDigits(int N) {
//        char[] S = String.valueOf(N).toCharArray();
//        int i = 1;
//        while (i < S.length && S[i - 1] <= S[i]) i++;
//        while (0 < i && i < S.length && S[i - 1] > S[i]) S[--i]--;
//        for (int j = i + 1; j < S.length; ++j) S[j] = '9';
//
//        return Integer.parseInt(String.valueOf(S));
//    }
//    public int monotoneIncreasingDigits(int N) {
//        char[] S = String.valueOf(N).toCharArray();
//        int i = 1;
//        while (i < S.length && S[i-1] <= S[i]) i++;
//        while (0 < i && i < S.length && S[i-1] > S[i]) S[--i]--;
//        for (int j = i + 1; j < S.length; j++) S[j] = '9';
//
//        return Integer.parseInt(String.valueOf(S));
//    }
    public int monotoneIncreasingDigits(int N) {
        char[] S = String.valueOf(N).toCharArray();
        int i = 1;
        while ( i < S.length && S[i-1] <= S[i]) i++;
        while ( 0 < i && i < S.length && S[i-1] > S[i]) S[--i]--;
        for (int j = i + 1; j < S.length; j++) S[j] = '9';
        return Integer.parseInt(String.valueOf(S));
    }
    //1.先将整数N转换成字符串数组
    //2.从i=1开始遍历字符串数组
    //3.第一个while循环找到第一处非递增的字符
    //4.第二个while循环将第一非递增的字符之前的字符减一，如果剪掉一之后非递增，则继续将前面的数减一
    //5.将i之后从i+1，开始的字符全部变成9
    //最后将字符数组转换成整数输出
}