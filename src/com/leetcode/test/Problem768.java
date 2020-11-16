package com.leetcode.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/10/27 10:52 下午
 *
 * 768. 最多能完成排序的块 II
 */
public class Problem768 {
//    public int maxChunksToSorted(int[] arr) {
//        Map<Integer, Integer> count = new HashMap();
//        int ans = 0, nonzero = 0;
//
//        int[] expect = arr.clone();
//        Arrays.sort(expect);
//
//        for (int i = 0; i < arr.length; ++i) {
//            int x = arr[i], y = expect[i];
//
//            count.put(x, count.getOrDefault(x, 0) + 1);
//            if (count.get(x) == 0) nonzero--;
//            if (count.get(x) == 1) nonzero++;
//
//            count.put(y, count.getOrDefault(y, 0) - 1);
//            if (count.get(y) == -1) nonzero++;
//            if (count.get(y) == 0) nonzero--;
//
//            if (nonzero == 0) ans++;
//        }
//
//        return ans;
//    }
    public int maxChunksToSorted(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 0, nonzero = 0;
        int[] expect = arr.clone();
        Arrays.sort(expect);
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i], y = expect[i];
            count.put(x, count.getOrDefault(x, 0) + 1);
            if (count.get(x) == 0) nonzero--;
            if (count.get(x) == 1) nonzero++;
            count.put(y, count.getOrDefault(y, 0) - 1);
            if (count.get(y) == -1) nonzero++;
            if (count.get(x) == 0) nonzero--;
            if (nonzero == 0) ans++;
        }
        return ans;
    }
}