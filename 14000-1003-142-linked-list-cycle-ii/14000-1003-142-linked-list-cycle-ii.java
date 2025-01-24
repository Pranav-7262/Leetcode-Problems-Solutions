/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while(f!=null && f.next!=null){
            f = f.next.next;//runs 2x times
            s = s.next;//runs 1x times
            if(f == s){
                s = head;
                while(s != f){
                    s = s.next;
                    f = f.next;
                }
                 return s;
            }
           

        }
    
       return null;
    }
}