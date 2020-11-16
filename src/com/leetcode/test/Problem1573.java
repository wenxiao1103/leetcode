package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/12 5:07 下午
 *
 * 1573. 分割字符串的方案数
 */
public class Problem1573 {
//    public int numWays(String s) {
//        int len = s.length();
//        int count_1 = 0;
//        for (int i = 0; i < len; i++) {
//            if (s.charAt(i) == '1') count_1++;
//        }
//        if (count_1 == 0){
//            int n = len - 1;
//            return (int)((1L * n * (n - 1) / 2) % 1000000007);
//        }else if (count_1 % 3 != 0){
//            return 0;
//        }else{
//            int k = count_1 / 3;    // 每一段包含1的个数
//            int count = 0, m = 0, n = 0;    // count用来计数目前1的个数
//            for (int i = 0; i < len; i++) {
//                if (s.charAt(i) == '1'){
//                    count++;
//                    if (count == k) m = i;
//                    if (count == k + 1) m = i - m;
//                    if (count == k * 2) n = i;
//                    if (count == k * 2 + 1){
//                        n = i - n;
//                        break;
//                    }
//                }
//            }
//            return (int)((1L * m * n) % 1000000007);
//        }
//    }
    public int numWays(String s) {
        int len = s.length();
        int count_1 = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1') count_1++;
        }
        if (count_1 == 0) {
            int n = len - 1;
            return (int)((1L * n * (n - 1) / 2) % 1000000007);
        }else if (count_1 % 3 != 0) {
            return 0;
        } else {
            int k = count_1 / 3;
            int count = 0, m = 0, n = 0;
            for (int i = 0; i < len; i++) {
                if (s.charAt(i) == '1') {
                    count++;
                    if (count == k) m = i;
                    if (count == k + 1) m = i - m;
                    if (count == 2 * k) n = i;
                    if (count == 2 * k + 1) {
                        n = i - n;
                        break;
                    }
                }
            }
            return (int)((1L * m * n)%1000000007);
        }
    }
}
