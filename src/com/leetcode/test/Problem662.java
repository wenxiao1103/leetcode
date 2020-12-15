package com.leetcode.test;

import apple.laf.JRSUIUtils;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/12/8 11:11 下午
 */
public class Problem662 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

//    public int widthOfBinaryTree(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//
//        Deque<TreeNode> queue = new LinkedList<>();
//        // 根节点编号为 0
//        root.val = 0;
//        queue.add(root);
//
//        int sum;
//        int ans = 0;
//        while (!queue.isEmpty()) {
//            sum = queue.size();
//            // 队头和队尾的编号值求差用来更新宽度
//            ans = Math.max(ans, queue.getLast().val - queue.getFirst().val + 1);
//            // 一次处理一层，进入这个循环前队列中是一层的所有非空节点
//            while (sum > 0) {
//                TreeNode temp = queue.remove();
//
//                // 子节点入队前修改 val, val = 满二叉树中节点编号
//                if (temp.left != null) {
//                    queue.add(temp.left);
//                    temp.left.val = temp.val * 2 + 1;
//                }
//                if (temp.right != null) {
//                    queue.add(temp.right);
//                    temp.right.val = temp.val * 2 + 2;
//                }
//                sum--;
//            }
//        }
//        return ans;
//    }
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        Deque<TreeNode> queue = new LinkedList<>();
        root.val = 0;
        queue.add(root);
        int sum = 0;
        int ans = 0;
        while (!queue.isEmpty()) {
            sum = queue.size();
            ans = Math.max(ans, queue.getLast().val - queue.getFirst().val + 1);
            while (sum > 0) {
                TreeNode temp = queue.remove();
                if (temp.left != null) {
                    queue.add(temp.left);
                    temp.left.val = temp.val * 2 + 1;
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                    temp.right.val = temp.val * 2 + 2;
                }
                sum--;
            }
        }
        return ans;
    }
}