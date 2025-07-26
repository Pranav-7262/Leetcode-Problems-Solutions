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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : to_delete){
            set.add(num);
        }
        List<TreeNode> list = new ArrayList<>();
        helper(root , true , set , list);
        return list;
    }
    private TreeNode helper(TreeNode root , boolean isRoot, HashSet<Integer> set, List<TreeNode> list) {
        if(root == null){
            return null;
        }
        boolean isDeleted = set.contains(root.val);
        root.left = helper(root.left,isDeleted,set,list);
        root.right = helper(root.right,isDeleted,set,list);
       
        if(!isDeleted && isRoot){
            list.add(root);
        } 
        return isDeleted ? null : root;
    }
}