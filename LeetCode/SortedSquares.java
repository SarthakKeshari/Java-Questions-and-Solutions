
// Java program to Sort the square of the numbers 
// of the array 
import java.util.*; 
import java.io.*; 
public class sortsq  
{ 
   // Function to sort an square array 
    public static void sortSquares(int arr[]) 
    { 
        int n = arr.length; 
        // First convert each array elements 
        // into its square 
        for (int i = 0 ; i < n ; i++) 
            arr[i] = arr[i] * arr[i]; 
   
        //  using "inbuild sort function" for sorting
        // in Arrays class. 
        Arrays.sort(arr); 
    }
  //sample driver program
    public static void main (String[] args) 
    { 
        int arr[] = { -17 , -12 , -1 , 4 , 8 , 15 }; 
        int n = arr.length; 
      
        System.out.println("Original "); 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
          
        sortSquares(arr); 
        System.out.println(""); 
        System.out.println("Implementing sort"); 
        for (int i = 0 ; i < n ; i++) 
            System.out.print(arr[i] + " "); 
  
    } 
}
