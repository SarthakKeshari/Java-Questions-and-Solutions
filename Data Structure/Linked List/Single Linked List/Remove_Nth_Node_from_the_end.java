// Given the head of a linked list, remove the nth node from the end of the list and return its head.

// Example 1:

// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]


// Example 2:

// Input: head = [1], n = 1
// Output: []

public class Leetcode_19 {
    // Node class
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            // Edge Case
            if (head == null || head.next == null)
                return null;
            
            // making 2 pointers slow and fast at the start of the LinkedList
            ListNode slow = head, fast = head;
            
            // Moving fast pointer n times
            while (n-- > 0) {
                fast = fast.next;
            }
            
            // Edge case- if fast is equal to null then return head.next;
            if (fast == null)
                return head.next;

            // Now, fast pointer is N distance away from slow.
            // now, moving fast and slow pointer one step at a time.
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            
            // slow reached n-1 position
            // so, now we are attaching slow to the slow.next.next, i.e removing nth node.
            slow.next = slow.next.next;

            return head;
        }
    }
}
