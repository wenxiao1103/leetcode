package com.leetcode.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/11/23 11:55 下午
 *
 *998. 最大二叉树 II
 */
public class Problem998 {
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
//    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
//        if(root == null || root.val < val) {
//            TreeNode tmp = new TreeNode(val);
//            tmp.left = root;
//            return tmp;
//        }
//        TreeNode right = insertIntoMaxTree(root.right,val);
//        root.right = right;
//        return root;
//    }
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
         if (root == null || root.val < val) {
             TreeNode node = new TreeNode(val);
             node.left = root;
             return node;
         }
         TreeNode right = insertIntoMaxTree(root.right, val);
         root.right = right;
         return root;
    }
}
