
 // Leetcode Ques No. : 146
 // Problem Link: https://leetcode.com/problems/lru-cache/


 ***** problem statement *****

 /*
 Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 Implement the LRUCache class:
 LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 int get(int key) Return the value of the key if the key exists, otherwise return -1.
 void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. 
 If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 */


 ***** Solution *****



  import java.util.HashMap;

  public class LRUCache {
     // data Members
    private class ListNode {
         Integer key, value;
         ListNode next = null;
         ListNode prev = null;

        ListNode(Integer key, Integer value) {
             this.key = key;
             this.value = value;
         }
     }

     private HashMap<Integer, ListNode> map;
     private int capacity;
     private int size;
     private ListNode head = null;
     private ListNode tail = null;

     private void intialize(int capacity) { //this function will initialise the capacity
         this.capacity = capacity;
         this.size = 0;
        this.map = new HashMap<>();
        this.head = this.tail = null; // this is the dummy node
     }

     public LRUCache(int capacity) { 
         intialize(capacity);
     }

     private void addLast(ListNode node) { // in this function we will add every value of the node in the linkedlist
         if (this.head == null)
             this.head = this.tail = node;
        else {
             node.prev = this.tail;
             this.tail.next = node;
             this.tail = node;
         }
         this.size++;

     }

     private ListNode removeFirst() { // in this function the first node of the linkelist will be removed
         ListNode node = this.head;
         if (this.head == this.tail)
             this.head = this.tail = null;
         else {
             this.head = node.next;
             node.next = this.head.prev = null;
         }
         this.size--;
         return node;
     }

     private ListNode removeLast() { //remove last node from LinkedList
         ListNode node = this.tail;
         if (this.head == this.tail)
             this.head = this.tail = null;
         else {
             this.tail = node.prev;
             node.prev = this.tail.next = null;
         }
         this.size--;
         return node;
     }

     private ListNode remove(ListNode node) { //remove the node
         if (node == this.head)
             return removeFirst();
         else if (node == this.tail)
             return removeLast();
         else {
             ListNode prev = node.prev, forw = node.next;

             prev.next = forw;
             forw.prev = prev;

             node.next = node.prev = null;
             this.size--;
             return node;
         }
     }

     private void makeRecent(ListNode node) { // in this we move the node to the front of linkedlist
         if (node == this.tail)
             return;

         remove(node);
         addLast(node);
     }

     public int get(int key) { // get the value and add in the linkedlist
         if (!map.containsKey(key)) //if value is not present in the linked list then return -1
             return -1;

         ListNode node = map.get(key);
         makeRecent(node);
         return node.value;
     }

     public void put(int key, int value) { //in this function whenever we put a value first we will check that whether that value is present or not in an hashmap
         if (map.containsKey(key)) {  
             ListNode node = map.get(key); // if value is present then we will update the value of the node
             node.value = value;
             makeRecent(node);
         } else {
             ListNode node = new ListNode(key, value);
             if (this.size == this.capacity) {
                 ListNode rn = removeFirst();
                 map.remove(rn.key);
            }

             addLast(node);
             map.put(key, node);
         }
     }
 }





 /*
  Sample input: ["LRUCache","put","put","get","put","get","put","get","get","get"]
                [[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]
                
  Sample Output: [null,null,null,1,null,-1,null,-1,3,4]
  
  time complexity : O(n)
  space complexity : O(n)
  */
