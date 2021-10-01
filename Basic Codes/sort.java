/*
question -
Take 10 numbers as input from the user and sort it
*/

import java.util.*;  
class Main
{
    void merge(int a[], int l, int m, int r)     // merging the splited sorted arrays
    {
        int n1 = m - l + 1, n2 = r - m;
  
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];
 
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k++] = L[i++];
            }
            else {
                a[k++] = R[j++];
            }
        }
        while (i < n1) {
            a[k++] = L[i++];
        }
        while (j < n2) {
            a[k++] = R[j++];
        }
    }
    void sort(int arr[], int l, int r)         // dividing the array then merging sorted arrays
    {
        if (l < r) {
            int m =l+ (r-l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter ten numbers for the array"); 
        for(int i=0; i<10; i++)  
        {  
          arr[i]=sc.nextInt();  
        } 
        Main ob = new Main();
        ob.sort(arr, 0, arr.length - 1);
  
        System.out.println("\nSorted array");
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
