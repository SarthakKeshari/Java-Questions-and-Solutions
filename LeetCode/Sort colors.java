// QUESTION STATEMENT :
/*Given an array nums with n objects colored red, white, or blue,
 sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

                     OR

            https://leetcode.com/problems/sort-colors/
 */

import java.util.Arrays;                 // imported the array class

public class sort_colors {
    public static void main(String[] args) {     // main function
        int []colors = {2,1,0,0,1,2,1};            // input
        sortColors(colors);                         // calling the method
        System.out.println(Arrays.toString(colors));   // printing the output
    }
    public static void sortColors(int[] arr) {             // This question can be easily solved by implementing the bubble sort
        boolean swapped;                           // boolean to optimize it
        for(int i =0;i<arr.length;i++){           // first loop
            swapped = false;                         // till here boolean is false because nothing is swapped
            for(int j = 1;j<arr.length-i;j++){        // this loop will compare two numbers
                if(arr[j]<arr[j-1]){                 // and if the first one id greater
                    int temp = arr[j];                // it will swap it
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;                // boolean will become true
                }
            }
            if(!swapped){                       // if nothing will swap means array is sorted
                break;                             // so it will break the loop
            }
        }
    }                                                // method is of type VOID so nothing to return
}
