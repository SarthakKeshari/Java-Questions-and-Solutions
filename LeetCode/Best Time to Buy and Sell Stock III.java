//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//Find the maximum profit you can achieve. You may complete at most two transactions.
//Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
class Solution {
    public int maxProfit(int[] prices) {
        int buyOne = Integer.MAX_VALUE;
		int ProfitOne = 0;               // Profit gained after selling 1st share.
        int buyTwo = Integer.MAX_VALUE;
        int ProfitTwo = 0;               // Profit gained after selling 2nd share.
        for(int p : prices) {
            buyOne = Math.min(buyOne, p);
            ProfitOne = Math.max(ProfitOne, p - buyOne);
            buyTwo = Math.min(buyTwo, p - ProfitOne);     // If I made $100 profit in 1st trans'. Then the 2nd Stock(maybe $300) I buy is actually $300 - $100 = $200 for me. 
            ProfitTwo = Math.max(ProfitTwo, p - buyTwo);   // And finally The maximum profit I make with the 2nd trans' is my actuall profit with 2 transaction. 
        }
        return ProfitTwo;
    }
}
//Sample Input :[3,3,5,0,0,3,1,4]
//Sample output: 6
//Time Complexity - O(N)
//Space Complexity - O(1)
