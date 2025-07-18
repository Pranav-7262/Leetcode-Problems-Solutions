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
     private TreeNode lca = null;
     private int maxDepth = 0;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
         helper(root , 0);
         return lca;
    }
    public int helper(TreeNode root , int depth){
        if(root == null) {
            return depth;
        }
        int left = helper(root.left, depth+1);
        int right = helper(root.right ,depth+1);

        maxDepth = Math.max(maxDepth, Math.max(left, right));

        if(left == right && left == maxDepth)  {
            lca = root;
        }
       
       return Math.max(left,right);
    }
}