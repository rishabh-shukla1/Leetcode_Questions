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
    public ListNode swapNodes(ListNode head, int k) {


        ListNode first=head;
        ListNode second=head;

        for(int i=1;i<k;i++)
        {
            first=first.next;
        }


        ListNode  fast=first;

        while(fast.next!=null)
        {
            fast=fast.next;
            second=second.next;
        }

        int t=second.val;
        second.val=first.val;
        first.val=t;


        return head;


        

      

       

        
    }
}