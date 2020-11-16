package com.leetcode.test;

import java.util.*;

/**
 * @author xiaowen
 * @date 2020/10/9 10:57 下午
 */
public class Problem145 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<Integer>();
//        if (root == null) {
//            return res;
//        }
//        Deque<TreeNode> stack = new LinkedList<TreeNode>();
//        TreeNode prev = null;
//        while (root != null || !stack.isEmpty()) {
//            while (root != null) {
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.pop();
//            if (root.right == null || root.right == prev) {
//                res.add(root.val);
//                prev = root;
//                root = null;
//            } else {
//                stack.push(root);
//                root = root.right;
//            }
//        }
//        return res;
//    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                res.add(root.val); //先将节点加入结果队列
                stack.push(root);  //不断将该节点左子树入栈
                root = root.left;
            }
            root = stack.pop(); //栈顶节点出栈
            root = root.right; //转向该节点右子树的左子树（下一个循环）
        }
        return res;
    }

    //前序
    public List<Integer> orderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);  //不断将该节点左子树入栈
                root = root.left;
            }
            root = stack.pop(); //栈顶节点出栈
            res.add(root.val); //将节点加入结果队列
            root = root.right; //转向该节点右子树的左子树（下一个循环）
        }
        return res;
    }

    //中序
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null; //pre节点用于记录前一次访问的节点
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root); //不断将左节点压栈
                root = root.left;
            }
            root = stack.peek();
            if (root.right == null || root.right == pre) { //若右节点为空 或右节点访问过
                res.add(root.val); //此时可以访问根结点啦
                pre = root;
                stack.pop();
                root = null; //此时下一轮循环不要将左子树压栈，直接判断栈顶元素
            } else {
                root = root.right; //先不出栈 把它右节点入栈
            }

        }
        return res;
    }
    //后序
    //https://leetcode-cn.com/problems/binary-tree-postorder-traversal/solution/er-cha-shu-qian-xu-zhong-xu-hou-xu-ceng-xu-bian-2/
}