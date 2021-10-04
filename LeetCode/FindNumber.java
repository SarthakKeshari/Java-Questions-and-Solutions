public class FindNumber {
    public static void main(String[] args) {        // Question: Find the number in rotated sorted array in O(log n) time complexity
                                                    // In this problem first we have to find pivot element using binary search
                                                    // pivot = the biggest number in the array
                                                    // then we find target number using binary search

        int[] arr = {7, 9, 14, 0, 1, 2, 3, 6};
//        int[] arr = {4, 5, 6, 9, 0, 2, 4};

        System.out.println(targetNumber(arr, 8));   // Calling the function and printing the value
    }

    // Finding pivot element
    public static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;        // finding the middle element

            if(arr[mid] > arr[mid + 1] && mid < end) {

                return mid;

            }else if(arr[mid] < arr[mid - 1] && mid > start) {

                return mid - 1;

            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {        // This condition will hit when
                if(arr[start] > arr[start + 1]) {                       // any number is appear more than once

                    return start;
                }
                start++;

                if(arr[end] < arr[end - 1]) {

                    return end - 1;
                }
                end --;
            }

            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {

                start = mid + 1;
            }else {

                end = mid - 1;
            }
        }
        return -1;      // if pivot not found it returns -1.
    }


    public static int targetNumber(int[] arr, int target) {

        int pivotElement = findPivot(arr);
        if(pivotElement == - 1){        //if pivot not fond that means the array is not rotated then search using simple binary search

            return binarySearch(arr, target, 0, arr.length - 1);

        }else if(target == arr[pivotElement]){

            return pivotElement;

        }else if(target < arr[0]) {

            return binarySearch(arr, target, pivotElement + 1, arr.length - 1);

        }else {

            return binarySearch(arr, target, 0, pivotElement - 1);
        }
    }

    // Function of binary search
    public static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {

                end = mid - 1;
            }else if(target > arr[mid]) {

                start = mid + 1;
            }else {

                return mid;
            }
        }
        return -1;      // if target not found it returns -1
    }
}
