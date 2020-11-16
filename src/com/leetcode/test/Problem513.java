package com.leetcode.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xiaowen
 * @date 2020/10/5 8:36 下午
 *
 * 513. 找树左下角的值
 */
public class Problem513 {
    public class TreeNode {
         int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int res = root.val;
        while(!queue.isEmpty()){
            int size = queue.size();
            res = queue.peek().val;
            for(int i = 0; i<size; i++){
                TreeNode temp = queue.poll();
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
        }
        return res;
    }
}
