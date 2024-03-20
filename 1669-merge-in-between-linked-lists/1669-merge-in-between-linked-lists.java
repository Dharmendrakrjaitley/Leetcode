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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode left=list1;
        ListNode right=list1;
        int count=1;
        while(count<a)
        {
            left=left.next;
            count++;
        }
        count=0;
        while(count<b)
        {
            right=right.next;
            count++;
        }
        left.next=list2;
        ListNode temp=list2;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=right.next;
        
        return list1;
    }
}