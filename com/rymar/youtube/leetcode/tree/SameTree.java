package leetcode.tree;

import leetcode.tree.utill.TreeNode;

public class SameTree {
  public static void main(String[] args) {

    TreeNode left = new TreeNode(10);
    TreeNode right = new TreeNode(20);
    TreeNode head = new TreeNode(15, left, right);

    TreeNode left1 = new TreeNode(10);
    TreeNode right1 = new TreeNode(20);
    TreeNode head1 = new TreeNode(15, left1, right1);
    System.out.println(isSameTree(head1, head));
  }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p== null && q== null) return true;
        if(p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.right, q.right) &&
                isSameTree(p.left, q.left) ;
    }
}
