package com.leetcode.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/9/6 8:54 下午
 *
 * 216.组合总数3
 */
public class Problem216 {
//    public List<List<Integer>> combinationSum3(int k, int n){
//        List<List<Integer>> list = new ArrayList<>();
//        backtrack(list, new ArrayList<Integer>(), k, n, 1);
//        return list;
//    }
//    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int k, int remain, int start){
//        if(tempList.size() > k) return;
//        else if(tempList.size() == k && remain == 0){
//            list.add(new ArrayList<>(tempList));
//        }else if(remain < 0){
//            return;
//        }
//        else{
//            for(int i = start; i <= 9; i++){
//                tempList.add(i);
//                backtrack(list, tempList, k, remain-i, i+1);
//                tempList.remove(tempList.size()-1);
//            }
//        }
//    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<Integer>(), k, n, 1);
        return list;
    }
    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int k, int remain, int start) {
        if(tempList.size() > k) return;
        else if(tempList.size() == k && remain == 0){
            list.add(new ArrayList<>(tempList));
        }else if (remain < 0){
            return;
        }else{
            for (int i = start; i <= 9; i++) {
                tempList.add(i);
                backtrack(list, tempList, k, remain-i, i+1);
                tempList.remove(i);
            }
        }
    }
}
