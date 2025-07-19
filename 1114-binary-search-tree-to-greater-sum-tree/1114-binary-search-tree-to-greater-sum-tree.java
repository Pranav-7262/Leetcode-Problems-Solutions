/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int result;
    public TreeNode bstToGst(TreeNode root) {
        result = 0;
        helper(root);
        return root;
    }
      public void helper(TreeNode root) {
        if(root == null) return;
        
        helper(root.right);
        result +=root.val;
        root.val = result;
        helper(root.left);
    }
}