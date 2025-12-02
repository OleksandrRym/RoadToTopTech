package leetcode.tree;

import leetcode.tree.utill.TreeNode;

public class HasPathSum {

    public static void main(String[] args) {
        TreeNode left = new TreeNode(10);
        TreeNode right = new TreeNode(20);
        TreeNode head = new TreeNode(15, left, right);
        System.out.println(hasPathSum(head, 35));
    }
    /// same task like @SumOfTwoNumbersIsExist
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null) return targetSum == root.val;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right ,targetSum - root.val);
    }
}
