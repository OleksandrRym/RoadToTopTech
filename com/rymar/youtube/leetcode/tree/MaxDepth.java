package leetcode.tree;

import leetcode.tree.utill.TreeNode;
/// MY SOLUTIONS
/// https://leetcode.com/problems/maximum-depth-of-binary-tree/solutions/7388943/recursivity-1-line-solutions-by-oleksand-muig/?source=submission-ac
public class MaxDepth {
    int maxDepth(TreeNode root){
        return root == null ? 0 : Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}
