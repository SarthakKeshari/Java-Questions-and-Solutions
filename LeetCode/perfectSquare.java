/*
Given an integer n, return the least number of perfect square numbers that sum to n.

A perfect square is an integer that is the square of an integer; in other words, 
it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares 
while 3 and 11 are not.
 */

class Solution {
    public int numSquares(int n) {
        int dp[]=new int[n+1]; //created an array of length n+1
        dp[0]=0; //initalized 0th position with 0
        dp[1]=1; //initialized 1st position with 1
        
        for(int i=2;i<=n;i++)  //initialized for loop from 2 to n
        {
            int ans=Integer.MAX_VALUE; // assume ans is the maximum value
            for(int j=1;j*j<=i;j++) //traversing j loop as perfect square
            {
                int rem=i-j*j;   //if  remainder is remaing
                if(dp[rem]<ans) // checking position of remainder less than ans 
                    ans=dp[rem]; //storing the ans as value at dp[rem]
            }
            dp[i]=ans+1; //at the end of j loop storing the ans as ans+1
        }
        
        return dp[n]; //returning the nth position as ans
        
    }
}