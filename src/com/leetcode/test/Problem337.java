package com.leetcode.test;
//打家劫舍3
public class Problem337 {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
    //public int rob(TreeNode root) {
    //        int[] num = dfs(root);
    //        return Math.max(num[0], num[1]);
    //    }
    //    private int[] dfs(TreeNode x) {
    //        if (x == null) return new int[2];
    //        int[] left = dfs(x.left);
    //        int[] right = dfs(x.right);
    //        int[] res = new int[2];
    //        res[0] = left[1] + right[1] + x.val;
    //        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
    //        return res;
    //    }

    public int rob(TreeNode root){
        int[] num = dfs(root);
        return Math.max(num[0], num[1]);
    }

    public int[] dfs(TreeNode x){
        int[] left = dfs(x.left);
        int[] right = dfs(x.right);
        int[] res = new int[2];
        res[0] = left[1] + right[1] + x.val;
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return res;
    }
    //递归，深度优先搜索
}
