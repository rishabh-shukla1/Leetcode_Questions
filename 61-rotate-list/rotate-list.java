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
    public ListNode rotateRight(ListNode head, int k) {


        if(head==null || k==0)
        return head; 


        ListNode a1=head;
        ListNode a2=head;

     int c=1;
        while(a1.next!=null)
        {
            c++;
            a1=a1.next;


        }

        System.out.println(c);

        k=k%c;

        if(k==0)
        return head;

        int h=c-k-1;

        while(a2.next!=null  && h>0)
        {
            a2=a2.next;
            h--;
            

        }

       a1.next=head;
       head=a2.next;
       a2.next=null;

    return head;

        


        


        

    
    }
}