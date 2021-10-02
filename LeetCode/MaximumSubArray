class Solution {
    public int maxSubArray(int[] arr) {
        
        
        // Your code here
        int sum=arr[0];
    int dp[]=new int[arr.length];
        dp[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            dp[i]=max(dp[i-1],0)+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
        sum=max(dp[i],sum);
        
        }
      //  System.out.print(sum);
        return sum;
    }
   public static int max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}
