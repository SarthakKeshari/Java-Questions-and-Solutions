/**
*  Question Link : https://leetcode.com/problems/median-of-two-sorted-arrays/
*
*  Problem Statement : Given two sorted arrays nums1 and nums2 of size m and n respectively, 
*                      return the median of the two sorted arrays.
*                      The overall run time complexity should be O(log (m+n)).
*
*  Intuition : Both arrays are sorted and expected time complexity is logarithmic, we can try using Binary Search
*
*  Example : 
*  nums1 = [1, 3, 4, 7, 10, 12]
*  nums2 = [2, 3, 6, 15]
*
*  Observation :   
*  In Combined array : 
*  [1, 2, 3 , 3, 4, 6, 7, 10, 12 ,15]
*  we need two middle elements(in case where m+n is even) or single middle element(in case where m+n is odd)
*
*                       |
*       [1, 2, 3 , 3, 4,| 6, 7, 10, 12 ,15]
*                       |    
*
*  If we partition the array in two halves, we need largest element from first half and smallest element from second half
*
*  From two arrays, partition can be created in following ways
*
*
*    nums1 :    [1,3,4,7,10]    |   [12]
*                               |
*    nums2 :                    |   [2,3,6,15]
*                               |
*    ______________________________________________
*
*    nums1 :    [1,3,4,7]       |   [10,12]
*                               |
*    nums2 :    [2]             |   [3,6,15]
*                               |
*   _______________________________________________
*
*    nums1 :    [1,3,4]         |   [7,10,12]
*                               |
*    nums2 :    [2,3]           |   [6,15]
*                               |
*   _______________________________________________
*
*    nums1 :    [1,3]           |   [4,7,10,12]
*                               |
*    nums2 :    [2,3,6]         |   [15]
*                               |
*   ______________________________________________
*
*    nums1 :    [1]             |   [3,4,7,10,12]
*                               |
*    nums2 :    [2,3,6,15]      |
*                               |
*   ______________________________________________
*                  
*   If the largest element of nums1[] in left partition 
*   is less than or equal to smallest element of nums2[] in right patrtition
*   and
*   If the largest element of nums2[] in left partition 
*   is less than or equal to smallest element of nums1[] in right patrtition
*      
*   Then that partion is a valid partition
*
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        if(nums2.length < nums1.length)
        {
             return findMedianSortedArrays(nums2, nums1); 
             //Considering partition length w.r.t. nums1
        }
        int n = nums1.length;
        int m = nums2.length;
        
        int low = 0;
        int high = n;
        
        while(low<=high)
        {
             int partition1 = (low+high)>>1;
             int partition2 = (n+m+1)/2 - partition1;
            
            //If the partition length becomes 0, we assign it large negative number(negative infinity)
            //left1 is the largest number from nums1 in left partition
             int left1 = (partition1==0)?Integer.MIN_VALUE : nums1[partition1-1];

            //left2 is the largest number from nums2 in left partition
             int left2 = (partition2==0)?Integer.MIN_VALUE : nums2[partition2-1];
            
            //right1 is the largest number from nums1 in right partition
             int right1 = (partition1==n)?Integer.MAX_VALUE : nums1[partition1];

            //right2 is the largest number from nums2 in right partition 
             int right2 = (partition2==m)?Integer.MAX_VALUE : nums2[partition2];
            
            if(left1<=right2 && left2<=right1)
            {
                 //If partition is valid
                 if((n+m)%2==0)
                 {
                      return (max(left1, left2)+min(right1,right2))/2.0;
                 }
                 else
                 {
                       return max(left1, left2);
                 }
            }
            //else reduce the partition from nums1
            else if(left1 > right2)
            {
                 high = partition1-1;
            }
            else
            {
                 low = partition1+1;
            }
        }
        
        return 0.0;
        
    }
    
    //Utility function to return maximum of two numbers
    public int max(int a, int b)
    {
         return a>b? a:b;
    }

    //Utility function to return minimun of two numbers
    public int min(int a, int b)
    {
         return a<b? a:b;
    }
}












