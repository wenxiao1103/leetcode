package com.leetcode.test;

import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/11/12 11:21 下午
 *
 * 783. 二叉搜索树节点最小距离
 */
public class Problem783 {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
//    Integer prev, ans;
//
//    public int minDiffInBST(TreeNode root) {
//        prev = null;
//        ans = Integer.MAX_VALUE;
//        dfs(root);
//        return ans;
//    }
//
//    public void dfs(TreeNode node) {
//        if (node == null) return;
//        dfs(node.left);
//        if (prev != null)
//            ans = Math.min(ans, node.val - prev);
//        prev = node.val;
//        dfs(node.right);
//    }
    Integer prev, ans;
     public int minDiffInBST(TreeNode root) {
         prev = null;
         ans = Integer.MAX_VALUE;
         dfs(root);
         return ans;
     }
     public void dfs(TreeNode node) {
         if (node == null) return;
         dfs(node.left);
         if (prev != null)
             ans = Math.min(ans, node.val - prev);
         prev = node.val;
         dfs(node.right);
     }
}