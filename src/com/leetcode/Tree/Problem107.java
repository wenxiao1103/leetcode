package com.leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author xiaowen
 * @date 2020/9/14 10:23 下午
 *
 * 107. 二叉树的层次遍历 II
 */
public class Problem107 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//        List<List<Integer>> levelOrder = new LinkedList<List<Integer>>();
//        if (root == null) {
//            return levelOrder;
//        }
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            List<Integer> level = new ArrayList<Integer>();
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                level.add(node.val);
//                TreeNode left = node.left, right = node.right;
//                if (left != null) {
//                    queue.offer(left);
//                }
//                if (right != null) {
//                    queue.offer(right);
//                }
//            }
//            levelOrder.add(0, level);
//        }
//        return levelOrder;
//    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelOrder = new LinkedList<>();
        if (root == null) return levelOrder;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            levelOrder.add(0, level);
        }
        return levelOrder;
    }
}
