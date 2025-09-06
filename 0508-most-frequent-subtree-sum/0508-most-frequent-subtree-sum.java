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
    HashMap<Integer,Integer> map = new HashMap<>();
    int maxi = 0;
    public int[] findFrequentTreeSum(TreeNode root) {
        postOrder(root);
         int count = 0;
          for (int freq : map.values()) {
            if (freq == maxi) {
                count++;
            }
        }
        int []ans = new int[count];
        int i=0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
          if(entry.getValue() == maxi){
            ans[i++] = entry.getKey();
          }
        }
        return ans;
    }
    private int postOrder(TreeNode root){
        if(root == null) return 0;
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        int sum = left + right + root.val;
        map.put(sum , map.getOrDefault(sum,0)+1);
       
       maxi = Math.max(maxi , map.get(sum));
       return sum;
    }
}