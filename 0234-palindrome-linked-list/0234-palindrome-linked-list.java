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
        
        //1. find the middle of the node
        //2. reverse the second half
        //3. Compare with the first half
        
        if(head==null || head.next==null)
            return true;
        
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //reverse the second half
        ListNode reversed=reverseList(slow.next);
        slow.next=null;
        //Compare both 
        
        ListNode a=head;
        ListNode b=reversed;
        while(a!=null && b!=null)
        {
            if(a.val!=b.val)
                return false;
            a=a.next;
            b=b.next;
        }
        
        return true;
        
    }
    
    public ListNode reverseList(ListNode node)
    {
        ListNode prev=null;
        ListNode curr=node;
        ListNode next=null;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        return prev;
    }
}