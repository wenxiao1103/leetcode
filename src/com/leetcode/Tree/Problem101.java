package com.leetcode.Tree;

/**
 * @author xiaowen
 * @date 2020/9/14 10:04 下午
 *
 * 101. 对称二叉树
 */
public class Problem101 {

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
//    public boolean isSymmetric(TreeNode root) {
//        return check(root, root);
//    }
//
//    public boolean check(TreeNode p, TreeNode q) {
//        if (p == null && q == null) {
//            return true;
//        }
//        if (p == null || q == null) {
//            return false;
//        }
//        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
//    }
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }
    public boolean check(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }
}
