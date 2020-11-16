package com.leetcode.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/9/12 4:01 下午
 *
 * 1577. 数的平方等于两数乘积的方法数
 */
public class Problem1577 {
//    public int numTriplets(int[] nums1, int[] nums2) {
//        return function(nums1,nums2) + function(nums2,nums1);
//    }
//    public int function(int[] nums1, int[] nums2){
//        int res = 0;
//        if(nums1.length <2){
//            return res;
//        }
//        Map<Long,Integer> map = new HashMap<>();
//        for(int i=0; i<nums1.length-1; i++){
//            for(int j=i+1; j<nums1.length; j++){
//                long tmp = (long)nums1[i] * (long)nums1[j];
//                map.put(tmp, map.getOrDefault(tmp,0)+1);
//            }
//        }
//        for(int i=0; i<nums2.length; i++){
//            long tmp = (long)nums2[i] * (long)nums2[i];
//            if(map.containsKey(tmp)){
//                res += map.get(tmp);
//            }
//        }
//        return res;
//    }
    public int numTriplets(int[] nums1, int[] nums2) {
        return function(nums1, nums2) + function(nums2, nums1);
    }
    public int function(int[] nums1, int[] nums2) {
        int res = 0;
        if (nums1.length < 2) return res;
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                long tmp = (long)nums1[i]*(long)nums1[j];
                map.put(tmp, map.getOrDefault(tmp, 0) + 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            long tmp = (long)nums2[i] * (long)nums2[i];
            if (map.containsKey(tmp)) {
                res += map.get(tmp);
            }
        }
        return res;
    }
}
