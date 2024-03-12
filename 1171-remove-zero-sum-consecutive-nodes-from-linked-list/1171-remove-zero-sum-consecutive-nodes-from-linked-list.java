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
    public ListNode removeZeroSumSublists(ListNode head) {
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode current=dummy;
        
        while(current!=null)
        {
            int sum=0;
            ListNode temp=current.next;
            while(temp!=null)
            {
                sum+=temp.val;
                if(sum==0)
                {
                    current.next=temp.next;
                    temp=temp.next;
                }
                else
                {
                    temp=temp.next;
                }
            }
            current=current.next;
        }
        return dummy.next;
        
    }
}