package com.leetcode.test;

import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/10/7 9:27 下午
 *
 * 549. 二叉树中最长的连续序列
 */
public class Problem549 {
    public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
//    private int max = 1;
//    public int longestConsecutive(TreeNode root) {
//        if(root == null) return 0;
//        help(root);
//
//        return max;
//    }
    private int max = 1;
    public int longestConsecutive(TreeNode root) {
        if (root == null) return 0;
        help(root);
        return max;
    }
//    public int[] help(TreeNode root){
//        if(root == null) return null;
//        int[] right = help(root.right);
//        int[] left = help(root.left);
//        int[] result = new int[]{1,1};
//        if(right == null && left == null) return result;
//        if(root.right != null){
//            if(root.val == root.right.val + 1) {
//                max = Math.max(max, right[0] + 1);
//                result[0] = right[0] + 1;
//                result[1] = 1;
//            }else if(root.val == root.right.val - 1){
//                max = Math.max(max, right[1] + 1);
//                result[0] = 1;
//                result[1] = right[1] + 1;
//            }
//        }
//        if(root.left != null){
//            if(root.val == root.left.val + 1) {
//                max = Math.max(max, left[0] + result[1]);
//                result[0] = Math.max(result[0], left[0] + 1);
//            }else if(root.val == root.left.val - 1){
//                max = Math.max(max, left[1] + result[0]);
//                result[1] = Math.max(result[1], left[1] + 1);
//            }
//        }
//        return result;
//    }
//    public int[] help(TreeNode root) {
//        if (root == null) return null;
//        int[] right = help(root.right);
//        int[] left = help(root.left);
//        int[] result = new int[]{1, 1};
//        if (right == null && left == null) return result;
//        if (root.right != null) {
//            if (root.val == root.right.val + 1) {
//                max = Math.max(max, right[0] + result[1]);
//                result[0] = right[0] + 1;
//            } else if (root.val == root.right.val - 1) {
//                max = Math.max(max, right[1] + result[0]);
//                result[1] = right[1] + 1;
//            }
//        }
//        if (root.left != null) {
//            if (root.val == root.left.val + 1) {
//                max = Math.max(max, left[0] + result[1]);
//                result[0] = Math.max(result[0], left[0] + 1);
//            } else if (root.val == root.left.val - 1) {
//                max = Math.max(max, left[1] + result[0]);
//                result[1] = Math.max(result[1], left[1] + 1);
//            }
//        }
//        return result;
//    }
    //result[0]代表降序，result[1]代表升序
    public int[] help(TreeNode root) {
        if (root == null) return null;
        int[] right = help(root.right);
        int[] left = help(root.left);
        int[] result = new int[]{1,1};
        if (right == null && left == null) return result;
        if (root.right != null) {
            if (root.val == root.right.val + 1) {
                max = Math.max(max, right[0] + result[1]);
                result[0] = right[0] + 1;
            } else if (root.val == root.right.val - 1) {
                max = Math.max(max, right[1] + result[0]);
                result[1] = right[1] + 1;
            }
        }
        if (root.left != null) {
            if (root.val == root.left.val + 1) {
                max = Math.max(max, left[0] + result[1]);
                result[0] = Math.max(result[0], left[0] + 1);
            } else if (root.val == root.left.val - 1) {
                max = Math.max(max, left[1] + result[0]);
                result[1] = Math.max(result[1], left[1] + 1);
            }
        }
        return result;
    }

}
