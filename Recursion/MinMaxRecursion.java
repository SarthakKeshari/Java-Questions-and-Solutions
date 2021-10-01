/*Write a program to find Minimum and Maximum of an Array.
Eg : 
Input : 
5
7 8 9 4 0
Output : 
[0,9]
*/
import java.util.*;
class MinMaxRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //size of array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
             arr[i] = input.nextInt(); //Input array
        }

        int[] array = new int[]{MinArrRec(arr, n), MaxArrRec(arr, n)}; //Array of [min,max]
        System.out.println(Arrays.toString(array));
        input.close();
    }
    public static int MinArrRec(int[] A, int n)
    {

        if(n == 1) //If size of array is 1, then same element is min and max
            return A[0]; 

        return Math.min(A[n-1], MinArrRec(A, n-1));//Recursively finding minimum
    
    }
    public static int MaxArrRec(int[] A, int n)
    {
        if(n == 1) //If size of array is 1, then same element is min and max
            return A[0];

        return Math.max(A[n-1], MaxArrRec(A, n-1)); //Recursively finding maximum

    }


}
