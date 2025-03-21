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
    public ListNode swapPairs(ListNode head) {

        ListNode t=head;

        while(t!=null && t.next!=null)
        {
            int s=t.val;
            t.val=t.next.val;
            t.next.val=s;

            t=t.next.next;
        }

        return head;
        
    }
}