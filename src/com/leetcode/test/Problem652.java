package com.leetcode.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/10/10 10:59 下午
 *
 * 652. 寻找重复的子树
 */
public class Problem652 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
//    Map<String, Integer> count;
//    List<TreeNode> ans;
//
//    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
//        count = new HashMap();
//        ans = new ArrayList();
//        collect(root);
//        return ans;
//    }
//
//    public String collect(TreeNode node) {
//        if (node == null) return "#";
//        String serial = node.val + "," + collect(node.left) + "," + collect(node.right);
//        count.put(serial, count.getOrDefault(serial, 0) + 1);
//        if (count.get(serial) == 2)
//            ans.add(node);
//        return serial;
//    }
//    Map<String, Integer> count;
//    List<TreeNode> ans;
//    public List<TreeNode> findDuplicateSubtress(TreeNode root) {
//        count = new HashMap<>();
//        ans = new ArrayList<>();
//        collect(root);
//        return ans;
//    }
//    public String collect(TreeNode node) {
//        if (node == null) return "#";
//        String serial = node.val + "," + collect(node.left) + "," + collect(node.right);
//        count.put(serial, count.getOrDefault(serial, 0) + 1);
//        if (count.get(serial) == 2)
//            ans.add(node);
//        return serial;
//    }
    Map<String, Integer> count;
    List<TreeNode> ans;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        count = new HashMap<>();
        ans = new ArrayList<>();
        collect(root);
        return ans;
    }
    public String collect(TreeNode node) {
        if (node == null) return "#";
        String serial = node.val + "," + collect(node.left) + "," + collect(node.right);
        count.put(serial, count.getOrDefault(serial, 0) + 1);
        if (count.get(serial) == 2) ans.add(node);
        return serial;
    }
}