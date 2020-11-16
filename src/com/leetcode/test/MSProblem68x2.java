package com.leetcode.test;
//二叉树的公共祖先，与MSProblem不同之处在于该二叉树非搜索树
public class MSProblem68x2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root == null || root == p || root == q) return root;
//        TreeNode left = lowestCommonAncestor(root.left, p, q);
//        TreeNode right = lowestCommonAncestor(root.right, p, q);
//        if(left == null) return right;
//        if(right == null) return left;
//        return root;
//    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }
    //考虑通过递归对二叉树进行后序遍历，当遇到节点 pp 或 qq 时返回。从底至顶回溯，当节点 p, qp,q 在节点 rootroot 的异侧时，节点 rootroot 即为最近公共祖先，则向上返回 rootroot 。
    //
    //递归解析：
    //终止条件：
    //当越过叶节点，则直接返回 nullnull ；
    //当 rootroot 等于 p, qp,q ，则直接返回 rootroot ；
    //递推工作：
    //开启递归左子节点，返回值记为 leftleft ；
    //开启递归右子节点，返回值记为 rightright ；
    //返回值： 根据 leftleft 和 rightright ，可展开为四种情况；
    //当 leftleft 和 rightright 同时为空 ：说明 rootroot 的左 / 右子树中都不包含 p,qp,q ，返回 nullnull ；
    //当 leftleft 和 rightright 同时不为空 ：说明 p, qp,q 分列在 rootroot 的 异侧 （分别在 左 / 右子树），因此 rootroot 为最近公共祖先，返回 rootroot ；
    //当 leftleft 为空 ，rightright 不为空 ：p,qp,q 都不在 rootroot 的左子树中，直接返回 rightright 。具体可分为两种情况：
    //p,qp,q 其中一个在 rootroot 的 右子树 中，此时 rightright 指向 pp（假设为 pp ）；
    //p,qp,q 两节点都在 rootroot 的 右子树 中，此时的 rightright 指向 最近公共祖先节点 ；
    //当 leftleft 不为空 ， rightright 为空 ：与情况 3. 同理；
}
