public class FindPeak {

    public static void main(String[] args) {        // Question: Find peak value in zig-zag array
                                                    // In this problem we are using binary search

        int[] arr = {1, 2, 4, 5, 3, 2, 1, 2};
//        int[] arr = {2, 5, 7, 8, 10, 7, 6, 3, 2, 3, 4, 6, 10, 7, 3, 1,};
        System.out.println(peak(arr));      // Calling the function and printing the return value
    }

    // Method to find index of the peak value
    public static int peak(int[] arr) {

        int startIndex = 0;
        int LastIndex = arr.length - 1;

        while (startIndex < LastIndex) {

            int midElement = startIndex + (LastIndex - startIndex) / 2;     // Finding middle element

            if(arr[midElement] > arr[midElement + 1]) {         //whole logic

                LastIndex = midElement;                          // of the

            } else if(arr[midElement] < arr[midElement + 1]){   // program

                startIndex = midElement + 1;                    // is enclosed in this block
            }
        }
        return LastIndex;   // At the end startIndex and LastIndex will point at same index so return LastIndex or startIndex.
    }
}
