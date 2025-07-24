/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
      
        List<List<Integer>> result = new ArrayList<>();
          if(root == null) return result;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int n = queue.size();
             List<Integer>list = new ArrayList<>(n);
            for(int i=0;i<n;i++){
               Node curr = queue.poll();
                list.add(curr.val);
                if (curr.children != null) {
                    for (Node child : curr.children) {
                        queue.add(child);
                    }
                }
            }
            result.add(list);
        }
        return result;
    }
}