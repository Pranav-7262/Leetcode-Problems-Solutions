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
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(-1);
         ListNode more = new ListNode(-1);
        ListNode curr = head;
        ListNode t1 = less;
        ListNode t2 = more;
        while(curr!=null){
           if(curr.val < x){
               t1.next = curr;
               t1 = t1.next;
           } else{
               t2.next = curr;
               t2 = t2.next;
           }
           curr = curr.next;
        }
        t1.next = more.next;
        t2.next = curr;
        return less.next;
    }
}