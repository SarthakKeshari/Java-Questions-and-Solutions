//Searching element in an array within given range.
package com.company;

public class searchinrange {
    public static void main(String[] args) {
        int[] arr={12,1,4,45,84,65,41,23,78,98};
        int target=98;
        int ans=rser(arr,target,1,5); //passing values to the function
        if(ans==0){
            System.out.println("Array is empty");
        }
        if (ans==1){
            System.out.println("Target element present in an array within given range");
        }
        if (ans==2){
            System.out.println("Target element not there in an array within given range");
        }

    }
    static int rser(int[] arr,int target,int start,int end ){ //declaring function
        if(arr.length==0){ // checking array size
            return 0;
        }
        for(int i=start;i<=end;i++){ // loop for array to check in range
            int elem=arr[i];
            if(elem==target){   // target element found
                return 1;
            }
        }
        return 2;// loop out  target is not there
    }
}
