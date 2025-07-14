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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        hasPathSum( root , res ,list , targetSum);
        return res;
    }
    public void hasPathSum(TreeNode root ,List<List<Integer>> res , List<Integer> list , int targetSum ) {
        if(root == null) return ;
            list.add(root.val);
         if (root.val == targetSum && root.left == null && root.right == null) {
            res.add(new ArrayList<>(list));
        }
        int remainingSum = targetSum - root.val;
        hasPathSum(root.left , res , list ,remainingSum);
         hasPathSum(root.right , res , list , remainingSum);

        list.remove(list.size() - 1); 

    }
}