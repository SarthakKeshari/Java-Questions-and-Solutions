// issue #411 rotate array by k times
// time complexity : O(n)
// space complexity : O(1)
// https://leetcode.com/problems/rotate-array/

public class RotateArray {
  public static void main(String args[])
  {
  int num[]= {1,2,3,4,5,6,7}; 
  int k=500;
  System.out.print("before rotate the Array:"); 
  for(int el:num){
  System.out.print(el+" "); //1 2 3 4 5 6 7
  }  
  System.out.println(); 
    
    rotate(num,k);
    
   System.out.print("After rotate the Array:"); 
  for(int ell:num){
  System.out.print(ell + " "); // 5 6 7 1 2 3 4
  }  
  }
    public static void rotate(int[] num, int k)
    {
     
       int n = num.length;  // 7
         k = k%n; // after n times array will be in original position so we here taking the modulus of k
        reverseArray(num,0,n-1); // reverse whole array 
        reverseArray(num,0,k-1); // here we are reversing the array from (0) index to k-1 (2) index
        reverseArray(num,k,n-1); // here we are reversing the array from k(3) to n-1 (6) index
        
    }
    public static void reverseArray(int[] nums,int s, int l)
    {
        for(int i=s,j=l;i<j;i++,j--)
        {
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        
    }
}
