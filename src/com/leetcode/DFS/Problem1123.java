package com.leetcode.DFS;

import com.leetcode.test.MSProblem68x2;

//最深叶节点的最近公共祖先
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
    public TreeNode lceDeepestLeaves(TreeNode root) {
        if (root == null)
            return null;
        int ld = depth(root.left);
        int rd = depth(root.right);
        if (ld == rd) {
            return root;
        }else if (ld > rd) {
            return lceDeepestLeaves(root.left);
        }else {
            return lceDeepestLeaves(root.right);
        }
    }
    public int depth(TreeNode node) {
        if (node == null)
            return 0;
        int left = depth(node.left);
        int right = depth(node.left);
        return Math.max(left, right) +1;
    }
}
