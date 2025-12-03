package leetcode.tree;

import leetcode.tree.utill.TreeNode;

public class RangeSumBST {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        if(root.val >= low && root.val <= high){
            return (rangeSumBST(root.left,low, high) + rangeSumBST(root.right,low,high)) + root.val;
        }
        return rangeSumBST(root.left,low, high) + rangeSumBST(root.right,low,high);
    }
}
