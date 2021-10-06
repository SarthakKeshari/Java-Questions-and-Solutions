/**

find the question here - https://leetcode.com/problems/reorder-list/


 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 
  Step 1: find the mid point
   while(pt2.next!=null && pt2.next.next!=null){ 
                pt1=pt1.next;
                pt2=pt2.next.next
  
  Step 2: Reverse the end of the list
  
  Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
  
  Step 3: merge both the list by reordering them one by one in order
  
   reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
 */

class Solution {
    
public void reorderList(ListNode head) {
            if(head==null||head.next==null) return;
            
            //Find the middle of the list
            ListNode pt1=head;
            ListNode pt2=head;
            while(pt2.next!=null && pt2.next.next!=null){ 
                pt1=pt1.next;
                pt2=pt2.next.next;
            }
            
            //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
            ListNode preMid=pt1;
            ListNode preCurr=pt1.next;
            while(preCurr.next!=null){
                ListNode curr=preCurr.next;
                preCurr.next=curr.next;
                curr.next=preMid.next;
                preMid.next=curr;
            }
            
            //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
            pt1=head;
            pt2=preMid.next;
            while(pt1!=preMid){
                preMid.next=pt2.next;
                pt2.next=pt1.next;
                pt1.next=pt2;
                pt1=pt2.next;
                pt2=preMid.next;
            }
        }
}
