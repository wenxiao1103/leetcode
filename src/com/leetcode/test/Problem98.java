package com.leetcode.test;
//验证二叉搜索树
public class Problem98 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return isBSTHelper(root, null, null);
    }

    public boolean isBSTHelper(TreeNode node, Integer lower_limit, Integer upper_limit){
        if((lower_limit != null) && (node.val <= lower_limit))
            return false;
        if((upper_limit != null) && (node.val >= upper_limit))
            return false;

        boolean left = node.left != null ? isBSTHelper(node.left, lower_limit, node.val):true;
        if(left){
            boolean right = node.right != null ? isBSTHelper(node.right, node.val, upper_limit):true;
            return right;
        }else{
            return false;
        }
    }

//    public boolean isValidBST(TreeNode root) {
//        if (root == null) return true;
//        return isBSTHelper(root, null, null);
//    }
//    public boolean isBSTHelper(TreeNode node, Integer lower_limit, Integer upper_limit) {
//        if((lower_limit != null) && (node.val <= lower_limit))
//            return false;
//        if((upper_limit != null) && (node.val >= upper_limit))
//            return false;
//
//        boolean left = node.left != null ? isBSTHelper(node.left, lower_limit, node.val) : true;
//        if(left) {
//            boolean right = node.right != null ? isBSTHelper(node.right, node.val, upper_limit) : true;
//            return right;
//        }else {
//            return false;
//        }
//    }
}
