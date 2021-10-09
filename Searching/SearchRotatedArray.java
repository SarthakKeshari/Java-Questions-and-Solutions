package searching;

/*
We are given a sorted array, which may or may not be rotated by a number of times,
we need to search for a number in the array.
 */
public class SearchRotatedArray {
    public static void main(String[] args) {
        // rotated array happy path test.
        System.out.println(binarySearchOnRotatedSortedArray(new int[]{12, 14, 18, 21, 3, 6, 8, 9}
                , 8));
        // negative test, no result.
        System.out.println(binarySearchOnRotatedSortedArray(new int[]{12, 14, 18, 21, 3, 6, 8, 9}
                , 1));
        // no rotation sorted array test.
        System.out.println(binarySearchOnRotatedSortedArray(new int[]{3, 6, 8, 9, 12, 14, 18, 21}
                , 14));
        // different rotation of same array test.
        System.out.println(binarySearchOnRotatedSortedArray(new int[]{18, 21, 3, 6, 8, 9, 12, 14}
                , 14));
    }

    /*
     * We return -1 as result if key is not found.
     * We return index of the key in the array if key is found.
     * */
    private static int binarySearchOnRotatedSortedArray(int[] arr, int key) {
        // left end of the array, start with index 0.
        int left = 0;
        // right end of the array, start with last index.
        int right = arr.length - 1;
        // condition for looping, left index must be less than or equal to
        // right index.
        while (left <= right) {
            int midIndex = (left + right) / 2;
            // if midIndex in array, contains key, return that index
            if (arr[midIndex] == key) {
                return midIndex;
            }
            // now, we know, key is not present at midIndex.

            // see if midIndex value in array is less than or equal to
            // value at right index of the array.
            if (arr[midIndex] <= arr[right]) {
                if (key > arr[midIndex] && key <= arr[right]) {
                    // here we are checking if the key is after midIndex
                    // and before or is in right index.
                    left = midIndex + 1;
                } else {
                    // this means key is before midIndex, we have to search between left and
                    // before mid.
                    right = midIndex - 1;
                }
            } else if (arr[midIndex] >= arr[left]) {
                // see if midIndex value in array is greater than or equal to
                // value at left index of the array.
                if (key < arr[midIndex] && key >= arr[left]) {
                    // here we are checking if the key is before the midIndex and
                    // after or same as left index value.
                    right = midIndex - 1;
                } else {
                    // this means key is not between left and midIndex in array, we need to
                    // make left to midIndex + 1.
                    left = midIndex + 1;
                }
            }
        }

        // when we exhausted the search and not find key in array, we return -1.
        return -1;
    }
}
