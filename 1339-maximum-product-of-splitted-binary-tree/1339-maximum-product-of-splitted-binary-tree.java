
class Solution {
    long totalSum = 0;
    long maxProduct = 0;
    int MOD = 1000000007;
    public int maxProduct(TreeNode root) {
      totalSum = treeSum(root);
      dfs(root);
       return (int)(maxProduct % MOD);
    }
    private  long treeSum(TreeNode node) {
        if(node == null) return 0;
        return node.val + treeSum(node.left) + treeSum(node.right);
    }
    private  long dfs(TreeNode node) {
        if(node == null) return 0;
        long left = dfs(node.left);
        long right = dfs(node.right);

        long subTreeSum = left + right + node.val;
        long pro = subTreeSum * (totalSum - subTreeSum);
        maxProduct = Math.max(maxProduct , pro);
        return subTreeSum;
    }

}