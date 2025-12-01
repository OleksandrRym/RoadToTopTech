package leetcode.tree;

import leetcode.tree.utill.TreeNode;

public class CountNodes {
  public static void main(String[] args) {
    TreeNode left = new TreeNode(10);
    TreeNode right = new TreeNode(20);
    TreeNode head = new TreeNode(15, left, right);

    System.out.println(head.toString());
    System.out.println(countNodes(head));
  }

  public static int countNodes(TreeNode root) {
    if (root == null) return 0;
    return 1 + countNodes(root.left) + countNodes(root.right);
  }
}
