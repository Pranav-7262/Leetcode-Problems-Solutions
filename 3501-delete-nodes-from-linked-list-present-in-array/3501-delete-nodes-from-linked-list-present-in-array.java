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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        ListNode newNode = dummy;
        while(curr != null) {
            if(!set.contains(curr.val)) {
                newNode.next = curr;
                newNode = curr;
            }
            curr = curr.next;
        }
        newNode.next = null;
        return dummy.next;
    }
}