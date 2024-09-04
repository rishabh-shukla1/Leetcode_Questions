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
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Integer> p=new PriorityQueue<>();

        for(ListNode l:lists)
        {
            ListNode head=l;
            while(head!=null)
            {
                p.add(head.val);
                head=head.next;
            }
        }

        if(p.isEmpty())

        {
            return null;
        }





        ListNode l=new ListNode(p.poll());
      
        ListNode h=l;

        while(!p.isEmpty())
        {
            ListNode s=new ListNode(p.poll());
            l.next=s;
            
            l=l.next;


        }


        return h;
    
        
    }
}