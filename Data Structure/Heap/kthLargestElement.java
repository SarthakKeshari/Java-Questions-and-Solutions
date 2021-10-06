/*Find k’th largest element in an array
Input:

arr = [7, 4, 6, 3, 9, 1]
k = 2

Output:

The 2nd largest array element is 7
*/

import java.util.*;
class kthLargestElement
{
  public static void main (String args[])
  {
    int n,k;
    // using max heap to solve and find kth largest element
    Scanner s= new Scanner(System.in);
    PriorityQueue < Integer > queue =
      new PriorityQueue < Integer > (Comparator.reverseOrder ());
    //using PriorityQueue as a heap data structure
    System.out.println("enter the array length:");
    n=s.nextInt();  //taking array length as a input
    System.out.println("enter the element:");
    for(int i=0;i<n;i++)
        queue.add (s.nextInt()); //adding elements in heap (it does in-build sort)
    System.out.println("enter the value of k:");
    k=s.nextInt();  //taking the value of k 
    if(k>n){
        System.out.println("the value of k should not be more than array length!! error");
        return;      // k must be less than n
    }
    while(k>1){
        queue.poll (); //removing (k-1) elements from max heap
        k--;           //so that next max element is the kth largest
    }
    System.out.println ("the kth largest element is:" + queue.peek ());//to get the max element in max heap (root element)
  }
}
