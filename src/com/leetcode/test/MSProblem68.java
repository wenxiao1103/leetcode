package com.leetcode.test;
//二叉搜索树的最近公共祖先
public class MSProblem68 {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null) {
            if(root.val < p.val && root.val < q.val) // p,q 都在 root 的右子树中
                root = root.right; // 遍历至右子节点
            else if(root.val > p.val && root.val > q.val) // p,q 都在 root 的左子树中
                root = root.left; // 遍历至左子节点
            else break;
        }
        return root;
    }
    //当两个数一个大于root,一个小于root时，表示root就是他们的公共祖先
    //当两个数都是大于或者小于root，表示他们的公共祖先是在root的右或者左子树上
}
