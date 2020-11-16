package com.leetcode.test;

import java.util.ArrayList;
import java.util.List;

//递增子序列,给定一个整型数组, 你的任务是找到所有该数组的递增子序列，递增子序列的长度至少是2。
public class Problem491 {
//    private List<List<Integer>> res;
//    public List<List<Integer>> findSubsequences(int[] nums) {
//        res = new ArrayList<>();
//        dfs(nums, new ArrayList<>(), 0, -101);
//        return res;
//    }
//    private void dfs(int[] nums, List<Integer> tmp, int index, int lastNum) {
//        if (tmp.size() > 1) {
//            res.add(new ArrayList<>(tmp));
//        }
//        for (int i = index; i < nums.length; i++) {
//            if (nums[i] < lastNum) {
//                continue;
//            }
//            boolean isRepeat = false;
//            for (int j = index; j <= i - 1; j++) {
//                if (nums[j] == nums[i]) {
//                    isRepeat = true;
//                    break;
//                }
//            }
//            if (isRepeat) {
//                continue;
//            }
//            tmp.add(nums[i]);
//            dfs(nums, tmp, i + 1, nums[i]);
//            tmp.remove(tmp.size() - 1);
//        }
//    }
    private List<List<Integer>> res;
    public List<List<Integer>> findSubsequences(int[] nums) {
        res = new ArrayList<>();
        dfs(nums, new ArrayList<>(), 0, -101);
        return res;
    }
    public void dfs(int[] nums ,List<Integer> tmp, int index, int lastNum) {
        if (tmp.size() > 1) {
            res.add(new ArrayList<>(tmp));
        }
        for (int i = index; i < nums.length; i++) {
            if (nums[i] < lastNum) {
                continue;
            }
            boolean isRepeat = false;
            for (int j = index; j <= i-1; j++) {
                if (nums[j] == nums[i]){
                    isRepeat = true;
                    break;
                }
            }//这个for循环很重要，既能排除数字相同的情况，又能将相同的数字加入递增子序列
            if (isRepeat) {
                continue;
            }//保证没有重复的整数
            tmp.add(nums[i]);
            dfs(nums, tmp, i+1, nums[i]);
            tmp.remove(tmp.size() - 1);
        }
    }
    //深度优先搜索，
}
