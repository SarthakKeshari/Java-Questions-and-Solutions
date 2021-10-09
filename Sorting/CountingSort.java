package Sorting;

public class CountingSort {
    /*
     *Implement the counting sort in Java
     * */

    public static void main(String[] args) {
//        Array of integers to be sorted
        int[] inputArray = {4, 8, 3, 6, 7, 9, 1, 323, 2};

//        find the maximum value in the array
        int maxVal = inputArray[0];
        for (int i : inputArray) {
            if (maxVal < i) maxVal = i;
        }

//      get the sorted array by calling the countingSort method, passing in the input array and the maximum value of the array
        int[] sortedArray = countingSort(inputArray, maxVal);

//        print out the details of the initial array
        System.out.println("Initial Array : ");
        for (int i : inputArray) {
            System.out.print(i + ", ");
        }
        System.out.println();

//        print out the details of the sorted array
        System.out.println("Sorted Array : ");
        for (int j : sortedArray) {
            System.out.print(j + ", ");
        }

    }

    //    method to sort the array using counting sort
    private static int[] countingSort(int[] inputArray, int maxValue) {

//      array to hold the number of occurrences of each number
//      occurrences of #1 goes into array position 1
//      occurrences of #2 goes into array position 2 etc.
//      this array has to be of length one bigger than the maximum value in our input array
        int[] occurrences = new int[maxValue + 1];
//      set all elements in the occurrences array to be 0
        for (int i = 0; i < occurrences.length; i++) {
            occurrences[i] = 0;
        }

//      output array will hold the sorted array at the end, this array should be the same size as the input array
        int[] output = new int[inputArray.length];

//      add one to the occurrences array in the position of the value of inputArray[i]
//      e.g. if inputArray[i] is 4 then occurrences[4] will be increased by 1
        for (int i = 0; i < inputArray.length; i++) {
            occurrences[inputArray[i]]++;
        }

//      set the current value of the occurrences array equal to the previous plus current
//      e.g. 1,1,0,1 -> 1.2.2.3
        for (int i = 1; i < occurrences.length; i++) {
            occurrences[i] = occurrences[i - 1] + occurrences[i];
        }

        for (int i = 0; i < inputArray.length ; i++) {
//          the position in the output array for the number in the input array is occurrences[inputArray[i]]-1
//          e.g.
//          occurrences = {1,3,4,4,6}
//          inputArray  = {1,2,4}
//          output position for inputArray[1] = (occurrences[2])-1 = 4-1 = 3
            int outputPosition = occurrences[inputArray[i]]-1;
//          set output array at output position to be the current value of inputArray
//          this puts the value in inputArray into the correct position
            output[outputPosition] = inputArray[i];
            occurrences[inputArray[i]]--;
        }
//      return the sorted array
        return output;
    }
}
