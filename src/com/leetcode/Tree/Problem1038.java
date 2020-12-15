package com.leetcode.Tree;

/**
 * @author xiaowen
 * @date 2020/9/9 9:54 下午
 *
 * 1038. 从二叉搜索树到更大和树
 */
public class Problem1038 {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
//    int sum = 0;
//    public TreeNode bstToGst(TreeNode root) {
//        if(root != null){
//            bstToGst(root.right);
//            sum = sum + root.val;
//            root.val = sum;
//            bstToGst(root.left);
//        }
//        return root;
//
//    }
//    int sum = 0;
//    public TreeNode bstToGst(TreeNode root) {
//        if (root != null) {
//            bstToGst(root.right);
//            sum = sum + root.val;
//            root.val = sum;
//            bstToGst(root.left);
//        }
//        return root;
//    }
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if (root != null) {
            bstToGst(root.right);
            sum = sum + root.val;
            root.val = sum;
            bstToGst(root.left);
        }
        return root;
    }
}
