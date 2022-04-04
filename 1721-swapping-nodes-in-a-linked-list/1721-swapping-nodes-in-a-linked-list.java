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
    public ListNode swapNodes(ListNode head, int k) {
        int length=0;
        ListNode temp=head;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        
        
        int val1;
        int val2;
        int k1=k;
        temp=head;
        if(k1==1)
            val1=head.val;
        else
        {
            while(k1>1)
            {
                temp=temp.next;
                k1--;
            }
            val1=temp.val;
        }
        System.out.println("val1"+ val1);
        k1=length-k;
      ListNode temp1=head;
        // if(k1==1)
        //     val2=head.val;
        // else
        // {
            while(k1>=1)
            {
                temp1=temp1.next;
                k1--;
            }
            val2=temp1.val;
            temp1.val=val1;
      //  }
        System.out.println("val2"+ val2);
        temp.val=val2;
        return head;
    }
}