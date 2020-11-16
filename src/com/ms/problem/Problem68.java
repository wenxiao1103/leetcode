package com.ms.problem;
//二叉搜索数的最近公共祖先
public class Problem68 {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
    //二叉搜索数的最近公共祖先
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        int pVal = p.val;
        int qVal = q.val;
        TreeNode node = root;

        while (node != null) {
            int parentVal = node.val;
            if (pVal > parentVal && qVal > parentVal) {
                node = node.right;
            } else if (pVal < parentVal && qVal < parentVal) {
                node = node.left;
            } else {
                return node;
            }
        }
        return null;
    }
//二叉树的最近公共祖先,这个稍微要难一些
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }
}