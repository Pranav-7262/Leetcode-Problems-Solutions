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
     List<TreeNode> res = new ArrayList<>();
    Map<String ,Integer> map = new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
       
     helper(root);
     return res;
    }
    private String helper(TreeNode root) {
        if(root == null){
            return "#";
        }
        String post = root.val + "," + helper(root.left) + "," + helper(root.right);
        map.put(post,map.getOrDefault(post,0)+1);
        if(map.get(post) == 2){
            res.add(root);
        }
        return post;
    }
}