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
    public boolean isPalindrome(ListNode head) {


        List<Integer> l=new ArrayList<>();

        while(head!=null)
        {
            l.add(head.val);
            head=head.next;
        }

        int i=0;
        int j=l.size()-1;

        while(i<=j)
        {
            if(l.get(i)!=l.get(j))
            {
                return false;
            }

            i++;
            j--;


        }

        return true;
        

    }
}