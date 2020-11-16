package com.leetcode.Tree;

/**
 * @author xiaowen
 * @date 2020/9/27 10:57 上午
 */
public class Problem1123 {

     public class TreeNode {
         int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
//    public TreeNode lcaDeepestLeaves(TreeNode root) {
//        if(root==null)
//            return null;
//        int ld=depth(root.left);
//        int rd=depth(root.right);
//        if(ld==rd){
//            return root;
//        }
//        else if(ld>rd){
//            return lcaDeepestLeaves(root.left);
//        }
//        else {
//            return lcaDeepestLeaves(root.right);
//        }
//    }
//    public int depth(TreeNode node){
//        if(node==null)
//            return 0;
//        int left=depth(node.right);
//        int right=depth(node.left);
//        return Math.max(left,right)+1;
//    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
         if (root == null) {
             return null;
         }
         int ld = depth(root.left);
         int lr = depth(root.right);
         if (ld == lr) return root;
         else if (ld > lr) {
             return lcaDeepestLeaves(root.left);
         }else {
             return lcaDeepestLeaves(root.right);
         }
    }
    public int depth(TreeNode node) {
         if (node == null) return 0;
         int left = depth(node.left);
         int right = depth(node.right);
         return Math.max(left, right);
    }
}
