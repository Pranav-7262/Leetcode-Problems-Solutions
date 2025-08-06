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
    private int totalTilt = 0;
    public int findTilt(TreeNode root) {
         dfs(root);
         return totalTilt;
    }
    private int dfs(TreeNode root) {
        if(root == null) {
            return 0;
        }
       int left = dfs(root.left);
       int right = dfs(root.right);
       int tilt = Math.abs(left - right);
        totalTilt += tilt;

        return root.val + left + right;
    }
}