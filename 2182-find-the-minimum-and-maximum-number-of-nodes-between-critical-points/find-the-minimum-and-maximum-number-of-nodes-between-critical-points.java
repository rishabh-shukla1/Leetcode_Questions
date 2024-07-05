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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ListNode slow=head;

        if(head.next.next==null)
        {
            return new int[]{-1,-1};
        }
        ListNode fast=head.next.next;



         List<Integer> l=new ArrayList<>();

         int k=2;



        while(fast!=null)
        {
            if(slow.val>slow.next.val && fast.val>slow.next.val)
            {
                l.add(k);
                
            }

            if(slow.val<slow.next.val && fast.val<slow.next.val)
            {
                l.add(k);
            }

            
            k++;
            slow=slow.next;
            fast=fast.next;

            
            
        }
        

        System.out.println(l);

        if(l.size()<2)
        {
            return new int[]{-1,-1};
        }
        if(l.size()==2)
        {
            int d=Math.abs(l.get(0)-l.get(l.size()-1));
            return new int[]{d,d};
        }

        Collections.sort(l);

       int min=Integer.MAX_VALUE;

        for(int i=0;i<l.size()-1;i++)
        {
            min=Math.min(min,l.get(i+1)-l.get(i));
        }
        int max=l.get(l.size()-1)-l.get(0);




    
        



        return   new int[]{min,max};


        


        

        
    }
}