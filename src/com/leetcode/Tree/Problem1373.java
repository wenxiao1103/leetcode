package com.leetcode.Tree;

import sun.plugin.liveconnect.OriginNotAllowedException;

import javax.transaction.TransactionRequiredException;

/**
 * @author xiaowen
 * @date 2020/9/9 10:08 下午
 *
 * 1373. 二叉搜索子树的最大键值和
 */
public class Problem1373 {

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

//    public int maxSumBST(TreeNode root) {
//        int[] res = {0};
//        maxSumBST(res, root);
//        return res[0];
//    }
//
//    private boolean isBST(TreeNode root, int min, int max) {
//        if (root == null) {
//            return true;
//        }
//        return min < root.val && root.val < max && isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
//    }
//
//    private void maxSumBST(int[] res, TreeNode node) {
//        if (isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
//            sumNodeValue(res, node);
//            return;
//        }
//        maxSumBST(res, node.left);
//        maxSumBST(res, node.right);
//    }
//
//    private int sumNodeValue(int[] res, TreeNode node) {
//        if (node == null) {
//            return 0;
//        }
//        int sum = node.val + sumNodeValue(res, node.left) + sumNodeValue(res, node.right);
//
//        res[0] = Math.max(res[0], sum);
//        return sum;
//    }

    public int maxSumBST(TreeNode root) {
        int[] res = {0};
        maxSumBST(res, root);
        return res[0];
    }
    public void maxSumBST(int[] res, TreeNode node) {
        if(isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            maxNodeValue(res, node);
            return;
        }
        maxSumBST(res, node.left);
        maxSumBST(res, node.right);
    }
    public boolean isBST(TreeNode root, int min, int max) {
        if (root == null) return true;
        return min < root.val && root.val < max && isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }
    public int maxNodeValue(int[] res, TreeNode root) {
        if(root == null) return 0;
        int sum = root.val + maxNodeValue(res, root.left) + maxNodeValue(res, root.right);

        res[0] = Math.max(res[0], sum);
        return sum;
    }
}
