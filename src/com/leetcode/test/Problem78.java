package com.leetcode.test;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/11/12 11:51 下午
 */
public class Problem78 {
//    List<Integer> t = new ArrayList<Integer>();
//    List<List<Integer>> ans = new ArrayList<List<Integer>>();
//
//    public List<List<Integer>> subsets(int[] nums) {
//        dfs(0, nums);
//        return ans;
//    }
//
//    public void dfs(int cur, int[] nums) {
//        if (cur == nums.length) {
//            ans.add(new ArrayList<Integer>(t));
//            return;
//        }
//        t.add(nums[cur]);
//        dfs(cur + 1, nums);
//        t.remove(t.size() - 1);
//        dfs(cur + 1, nums);
//    }
    List<Integer> t = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nuns) {
        dfs(0, nuns);
        return ans;
    }
    public void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            ans.add(new ArrayList<>(t));
            return;
        }
        t.add(nums[cur]);
        dfs(cur + 1, nums);
        t.remove(t.size() - 1);
        dfs(cur + 1, nums);
    }
}