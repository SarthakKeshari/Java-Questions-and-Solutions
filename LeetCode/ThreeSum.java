// Solution to https://leetcode.com/problems/3sum/

// Problem statement:
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0

// Apporach: We use 2 pointers in front and back of the given array.
// We start with the first element and move the front pointer to the second element.
// From back of the array we move to the second to last element.
// Then from second element we move the front pointer to the third element.
// From second last element we move the back pointer to the third last element and so on.
// We keep moving the front pointer and the back pointer until we reach the end of the array.
// The arrays are sorted to skip over duplicates and make the algorithm faster.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
  
      ArrayList<List<Integer>> res = new ArrayList<>();
  
      for (int i = 0; i < nums.length; i++) {
        int j = i + 1, k = nums.length - 1;
  
        if (i > 0 && nums[i] == nums[i - 1]) {
          continue; // skip duplicates
        }
  
        while (j < k) {
          if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
            k--;
            continue; // skip duplicates
          }
  
          // sum of current triplet
          if (nums[i] + nums[j] + nums[k] > 0) {
            k--;
          } else if (nums[i] + nums[j] + nums[k] < 0) {
            j++;
          } else {
            // add triplet to result
            ArrayList<Integer> list = new ArrayList<Integer>(
                Arrays.asList(nums[i], nums[j], nums[k])
            );
              
            res.add(list);
            j++;
            k--;
          }
        }
      }
  
      return res;
    }
  }
  