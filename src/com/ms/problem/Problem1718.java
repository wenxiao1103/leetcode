package com.ms.problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author xiaowen
 * @date 2020/8/25 9:52 下午
 */
//最短超串,类似于leetcode最小覆盖子串
public class Problem1718 {
//    public int[] shortestSeq(int[] big, int[] small) {
//        int[] res = new int[2];
//        Set<Integer> set = new HashSet<>();
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int n : small) {
//            set.add(n);
//        }
//        int right = 0;
//        int left = 0;
//        int minLen = Integer.MAX_VALUE;
//        int minLeft = 0;
//        while (right < big.length) {
//            if(map.containsKey(big[right])){
//                map.put(big[right], map.getOrDefault(big[right], 0) + 1);
//                right++;
//                continue;
//            }
//            if(set.contains(big[right])){
//                set.remove(big[right]);
//                map.put(big[right], map.getOrDefault(big[right], 0) + 1);
//            }
//            if(set.size() == 0) {
//                if(right - left + 1 < minLen){
//                    minLen = right - left + 1;
//                    minLeft = left;
//                }
//                while(!map.containsKey(big[left]) || map.get(big[left]) > 1){
//                    if(map.containsKey(big[left])){
//                        map.put(big[left], map.get(big[left]) - 1);
//                    }
//                    left++;
//                }
//                if(right - left + 1 < minLen){
//                    minLen = right - left + 1;
//                    minLeft = left;
//                }
//                set.add(big[left]);
//                map.remove(big[left]);
//                left++;
//            }
//            right++;
//        }
//        if(minLen  == Integer.MAX_VALUE) return new int[0];
//        res[0] = minLeft;
//        res[1] = minLeft + minLen - 1;
//        return res;
//    }
    public int[] shortestSeq(int[] big, int[] small) {
        int[] res = new int[2];
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : small) set.add(n);
        int right = 0, left = 0, minLen = Integer.MAX_VALUE, minLeft = 0;
        while (right < big.length) {
            if (map.containsKey(big[right])) {
                map.put(big[right], map.getOrDefault(big[right], 0) + 1);
                continue;
            }
            if (set.contains(big[right])) {
                set.remove(big[right]);
                map.put(big[right], map.getOrDefault(big[right], 0) + 1);
            }
            if (set.size() == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }
                while (!map.containsKey(big[left]) || map.get(big[right]) > 1) {
                    if (map.containsKey(big[right])) {
                        map.put(big[right], map.get(big[right]) - 1);
                    }
                    left++;
                }
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }
                set.add(big[left]);
                map.remove(big[right]);
                left++;
            }
            right++;
        }
        if (minLen == Integer.MAX_VALUE) return new int[0];
        res[0] = minLeft;
        res[1] = minLeft + minLen - 1;
        return res;
    }
}
