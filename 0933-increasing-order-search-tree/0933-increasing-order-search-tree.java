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
    public TreeNode increasingBST(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root , list);
        return build(list);

    }
    public TreeNode build(ArrayList<Integer> list) {
        if(list.size() == 0) return null;
         TreeNode root = new TreeNode(list.remove(0));
         root.right = build(list);
         return root;
    }
    public void inOrder(TreeNode root , ArrayList<Integer> list) {
        if(root!=null) {
            inOrder(root.left , list);
            list.add(root.val);
            inOrder(root.right , list);
        }
    }
}