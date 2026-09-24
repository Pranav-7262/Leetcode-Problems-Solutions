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
    int ans = 0;
    int cnt = 0;

    public int kthSmallest(TreeNode root, int k) {
        ans = 0;
        cnt = k;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root == null)
            return;
        
        dfs(root.left);
        cnt--;
        if (cnt == 0) {
            ans = root.val;
            return;
        }
      
        dfs(root.right);
    }
}