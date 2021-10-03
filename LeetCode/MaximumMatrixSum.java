import java.util.*;
//Question URL-https://leetcode.com/problems/maximum-matrix-sum/
/*
Aproach:
1.If we have a zero anywhere we can use it to flip all negatives into positives.
2.If we have even number of negatives, we can turn all negatives into positives.
3.Otherwise, we turn the smallest absolute value into a negative, and everything else - into positives.
 */
class Solution4{
    public long maxMatrixSum(int[][] matrix) {
        int count=0;
        long sum=0;
        int min=Integer.MAX_VALUE;
        for (int ele[]:matrix)
        {
            for (int x:ele)
            {
                if (x<0)
                {
                    count++;
                }
                sum+=Math.abs(x);
                min=Math.min(min,Math.abs(x));
            }
        }
        if (count%2!=0)
        {
            sum-=min*2;
        }
        return sum;
    }


}