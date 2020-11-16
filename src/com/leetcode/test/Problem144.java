package com.leetcode.test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/10/9 10:45 下午
 *
 * 144.二叉树的前序便利（迭代版，非递归）
 */
public class Problem144 {
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
//    public List<Integer> preorderTraversal(TreeNode root) {
//        LinkedList<TreeNode> stack = new LinkedList<>();
//        LinkedList<Integer> output = new LinkedList<>();
//        if (root == null) {
//            return output;
//        }
//
//        stack.add(root);
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.pollLast();
//            output.add(node.val);
//            if (node.right != null) {
//                stack.add(node.right);
//            }
//            if (node.left != null) {
//                stack.add(node.left);
//            }
//        }
//        return output;
//    }
    public List<Integer> preOrderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) return output;
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.add(node.val);
            if (root.right != null) stack.add(root.right);
            if (root.left != null) stack.add(root.left);
        }
        return output;
    }
}