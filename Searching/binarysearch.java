//Write a program to perform binary search

package com.company;

public class binarysearch {
    public static void main(String[] args) {
        int[] nums={5,6,7,8,10,12,15,17,21,25,29,32,35,36,39,40,45,49,51};
        int target= 15;
        int ans= binarysearch(nums,target);// passing values into the function
        //System.out.println(ans);
        if(ans==-1){
            System.out.println("Target element not present in given array");//print if element not present in array
        }
        else {
            System.out.println("Taget is present at index: "+ans);//print if element  present in array with index
        }
    }
        static int binarysearch(int[] nums, int target) { //declaring function
            int Fisrt = 0;//element present at the fisrt position
            int last = nums.length - 1;//element present at the last position
            while (Fisrt <= last) {
                int mid;
                mid = Fisrt + (last - Fisrt) / 2;//finding middle element present inside the array

                if (target < nums[mid]) {
                    last = mid - 1;
                } else if (target > nums[mid]) {
                    Fisrt = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
    }
}
