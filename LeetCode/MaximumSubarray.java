/*
Question Link - https://leetcode.com/problems/maximum-subarray/
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
A subarray is a contiguous part of an array.
Example 1:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:
    Input: nums = [1]
    Output: 1
Example 3:
    Input: nums = [5,4,-1,7,8]
    Output: 23
Constraints:
    1 <= nums.length <= 105
    -104 <= nums[i] <= 104
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int maxOverall = nums[0];      // Assigning first element as maximum
        
        // if upon adding the current element,
        // we find that the sum exceeds the maximum sum,
        // we add the current element to the longest subsequence.
        // Otherwise, drop the previous sum, and replace it 
        // with the current element instead.
           
        for (int i=1; i<nums.length; i++) {
               max = Math.max(nums[i], max + nums[i]);  
               maxOverall = Math.max(maxOverall, max);
        }
        return maxOverall;
    }
} 