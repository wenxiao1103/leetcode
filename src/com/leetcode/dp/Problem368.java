package com.leetcode.dp;

import javax.swing.text.EditorKit;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/9/30 9:27 下午
 */
public class Problem368 {
//    public List<Integer> largestDivisibleSubset(int[] nums) {
//        int n = nums.length;
//        if (n == 0) return new ArrayList();
//        List<ArrayList> EDS = new ArrayList();
//        for (int num : nums) EDS.add(new ArrayList());
//
//        Arrays.sort(nums);
//
//        for (int i = 0; i < n; ++i) {
//            List<Integer> maxSubset = new ArrayList();
//
//            for (int k = 0; k < i; ++k)
//                if (nums[i] % nums[k] == 0 && maxSubset.size() < EDS.get(k).size())
//                    maxSubset = EDS.get(k);
//
//            EDS.get(i).addAll(maxSubset);
//            EDS.get(i).add(nums[i]);
//        }
//        List<Integer> ret = new ArrayList();
//        for (int i = 0; i < n; ++i)
//            if (ret.size() < EDS.get(i).size()) ret = EDS.get(i);
//        return ret;
//    }
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();
        List<ArrayList> dp = new ArrayList<>();
        for (int num : nums) dp.add(new ArrayList());
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            List<Integer> max = new ArrayList<>();
            for (int k = 0; k < i; k++) {
                if (nums[i] % nums[k] == 0 && max.size() < dp.get(k).size()) {
                    max = dp.get(k);
                }
            }
            dp.get(i).addAll(max);
            dp.get(i).add(nums[i]);
        }
        for (int i = 0; i < n; i++) {
            if (result.size() < dp.get(i).size())
                result = dp.get(i);
        }
        return result;
    }
}