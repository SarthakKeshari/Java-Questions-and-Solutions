# Find k’th largest element in an array

//Given an integer array, find k’th largest element in an array where k is a positive integer less than or equal to the length of array.

//For example -
/*
Input:
 
arr = [7, 4, 6, 3, 9, 1]
k = 2
 
Output:
 
The 2nd largest array element is 7
*/

// The Algorithm can be implemented in java as -

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
 
class Main
{
    // Function to find the k'th largest element in an array using min-heap
    public static int findKthLargest(List<Integer> ints, int k)
    {
        // base case
        if (ints == null || ints.size() < k) {
            System.exit(-1);
        }
 
        // create a min-heap using the `PriorityQueue` class and insert
        // the first `k` array elements into the heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(ints.subList(0, k));
 
        // do for remaining array elements
        for (int i = k; i < ints.size(); i++)
        {
            // if the current element is more than the root of the heap
            if (ints.get(i) > pq.peek())
            {
                // replace root with the current element
                pq.poll();
                pq.add(ints.get(i));
            }
        }
 
        // return the root of min-heap
        return pq.peek();
    }
 
 
    public static void main(String[] args)
    {
        List<Integer> ints = Arrays.asList(7, 4, 6, 3, 9, 1);
        int k = 2;
 
        System.out.println("k'th largest array element is " + findKthLargest(ints, k));
    }
}


//Output
//K'th Largest array element is 7. 
