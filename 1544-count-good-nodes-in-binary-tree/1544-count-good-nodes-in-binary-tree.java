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
    public int goodNodes(TreeNode root) {
        return helper(root , root.val);
    }
    public int helper(TreeNode root , int val) {
        if(root == null) return 0;
        int good = 0;

        if(root.val >= val) {
            good = 1;
        }
       
        int max = Math.max(root.val , val);

        good += helper(root.left , max);
        good += helper(root.right , max);
        return good;
    }
}