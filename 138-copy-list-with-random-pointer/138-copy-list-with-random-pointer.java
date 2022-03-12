/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return head;
        Node cur=head;
        Node temp=null;
        while(cur!=null)
        {
            temp=cur.next;
            Node newNode=new Node(cur.val);
            cur.next=newNode;
            newNode.next=temp;
            cur=temp;
        }
        
        cur=head;
        temp=null;
        while(cur!=null)
        {
            if(cur.next!=null)
            {
                cur.next.random=(cur.random!=null) ? cur.random.next : cur.random; 
            }
            cur=cur.next.next;
            
        }
        
        Node original=head;
        Node copy=head.next;
        temp=copy;
        
        while(original!=null)
        {
            original.next=original.next.next;
            temp.next=(temp.next!=null) ? temp.next.next : temp.next;
            
            original=original.next;
            temp=temp.next;
        }
        
        return copy;
    }
}