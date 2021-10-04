/* Given an array of strings nums containing n unique binary strings each of length n, 
return a binary string of length n that does not appear in nums. If there are multiple answers, you may return any of them.
https://leetcode.com/problems/find-unique-binary-string/*/
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        
        int len=nums[0].length();
        String ans="",ans1="";
        for(int i=0;i<=Math.pow(2,len)-1;i++)
        {
            ans=Integer.toBinaryString(i); //converting to binary sting equivalent to number
            int l=ans.length();
            int a=len-l;
            if(a>0)
                ans1=String.format( "%0" +a+ "d%s" , 0, ans); //adding zeros before the conferted string 
            else
                ans1=ans;
             int cnt=0;
            for(int j=0;j<len;j++)
            {
                if(!nums[j].equals(ans1)) //checking if the string is present in array or not
                    cnt++;
            }
            if(cnt==len) //checking condition and returning the answer
                return ans1;
        }
        
        return ans1;
        
    }
}
