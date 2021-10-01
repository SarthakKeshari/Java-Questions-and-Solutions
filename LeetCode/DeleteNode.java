// https://leetcode.com/problems/delete-node-in-a-linked-list/
// O(n) solution 

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
