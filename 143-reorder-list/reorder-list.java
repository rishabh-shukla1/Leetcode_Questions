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
    public void reorderList(ListNode head) {

       ListNode slow =head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }


        ListNode first=head;
        ListNode sec=slow.next;

        slow.next=null;


        ListNode prev=null;

        while(sec!=null)
        {
           ListNode ahead=sec.next;
            sec.next=prev;
            prev=sec;
            sec=ahead;
        }

        ListNode temp=new ListNode();
        ListNode ans=temp;

        while(first!=null && prev!=null)
        {

            if(first!=null)
            {
                temp.next=first;
                temp=temp.next;
                first=first.next;
            }

             if(prev!=null)
            {
                temp.next=prev;
                temp=temp.next;
                prev=prev.next;
            }
        }

        if(prev!=null)
        {
            temp.next=prev;
        }

        if(first!=null)
        {
            temp.next=first;
        }


        head=null;

        head=ans;
        
    }
}