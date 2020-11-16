package com.leetcode.Tree;

import com.leetcode.test.Problem677;

import java.util.NavigableMap;

/**
 * @author xiaowen
 * @date 2020/10/20 11:42 下午
 *
 * 687. 最长同值路径
 */
public class Problem697 {
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
//    int ans;
//    public int longestUnivaluePath(TreeNode root) {
//        ans = 0;
//        arrowLength(root);
//        return ans;
//    }
//    public int arrowLength(TreeNode node) {
//        if (node == null) return 0;
//        int left = arrowLength(node.left);
//        int right = arrowLength(node.right);
//        int arrowLeft = 0, arrowRight = 0;
//        if (node.left != null && node.left.val == node.val) {
//            arrowLeft += left + 1;
//        }
//        if (node.right != null && node.right.val == node.val) {
//            arrowRight += right + 1;
//        }
//        ans = Math.max(ans, arrowLeft + arrowRight);
//        return Math.max(arrowLeft, arrowRight);
//    }
    int ans;
     public int longestUnivaluePath(TreeNode root) {
         ans = 0;
         arrowLength(root);
         return ans;
     }
     public int arrowLength(TreeNode node) {
         if (node == null) return 0;
         int left = arrowLength(node.left);
         int right = arrowLength(node.right);
         int arrowLeft = 0, arrowRight = 0;
         if (node.left != null && node.left.val == node.val) {
             arrowLeft += left + 1;
         }
         if (node.right != null && node.right.val == node.val) {
             arrowRight += right + 1;
         }
         ans = Math.max(ans, arrowLeft + arrowRight);
         return Math.max(arrowLeft, arrowRight);
     }
}
