/*
question -
Take 10 numbers as input from the user and sort it
*/

import java.util.*;  
class Main
{
    void merge(int a[], int l, int m, int r)     // merging the splited sorted arrays
    {
        //merging two arrays i.e L and R
        int n1 = m - l + 1; // size of the first array
        int n2 = r - m;  // size of the second array
  
        int L[] = new int[n1]; // first array
        int R[] = new int[n2]; // second array
  
        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];         // assigning values to the first array
        for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];    // assigning values to the second array
 
        int i = 0, j = 0;  // pointers t array L and R respectively
        int k = l;  // pointer to the main array
        while (i < n1 && j < n2) {  // merging until i and j not reach end of the array
            if (L[i] <= R[j]) {
                a[k++] = L[i++];    
            }
            else {
                a[k++] = R[j++];
            }
        }
        while (i < n1) {  // merging 1st array when 2nd array is completely merged 
            a[k++] = L[i++];
        }
        while (j < n2) {  // merging 2nd array when 1st array is completely merged
            a[k++] = R[j++];
        }
    }
    void sort(int arr[], int l, int r)         // dividing the array then merging sorted arrays
    {
        if (l < r) {
            int m =l+ (r-l)/2;  // calculating the mid of the array
            sort(arr, l, m);   // sorting the left part
            sort(arr, m + 1, r);  // sorting the right part
            merge(arr, l, m, r);  // merging the left and right part
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter ten numbers for the array"); 
        for(int i=0; i<10; i++)  
        {  
          arr[i]=sc.nextInt();   // taking input
        } 
        Main ob = new Main();
        ob.sort(arr, 0, arr.length - 1);  // sorting
  
        System.out.println("\nSorted array");
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");    // printing the sorted array
        System.out.println();
    }
}
