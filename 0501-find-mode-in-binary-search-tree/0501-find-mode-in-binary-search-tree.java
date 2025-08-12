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
    private Integer prev = null;
    private int count = 0;
    private int maxCount = 0;
    private List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inOrder(root);
        int []res = new int[list.size()];
         for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    private void inOrder(TreeNode root){
        if(root == null) return;
        
        inOrder(root.left);
        if(prev != null){
            if(root.val == prev){
                count++;
            }else{
                count = 1;
            }
        } else{
            count=1;
        }
        if(count > maxCount){
            maxCount = count;
            list.clear();
            list.add(root.val);
        } else if(count == maxCount){
            list.add(root.val);
        }
        prev = root.val;
        inOrder(root.right);
    }
}