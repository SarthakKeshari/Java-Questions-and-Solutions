// Question : https://leetcode.com/problems/container-with-most-water/

// Example
/**
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 * In this case, the max area of water (blue section) the container can contain is 49.
 *
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 */

import java.util.*;

class Solution {
    public static int maxArea(int[] height) {
        int sum = 0, l = 0, r = height.length-1;

        while(l<r) {

            // iterate from both side and find min height.
            // It will provide the min. water storage by forming a shape of container.

            int temp = Math.min(height[l], height[r]);
            sum = Math.max(sum, (r-l)*temp);

            // Increment/Decrement from left/right side to find next largest container.

            if(height[r]>height[l])
                l++;
            else
                r--;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] height = new int[n];
        
        for(int i = 0; i < n; i ++)
            height[i] = sc.nextInt();
        
        System.out.println( maxArea(height) );

        sc.close();
    }
}