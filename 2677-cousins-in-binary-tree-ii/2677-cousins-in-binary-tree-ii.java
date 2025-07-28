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
     Map<Integer, Integer> levelSumMap = new HashMap<>();
    Map<TreeNode, Integer> originalValMap = new HashMap<>();

    public TreeNode replaceValueInTree(TreeNode root) {
        computeLevelSum(root, 0);
        updateValues(root, null, 0);
        return root;
    }

    private void computeLevelSum(TreeNode node, int level) {
        if (node == null) return;

        levelSumMap.put(level, levelSumMap.getOrDefault(level, 0) + node.val);
        originalValMap.put(node, node.val);

        computeLevelSum(node.left, level + 1);
        computeLevelSum(node.right, level + 1);
    }

    private void updateValues(TreeNode node, TreeNode parent, int level) {
        if (node == null) return;

        if (level == 0) {
            node.val = 0;
        } else {
            int siblingSum = 0;

            if (parent != null) {
                if (parent.left != null)
                    siblingSum += originalValMap.get(parent.left);
                if (parent.right != null)
                    siblingSum += originalValMap.get(parent.right);
            }

            node.val = levelSumMap.get(level) - siblingSum;
        }

        updateValues(node.left, node, level + 1);
        updateValues(node.right, node, level + 1);
    }
}