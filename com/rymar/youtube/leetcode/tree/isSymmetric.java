package leetcode.tree;

import leetcode.tree.utill.TreeNode;

public class isSymmetric {

  public static void main(String[] args) {
    TreeNode left = new TreeNode(10);
    TreeNode right = new TreeNode(20);
    TreeNode head = new TreeNode(15, left, right);
    System.out.println(isSymmetric(head));
  }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        if(root.left == null && root.right == null) return true;
        if(root.left == null || root.right == null) return false;
        return root.left.val == root.right.val  && (isSymmetric(root.left) && isSymmetric(root.right));
    }
}
