package com.leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/9/9 10:27 下午
 *
 * 1382. 将二叉搜索树变平衡
 */
public class Problem1382 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
//    public TreeNode balanceBST(TreeNode root) {
//        if(root == null)
//            return null;
//        List<Integer> vals = new ArrayList<>();
//        traversal(root, vals);
//        return build(vals, 0, vals.size() - 1);
//    }
//
//    private void traversal(TreeNode x, List<Integer> vals){
//        if(x == null) return;
//        traversal(x.left, vals);
//        vals.add(x.val);
//        traversal(x.right, vals);
//    }
//
//    private TreeNode build(List<Integer> vals, int lo, int hi){
//        if(lo > hi) return null;
//        if(lo == hi) return new TreeNode(vals.get(hi));
//        int mid = (hi - lo) / 2 + lo;
//        TreeNode x = new TreeNode(vals.get(mid));
//        x.left = build(vals, lo, mid - 1);
//        x.right = build(vals, mid + 1, hi);
//        return x;
//    }
    public TreeNode balanceBST(TreeNode root) {
        if(root == null) return null;
        List<Integer> vals = new ArrayList<>();
        traversal(root, vals);
        return build(vals, 0, vals.size()-1);
    }
    private void traversal(TreeNode x, List<Integer> vals) {
        if(x == null) return;
        traversal(x.left, vals);
        vals.add(x.val);
        traversal(x.right, vals);
    }
    public TreeNode build(List<Integer> vals, int lo, int hi){
        if(lo > hi) return null;
        if(lo == hi) return new TreeNode(vals.get(lo));
        int mid = (hi - lo) /2 + lo;
        TreeNode x = new TreeNode(vals.get(mid));
        x.left = build(vals, lo, mid - 1);
        x.right = build(vals, mid + 1, hi);
        return x;
    }
}
