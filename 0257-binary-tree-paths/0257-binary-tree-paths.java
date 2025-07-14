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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root!=null) search(root,"",list);
        return list;
    }
    public void search(TreeNode root,String path,List<String>list) {
        if(root == null) return;
        if(root.left==null && root.right==null) {
            list.add(path + root.val);
        }
         if(root.left!=null) {
            search(root.left , path + root.val + "->",list);
        }
        if(root.right!=null ) {
            search(root.right , path + root.val + "->",list);
        }
    }
}