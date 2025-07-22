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
    private int maxDepth = -1;
    private int left;
    public int findBottomLeftValue(TreeNode root) {
         helper(root , 0);
         return left;
    }
    public void helper(TreeNode root , int depth) {
        if(root == null) {
           return;
        }
        if(depth > maxDepth) {
            maxDepth = depth;
            left = root.val;
        }
         helper(root.left ,depth+1);
         helper(root.right ,depth+1);

    }
}