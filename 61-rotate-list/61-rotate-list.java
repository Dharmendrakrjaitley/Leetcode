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
        
        ListNode temp=head;
        int length=0;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        if(length==0)
            return head;
        if(k>length)
            k=k%length;
        if(k==length)
            return head;
        int divider=length-k;
        temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        ListNode temp2=head;
        while(divider>1)
        {
            temp2=temp2.next;
            divider--;
        }
        head=temp2.next;
        temp2.next=null;
        return head;
        
    }
}