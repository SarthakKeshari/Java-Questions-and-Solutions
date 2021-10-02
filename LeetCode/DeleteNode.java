// https://leetcode.com/problems/delete-node-in-a-linked-list/
// O(n) solution 

//Aproach: The question gives access to the node to be deleted instead of the head node. The node to be deleted will not 
//be a tail node hence we will set the value of the current node to be that of the next node and set the next of the 
//current node to the next of it's next. Simple and efficient solution, 0ms runtime.

public class DeleteNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }
    public void delete(ListNode node) {
        if (node.next.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        } else if (node.next.next == null) {
            node.val = node.next.val;
            node.next = null;
        }
    }
}
