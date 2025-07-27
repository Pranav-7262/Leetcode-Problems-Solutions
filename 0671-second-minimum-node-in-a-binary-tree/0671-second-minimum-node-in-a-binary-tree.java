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
    public int findSecondMinimumValue(TreeNode root) {
       return helper(root , root.val);
    }
    private int helper(TreeNode root , int minval){
        if(root == null) return -1;
        if(root.val > minval) return root.val;
        int left = helper(root.left , minval);
        int right = helper(root.right , minval);
        if (left != -1 && right != -1) return Math.min(left, right);
        return left != -1 ? left : right;
    }

}