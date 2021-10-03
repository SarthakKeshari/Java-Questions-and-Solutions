//Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int cnt=0;
        int len=0;
        while(len<32) 
        {
            if((n&1)==1) //perform bitwise AND and count 1's
            {
                cnt++;
            }
            n=n>>1; //right shift digit by one bit
            len++;
        }
        return cnt;
    }
}
