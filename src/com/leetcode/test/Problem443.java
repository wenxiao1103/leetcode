package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/5 4:57 下午
 *
 * 443. 压缩字符串
 */
public class Problem443 {
//    public int compress(char[] chars) {
//        int anchor = 0, write = 0;
//        for (int read = 0; read < chars.length; read++) {
//            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
//                chars[write++] = chars[anchor];
//                if (read > anchor) {
//                    for (char c : ("" + (read - anchor + 1)).toCharArray()) {
//                        chars[write++] = c;
//                    }
//                }
//                anchor = read + 1;
//            }
//        }
//        return write;
//    }
//    public int compress(char[] chars) {
//        int anchor = 0;
//        int write = 0;
//        for (int read = 0; read < chars.length; read++) {
//            if (read + 1 == chars.length || chars[read+1] != chars[read]) {
//                chars[write++] = chars[anchor];
//                if (read > anchor) {
//                    for (char c : ("" + (read - anchor + 1)).toCharArray()) {
//                        chars[write++] = c;
//                    }
//                }
//                anchor = read + 1;
//            }
//        }
//        return write;
//    }
//    public int compress(char[] chars) {
//        int anchor = 0;
//        int write = 0;
//        for (int read = 0; read < chars.length; read++) {
//            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
//                chars[write++] = chars[anchor];
//                if (read > anchor) {
//                    for (char c : ("" + (read - anchor + 1)).toCharArray()) {
//                        chars[write++] = c;
//                    }
//                }
//                anchor = read + 1;
//            }
//        }
//        return write;
//    }
    public int compress(char[] chars) {
        int anchor = 0;
        int write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    for (char c : ("" + (read - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = read+1;
            }
        }
        return write;
    }
}