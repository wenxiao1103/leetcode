package com.leetcode.test;

import java.util.Arrays;

/**
 * @author xiaowen
 * @date 2020/9/19 9:50 下午
 *
 * 440. 字典序的第K小数字
 */
public class Problem440 {
//    public static void main(String[] args) {
//        String[] strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
//        Arrays.sort(strings);
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
//        }
//    }
    public static void main(String[] args) {
        System.out.println(findKthNumber(13, 2));
    }
//    public static int findKthNumber(int n, int k) {
//        int prefix = 1;
//        int count = 1;
//        while(count < k) {
//            int curCount = countNode(prefix, n);
//            if(curCount + count > k) {
//                prefix *= 10;
//                count++;
//            } else {
//                prefix++;
//                count += curCount;
//            }
//        }
//        return prefix;
//    }
    public static int findKthNumber(int n, int k) {
        int prefix = 1;
        int count = 1;
        while (count < k) {
            int curCount = countNode(prefix, n);
            if (count + curCount > k) {
                prefix *= 10;
                count++;
            }else {
                prefix++;
                count += curCount;
            }
        }
        return prefix;
    }
    private static int countNode(int prefix, int n) {
        int count = 0;
        int nextPrefix = prefix + 1;
        while (prefix <= n) {
            count += Math.min(n+1, nextPrefix) - prefix;
            if( prefix <= n/10) {
                prefix *= 10;
                nextPrefix *= 10;
            } else {
                break;
            }
        }
        return count;
    }
}
