package com.leetcode.test;

import sun.nio.cs.ext.MacHebrew;


/**
 * 298.二叉树的最长连续序列
 * */
public class Problem298 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
//    public int longestConsecutive(TreeNode root) {
//        return helper(root, null, 0);
//    }
//    public int helper(TreeNode root, TreeNode p, int res) {
//        if (root == null) return res;
//        res = (p != null && root.val == p.val + 1) ? res + 1 : 1;
//        return Math.max(res, Math.max(helper(root.left, root, res), helper(root.right, root, res)));
//    }
    public int longestConseutive(TreeNode root) {
        return helper(root, null, 0);
    }
    public int helper(TreeNode root, TreeNode p, int res) {
        if (root == null) return res;
        res = (p != null && root.val == p.val + 1) ? res + 1 : 1;
        return Math.max(res, Math.max(helper(root.left, root, res), helper(root.right, root, res)));
    }
//    public int helper(TreeNode root, TreeNode p, int res) {
//        if(root == null) return res;
//        res = (p != null && root.val == p.val+1) ? res+1 : 1;
//        return Math.max(helper(root.left, root, res), helper(root.right, root, res));
//    }


}
