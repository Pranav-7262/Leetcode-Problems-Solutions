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
    public int rangeSumBST(TreeNode root, int l, int r) {
       if (root == null) {
        return 0;
    }
    int sum = 0;
    if (root.val > l) {
        sum += rangeSumBST(root.left, l, r);
    }
    if (root.val >= l && root.val <= r) {
        sum += root.val;
    }
    if (root.val < r) {
        sum += rangeSumBST(root.right, l, r);
    }
    return sum;
        
    }
}