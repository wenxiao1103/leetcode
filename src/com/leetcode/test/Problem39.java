package com.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/9/5 4:30 下午
 *
 * 39.组合总数
 */
public class Problem39 {
//    public List<List<Integer>> combinationSum(int[] candidates, int target){
//        List<List<Integer>> list = new ArrayList<List<Integer>>();
//        if(candidates == null || candidates.length == 0)
//            return list;
//        Arrays.sort(candidates);
//        find(candidates, target, list, new ArrayList<Integer>(), 0);
//        return list;
//    }
//
//    public void find(int[] candidates, int target, List<List<Integer>> list, List<Integer> res, int num){
//        if(target == 0){
//            list.add(res);
//            return;
//        }
//        if(target < candidates[0]) return;
//        for(int i = num;i < candidates.length && candidates[i] <= target; i++){
//            List<Integer> tmp = new ArrayList(res);
//            tmp.add(candidates[i]);
//            find(candidates, target-candidates[i], list, tmp, i);
//        }
//    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        if (candidates == null || candidates.length == 0)
            return list;
        Arrays.sort(candidates);
        find(candidates, target, list, new ArrayList<Integer>(), 0);
        return list;
    }
    public void find(int[] candidates, int target, List<List<Integer>> list, List<Integer> res, int num) {
        if (target == 0) {
            list.add(res);
            return;
        }
        if (target < candidates[0]) return;
        for (int i = num; i < candidates.length && candidates[i] <= target; i++) {
            List<Integer> tmp = new ArrayList<>(res);
            tmp.add(candidates[i]);
            find(candidates, target-candidates[i], list, tmp, i);
        }
    }
}
