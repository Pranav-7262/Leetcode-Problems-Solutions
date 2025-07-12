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
    static int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        height(root);
        return diameter-1;
    }
    public static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftH = height(node.left);
        int rightH = height(node.right);

        int dia = leftH + rightH + 1;
        diameter = Math.max(diameter,dia);
        return Math.max(leftH,rightH)+1;

    }
}