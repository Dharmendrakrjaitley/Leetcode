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
        //first approach
//        //created dummy node to handle edge case
//         ListNode dummy=new ListNode(0);
//         dummy.next=head;
//         ListNode slow=dummy;
//         ListNode fast=dummy;
        
//         for(int i=0;i<=n;i++)
//         {
//             fast=fast.next;
//         }
        
//         while(fast!=null)
//         {
//             fast=fast.next;
//             slow=slow.next;
//         }
//         slow.next=slow.next.next;
        
//         return dummy.next;
        
        // 2nd approach
        
        ListNode temp=head;
        //count the number of node
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        //System.out.println(count);
        
        int n1=count-n;
        if(n1==0)
        {
            return head.next;
        }
            
        temp=head;
        ListNode prev=temp;
        while(n1>0)
        {
            prev=temp;
            temp=temp.next;
            n1--;
        }
        prev.next=temp.next;
        return head;
    }
}