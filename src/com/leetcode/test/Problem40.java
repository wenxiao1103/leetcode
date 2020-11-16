package com.leetcode.test;

import sun.jvm.hotspot.memory.Generation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/9/6 9:59 下午
 *
 * 40.组合总和2
 */
public class Problem40 {
//    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        Arrays.sort(candidates);
//        List<List<Integer>> res = new ArrayList<List<Integer>>();
//        List<Integer> out = new ArrayList<Integer>();
//        helper(candidates, target, 0, out, res);
//        return res;
//    }
//
//    public static void helper(int[] candidates, int target, int start, List<Integer> out, List<List<Integer>> res){
//        if(target < 0){
//            return;
//        }else if(target == 0){
//            res.add(new ArrayList<>(out));
//        }
//
//        for(int i = start; i < candidates.length; i++){
//            if(candidates[i] > target){
//                break;
//            }
//            if(i > start && candidates[i] == candidates[i-1]){
//                continue;
//            }
//            out.add(candidates[i]);
//            helper(candidates, target-candidates[i], i+1, out, res);
//            out.remove(out.size()-1);
//        }
//    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        helper(candidates, target, 0, out, res);
        return res;
    }

    public void helper(int[] candidates, int target, int start, List<Integer> out, List<List<Integer>> res) {
        if(target < 0) return;
        else if (target == 0) res.add(new ArrayList<>(out));
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] < target){
                break;
            }
            if (i > start && candidates[i] == candidates[i-1]) {
                continue;
            }
            out.add(candidates[i]);
            helper(candidates, target-candidates[i], i + 1, out, res);
            out.remove(out.size()-1);
        }
    }
}
