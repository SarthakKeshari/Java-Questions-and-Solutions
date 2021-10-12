/*Problem description
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.*/


class Solution {
    public void moveZeroes(int[] nums) {
        
        List<Integer> ls=new ArrayList();
      //Here if it is non zero then add to list
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                ls.add(nums[i]);
            }
            
        }
      //finding length
        int len=nums.length;
      //finding size
        int k=ls.size();
      //getting every element in nums array at exact index as that of index of list
      // then appending zero at last
        for(int i=0;i<len;i++)
        {
            if(i<k)
            {
            nums[i]=ls.get(i);
            }
            else
            {
                nums[i]=0;
            }
        }
        
    }
}
