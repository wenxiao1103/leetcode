package com.leetcode.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//二叉树的右视图
public class Problem199 {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
//    public List<Integer> rightSideView(TreeNode root) {
//        LinkedList<TreeNode> queue = new LinkedList<>();
//        List<Integer> list = new ArrayList<Integer>();
//        if(root == null) return list;
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            int size = queue.size();
//            while(size-- > 0){
//                TreeNode p = queue.poll();
//                if(p.left != null)
//                    queue.offer(p.left);
//                if(p.right != null)
//                    queue.offer(p.right);
//                if(size == 0)
//                    list.add(p.val);
//            }
//        }
//        return list;
//    }
    public List<Integer> rightSideView(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            while (size-- > 0) {
                TreeNode p = queue.poll();
                if (p.left != null)
                    queue.offer(p.left);
                if (p.right != null)
                    queue.offer(p.right);
                if (size == 0)
                    list.add(p.val);
            }
        }
        return list;
    }
    //广度优先搜索
}
