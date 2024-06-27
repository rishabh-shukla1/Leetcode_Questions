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
    public ListNode mergeNodes(ListNode head) {
            ListNode n=new ListNode();
            ListNode t=n;
        ListNode temp=head;
            int sum=0;
        while( temp!=null)
        {
            if(temp.val!=0)
            {
                sum=sum+temp.val;
            }
            else
            {
                if(sum>0)
                {
                    ListNode f=new ListNode(sum);
                    t.next=f;
                    t=t.next;
                }
                sum=0;
            }
            temp=temp.next;

        }
        return n.next;
        
    }
}