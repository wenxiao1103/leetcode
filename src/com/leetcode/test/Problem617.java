package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/10 10:30 下午
 *
 * 617. 合并二叉树
 */
public class Problem617 {
     public class TreeNode {
         int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }
//    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        if (t1 == null) {
//            return t2;
//        }
//        if (t2 == null) {
//            return t1;
//        }
//        TreeNode merged = new TreeNode(t1.val + t2.val);
//        merged.left = mergeTrees(t1.left, t2.left);
//        merged.right = mergeTrees(t1.right, t2.right);
//        return merged;
//    }
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
         if (t1 == null) return t2;
         if (t2 == null) return t1;
         TreeNode merge = new TreeNode(t1.val + t2.val);
         merge.left = mergeTrees(t1.left, t2.left);
         merge.right = mergeTrees(t1.right, t2.right);
         return merge;
    }
}
