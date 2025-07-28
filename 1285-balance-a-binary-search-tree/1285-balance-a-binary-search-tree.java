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
     List<Integer> list = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
       
        inOrder(root , list);
        return BalancedBST(0, list.size() - 1);
    }
    private void inOrder(TreeNode root ,  List<Integer> list) {
        if(root == null) return;
        inOrder(root.left , list);
        list.add(root.val);
        inOrder(root.right , list);
    }
    private TreeNode BalancedBST(int left, int right) {
        if(left > right) return null;
        int mid = left + (right - left)/2;
        TreeNode node  = new TreeNode(list.get(mid));
        node.left =  BalancedBST(left, mid-1);
        node.right = BalancedBST(mid+1, right);
        return node;
    }
}