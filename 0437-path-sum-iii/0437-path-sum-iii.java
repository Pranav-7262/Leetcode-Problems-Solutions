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
    public int pathSum(TreeNode root, int target) {
        if(root == null) return 0;
		int cnt = dfs(root , target);
	    cnt += pathSum(root.left , target);
	    cnt += pathSum(root.right , target);
		return cnt;
    }
    private static int dfs(TreeNode node , long x) {
        if(node == null) return 0;
        int count = 0;
        if(node.val == x) {
            count++;
        }
        count += dfs(node.left , x - node.val);
        count += dfs(node.right , x - node.val);
        return count;
    }
}