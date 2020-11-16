package com.leetcode.Tree;

import javax.transaction.TransactionRequiredException;

/**
 * @author xiaowen
 * @date 2020/9/27 10:46 上午
 */
public class Problem236 {

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }

//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (root == null || root == p || root == q)
//            return root;
//        TreeNode left = lowestCommonAncestor(root.left, p, q);
//        TreeNode right = lowestCommonAncestor(root.right, p, q);
//        if (left == null && right == null)
//            return null;
//        if (left == null || right == null)
//            return left == null ? right : left;
//        return root;
//    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null && right == null) {
            return null;
        }
        if (left == null || right == null) {
            return left == null ? right : left;
        }
        return root;
    }
}
