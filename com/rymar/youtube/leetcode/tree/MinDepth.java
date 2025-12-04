package leetcode.tree;

import leetcode.tree.utill.TreeNode;

public class MinDepth {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}
