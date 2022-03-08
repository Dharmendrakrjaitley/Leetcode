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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp=head;
        int length=0;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        int count1=length-n;
        int count2=count1-1;
        
            
        temp=head;
        if(count1==0)
        {
            
            temp=temp.next;
            head=temp;
            return head;
        }
        while(count2>0)
        {
            temp=temp.next;
            count2--;
        }
        
        temp.next=temp.next.next;
        return head;
    }
}