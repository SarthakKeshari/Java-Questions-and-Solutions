/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. 
Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor. 
*/
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int l=cost.length;
        int dp[]=new int[l];//creating an array of size of cost
        dp[0]=cost[0]; //initializing cost of 0th index to dp of 0th index
        if(l>1) 
        dp[1]=cost[1]; //if l greater than one than copying the 1st index value respectively
        for(int i=2;i<l;i++)
        {
            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];  //taking the mininmum cost from the i-1 and i-2 index 
        }
        return dp[l-1]>dp[l-2]?dp[l-2]:dp[l-1]; //returning the smallest value between i-1 and i-1 index
    }
}