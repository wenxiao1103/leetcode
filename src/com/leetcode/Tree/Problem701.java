package com.leetcode.Tree;

/**
 * @author xiaowen
 * @date 2020/9/8 11:46 下午
 *
 * 701. 二叉搜索树中的插入操作
 */
public class Problem701 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
//    public TreeNode insertIntoBST(TreeNode root, int val) {
//        if (root == null) return new TreeNode(val);
//
//        // insert into the right subtree
//        if (val > root.val) root.right = insertIntoBST(root.right, val);
//            // insert into the left subtree
//        else root.left = insertIntoBST(root.left, val);
//        return root;
//    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if(val < root.val) root.left = insertIntoBST(root.left, val);
        else root.right = insertIntoBST(root.right, val);
        return root;
    }
}
