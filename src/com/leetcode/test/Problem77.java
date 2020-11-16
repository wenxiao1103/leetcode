package com.leetcode.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/9/6 10:17 下午
 *
 * 77.组合
 */
public class Problem77 {
//    public List<List<Integer>> combine(int n, int k) {
//        List<List<Integer>> ans = new ArrayList();
//        help(n, k, 0, ans, new ArrayList<Integer>());
//        return ans;
//    }
//
//    void help(int n, int k, int start, List<List<Integer>> ans, List<Integer> l){
//        if (k == 0) ans.add(new ArrayList(l));
//        else{
//            for (int i = start; i < n-k+1; i++){
//                l.add(i+1);
//                help(n, k-1, i+1, ans, l);
//                l.remove(l.size()-1);
//            }
//        }
//    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        help(n, k, 0, ans, new ArrayList<Integer>());
        return ans;
    }

    public void help(int n, int k, int start, List<List<Integer>> ans, List<Integer> l) {
        if(k == 0) ans.add(l);
        else{
            for (int i = start; i < n+1-k; i++) {
                l.add(i);
                help(n, k-1, i+1, ans, l);
                l.remove(l.size()-1);
            }
        }
    }
}
