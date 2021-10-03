/*
https://leetcode.com/problems/find-all-duplicates-in-an-array/
*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //we are solving this question using cyclic sort
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);// this line will call the function swap
            }
            else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);//here we are adding elements in array
            }
        }
        return ans;
    }
    void swap(int[] arr,int b,int a){ // by creating 1 temp varible to swap the values of variables
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}