package com.leetcode.test;

import java.util.Arrays;
import java.util.Comparator;

//俄罗斯套娃信封问题
public class Problem354 {
//    public int maxEnvelopes(int[][] envelopes) {
//        int len = envelopes.length;
//        if (len < 2) {
//            return len;
//        }
//        Arrays.sort(envelopes, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] envelope1, int[] envelope2) {
//                if (envelope1[0] != envelope2[0]) {
//                    return envelope1[0] - envelope2[0];
//                }
//                return envelope2[1] - envelope1[1];
//            }
//        });
//        int[] tail = new int[len];
//        tail[0] = envelopes[0][1];
//        int end = 0;
//        for (int i = 1; i < len; i++) {
//            int target = envelopes[i][1];
//            if (target > tail[end]) {
//                end++;
//                tail[end] = target;
//            } else {
//                int left = 0;
//                int right = end;
//
//                while (left < right) {
//                    int mid = (left + right) /2;
//                    if (tail[mid] < target) {
//                        left = mid + 1;
//                    } else {
//                        right = mid;
//                    }
//                }
//                tail[left] = target;
//            }
//        }
//        return end + 1;
//    }
    public int maxEnvelopes(int[][] envelopes) {
        int len = envelopes.length;
        if (len < 2) { return len;}
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] envelope1, int[] envelope2) {
                if (envelope1[0] != envelope2[0]) {
                    return envelope1[0] - envelope2[0];
                }
                return envelope2[1] - envelope1[1];
            }
        });
        int[] tail = new int[len];
        tail[0] = envelopes[0][1];
        int end = 0;
        for (int i = 1; i < len; i++) {
            int target = envelopes[i][1];
            if(target > tail[end]) {
                end++;
                tail[end] = target;
            }else{
                int left = 0;
                int right = end;
                while (left < right) {
                    int mid = (left + right) / 2;
                    if (tail[mid] < target) {
                        left = mid + 1;
                    }else {
                        right = mid;
                    }
                }
                tail[left] = target;
            }
        }
        return end + 1;
    }
    //算法等于排序+最长上升子序列
    //先对宽度进行升序排序，如果宽度相等，则高度按降序排序，这是就变成，h的最长上升子序列
    //依次遍历数组
}
