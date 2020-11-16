package com.leetcode.Tree;

/**
 * @author xiaowen
 * @date 2020/9/27 11:20 上午
 *
 * 124. 二叉树中的最大路径和
 */
public class Problem124 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
//    int maxSum = Integer.MIN_VALUE;
//    public int maxPathSum(TreeNode root) {
//        maxGain(root);
//        return maxSum;
//    }
//    public int maxGain(TreeNode node) {
//        if (node == null) {
//            return 0;
//        }
//        int leftGain = Math.max(maxGain(node.left), 0);
//        int rightGain = Math.max(maxGain(node.right), 0);
//        int priceNewpath = node.val + leftGain + rightGain;
//        maxSum = Math.max(maxSum, priceNewpath);
//        return node.val + Math.max(leftGain, rightGain);
//    }
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGian(root);
        return maxSum;
    }
    public int maxGian(TreeNode root) {
        if (root == null) return 0;
        int leftGian = Math.max(maxGian(root.left), 0);
        int rightGian = Math.max(maxGian(root.right), 0);
        int priceNewpath = root.val + leftGian + rightGian;
        maxSum = Math.max(maxSum, priceNewpath);
        return root.val + Math.max(leftGian, rightGian);
    }
}
