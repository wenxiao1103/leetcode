package com.leetcode.string;

/**
 * @author xiaowen
 * @date 2020/9/13 4:42 下午
 *
 * 1541. 平衡括号字符串的最少插入次数
 */
public class Problem1541 {
//    public int minInsertions(String s) {
//        int insertions = 0;
//        int leftCount = 0;
//        int length = s.length();
//        int index = 0;
//        while (index < length) {
//            char c = s.charAt(index);
//            if (c == '(') {
//                leftCount++;
//                index++;
//            } else {
//                if (leftCount > 0) {
//                    leftCount--;
//                } else {
//                    insertions++;
//                }
//                if (index < length - 1 && s.charAt(index + 1) == ')') {
//                    index += 2;
//                } else {
//                    insertions++;
//                    index++;
//                }
//            }
//        }
//        insertions += leftCount * 2;
//        return insertions;
//    }
    public int minInsertions(String s) {
        int insertion = 0;
        int leftCount = 0;
        int index = 0;
        int length = s.length();
        while (index < length) {
            char c = s.charAt(index);
            if (c == '(') {
                leftCount++;
                index++;
            } else {
                if (leftCount > 0) {
                    leftCount--;
                } else {
                    insertion++;
                }
                if (index < length - 1 && s.charAt(index + 1) == ')') {
                    index += 2;
                } else {
                    insertion++;
                    index++;
                }
            }
        }
        insertion += leftCount * 2;
        return insertion;
    }
}
