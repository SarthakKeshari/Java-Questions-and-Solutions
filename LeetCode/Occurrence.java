import java.util.Arrays;

public class Occurrence {           // Question: Find the first and last occurrence of the target number in array in O(log n) time complexity.

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 5, 6, 8, 8, 10, 11, 12, 13, 13};       // Initializing and declaring the sorted array

//        int[] arr = new int[20];      // Since array is initialized with zero it will print [0 19]

        System.out.println(Arrays.toString(occurrence(arr, 4)));    // Calling the function and printing the return value
    }

    public static int[] occurrence(int[] arr, int target) {

        int[] pos = {-1, -1};

        pos[0] = searchElement(arr, target, true);

        if(pos[0] != -1){       // If the target is not present in left side then no need to check the target in right side of the array
                                // because if target present then the index value will not be -1
                                // This check makes the program much faster

            pos[1] = searchElement(arr, target, false);
        }

        return pos;
    }

    // Function to find the target element
    public static int searchElement(int[] arr, int target, boolean check) {

        int start = 0;
        int end = arr.length - 1;
        int occur = -1;

        while(start <= end) {

            int midElement = start + (end - start) / 2;     // Finding the middle element

            if(target < arr[midElement]) {

                end = midElement - 1;
            }else if(target > arr[midElement]) {

                start = midElement + 1;
            }else {

                occur = midElement;

                if(check) {     // if target is present in array it might be possible that the more target elements are at left side and right side of the
                                // array so we check that, is target present in left side
                    end = midElement - 1;
                }else {

                    start = midElement + 1;     // Here we check that, is target present at right side
                }
            }
        }
        return occur;
    }
}
