import java.util.ArrayList;

public class AllMissingNumber {                 // Question: Find all missing number in the array in O(log n) timeComplexity
    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 6, 4, 9, 5, 3, 2};

        System.out.println(missingNumber(arr));
    }

    // method to sort the array using cyclic sort and to find missing number
    public static ArrayList<Integer> missingNumber(int[] arr) {     // Here we use ArrayList because we don`t know how many numbers are missing

        int i = 0;
        while (i < arr.length) {

            int index = arr[i] - 1;

            if(arr[i] != arr[index]) {

                swap(arr, i, index);
            }else {

                i++;
            }
        }

        // Finding missing number
        ArrayList<Integer> nums = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {

            if(arr[j] != j + 1) {

                nums.add(j + 1);        // Adding the numbers into the list
            }else {

                j++;
            }
        }
        return nums;
    }

    // Method to swap the numbers
    public static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
