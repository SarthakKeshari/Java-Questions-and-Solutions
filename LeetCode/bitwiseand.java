/* Question :https://leetcode.com/problems/bitwise-and-of-numbers-range/
Given two integers left and right that represent the range [left, right], 
return the bitwise AND of all numbers in this range, inclusive.
*/


class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int c=0;
        while(left!=right) //continue till the both numbers are equal
        {
            left>>=1; //right shifting left most element by one digit
            right>>=1; // right shifting right most element by one digit
            c++; //counting no:of ones in given number
        }
        return left<<c; //left shifting the number by no of ones in left most number
    }
}