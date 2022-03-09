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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode=new ListNode();
        dummyNode.next=head;
        ListNode prev=dummyNode;
        
        while(head!=null)
        {
            ListNode temp=head;
            boolean duplicate=false;
            while(temp.next!=null && temp.next.val==head.val)
            {
                duplicate=true;
                temp=temp.next;
                
            }
            if(duplicate)
            {
                head=temp.next;
                prev.next=head;
            }
            else
            { 
                prev=head;
                head=head.next;
            }
        }
        return dummyNode.next;
    }
}