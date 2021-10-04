//   Q :   Sorting method ==> Bubble Sort
import java.util.Arrays;            // imported the Array class to print the output

public class Bubble_Sort {
    public static void main(String[] args) {       // main function
        int[] arr = {1, 2, 3, 6, 5, 4};                                 // input
        System.out.println(Arrays.toString(BubbleSort(arr)));           // method to print the output
    }

    public static int[] BubbleSort(int[] arr) {                         // bubble sort ( the main code)
        boolean swapped;                                                  // added the boolean step to check whether the elements are swapped or not
        for (int i = 0; i < arr.length; i++) {                              // first loop
            swapped = false;                                                 // till here boolean is false because nothing is swapped
            for (int j = 1; j < arr.length - i; j++) {                          // second loop which will compare elements if the first element is greater then second
                if (arr[j] < arr[j - 1]) {                                      // it will swap
                    int temp = arr[j];                                         // method to swap two elements
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;                                              // elements will be swapped and boolean will become true 
                }
            }
            if (!swapped) {                                                           // if nothing will swap mean array is sorted so boolean will remain false anad the loop
                break;                                                                  // will break
            }
        }
        return arr;                                                                  // returning the array
    }
}
