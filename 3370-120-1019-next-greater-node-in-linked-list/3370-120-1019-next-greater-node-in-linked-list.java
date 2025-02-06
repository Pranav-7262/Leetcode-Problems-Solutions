/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
    Stack<Integer> st = new Stack<>(); 
    ArrayList<Integer> list = new ArrayList<>(); 
      ListNode curr = head;
      while(curr!=null){
        list.add(curr.val);
        curr = curr.next;
      }
      int []ans = new int[list.size()];
      for(int i=0;i<list.size();i++) {
        while(!st.isEmpty() && list.get(i) > list.get(st.peek())){
            ans[st.pop()] = list.get(i);
        }
        st.push(i);
      }
      return ans;
}
}