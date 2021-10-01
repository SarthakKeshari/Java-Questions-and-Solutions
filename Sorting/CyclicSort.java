import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

                // Question: Sort the array if the numbers are given from 1 to n, where n is
                // the length of the array. remember array should be continuous.
                // TimeComplexity: O(number of comparison).
                // SpaceComplexity: O(1).

        int[] arr = {5, 2, 3, 1, 7, 6, 4};      // Declaration and initialization of unsorted array

        System.out.println(Arrays.toString(cyclicSort(arr)));   // Function call and printing the sorted array.
    }

    // Method to sort the array
    public static int[] cyclicSort(int[] arr) {

        int i = 0;
        while(i < arr.length){

            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {

                swap(arr, i, correctIndex);     // Function call to swap the number.
            }else {

                i++;
            }
        }
        return arr;
    }

    // Function to swap the array.
    public static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
