package com.leetcode.Tree;

/**
 * @author xiaowen
 * @date 2020/9/14 10:57 下午
 *
 * 112. 路径总和
 */
public class Problem112 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
//    public boolean hasPathSum(TreeNode root, int sum) {
//        if (root == null) {
//            return false;
//        }
//        if (root.left == null && root.right == null) {
//            return sum == root.val;
//        }
//        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
//    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return sum == root.val;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
