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
    public boolean isEvenOddTree(TreeNode root) {
        if(root == null){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level  = 0;
        while(!queue.isEmpty()){
            int n = queue.size();   
            int prev = (level % 2 == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                TreeNode curr = queue.poll();
                 int val = curr.val;
                 if(level % 2 == 0){
                    if(val % 2 == 0 || val <= prev){
                        return false;
                    }

                 } else {
                     if(val % 2 != 0 || val >= prev){
                        return false;
                    }
                    
                 }
                 prev = val;
                
                 if(curr.left != null) queue.add(curr.left);
                 if(curr.right != null) queue.add(curr.right);
            }
            level++;
        }
        return true;
    }
}