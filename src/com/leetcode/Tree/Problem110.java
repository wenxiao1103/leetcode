package com.leetcode.Tree;

import sun.nio.cs.ext.MacHebrew;

/**
 * @author xiaowen
 * @date 2020/9/14 10:34 下午
 *
 * 110. 平衡二叉树
 */
public class Problem110 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

//    public boolean isBalanced(TreeNode root) {
//        return height(root) >= 0;
//    }
//
//    public int height(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int leftHeight = height(root.left);
//        int rightHeight = height(root.right);
//        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
//            return -1;
//        } else {
//            return Math.max(leftHeight, rightHeight) + 1;
//        }
//    }
//    public boolean isBalanced(TreeNode root) {
//        return height(root) >= 0;
//    }
//    public int height(TreeNode root) {
//        if (root == null) return 0;
//        int leftHeight = height(root.left);
//        int rightHeight = height(root.right);
//        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) return -1;
//        else return Math.max(leftHeight, rightHeight) + 1;
//    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode node){
        if (node == null) return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
