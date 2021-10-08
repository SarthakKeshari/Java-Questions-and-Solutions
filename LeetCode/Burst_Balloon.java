/   // Leetcode Ques No. : 312
    // Problem Link: https://leetcode.com/problems/burst-balloons/


    ***** problem statement *****

    /*
     You are given n balloons, indexed from 0 to n - 1. Each balloon is painted with a number on it represented by an array nums. You are asked to burst all the balloons.
     If you burst the ith balloon, you will get nums[i - 1] * nums[i] * nums[i + 1] coins. If i - 1 or i + 1 goes out of bounds of the array, then treat it as if there is a balloon with a 1 painted on it.
     Return the maximum coins you can collect by bursting the balloons wisely.
    */


    ***** Solution *****



     public int maxCoins_memo(int[] nums , int si , int ei , int[][] dp){ //si = starting index , ei = ending index
         if(dp[si][ei] != 0)
             return dp[si][ei];

         int lele = si == 0 ? 1 : nums[si - 1]; //lele = leftelement
         int rele = ei == nums.length - 1 ? 1 : nums[ei + 1]; //rele = rightelement

         int maxCoin = 0;
         for(int cut = si; cut <= ei; cut++){
             int lcost = cut == si ? 0 : maxCoins_memo(nums , si , cut - 1 , dp); //lcost:leftcost
             int rcost = cut == ei ? 0 : maxCoins_memo(nums , cut + 1 , ei , dp); //rcost:rightcost

             maxCoin = Math.max(maxCoin , lcost + lele * nums[cut] * rele + rcost); // maxcoin means the maximum number of coins collect after balloon burst
         }

         return dp[si][ei] = maxCoin; 
     }
     public int maxCoins(int[] nums) {
         int n = nums.length;
         int[][] dp = new int[n][n];

         return maxCoins_memo(nums , 0 , n - 1 , dp);
     }





    /*
     Sample input: [3,1,5,8]
                   
     Sample Output: 167
     
     
     */
