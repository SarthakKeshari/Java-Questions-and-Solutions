//769. Max Chunks To Make Sorted

//You are given an integer array arr of length n that represents a permutation of the integers in the range [0, n - 1].

//We split arr into some number of chunks (i.e., partitions), and individually sort each chunk. After concatenating them, the result should equal the sorted array.

//Return the largest number of chunks we can make to sort the array.

//Example 1:

//Input: arr = [4,3,2,1,0]
//Output: 1
//Explanation:
//Splitting into two or more chunks will not return the required result.
//For example, splitting into [4, 3], [2, 1, 0] will result in [3, 4, 0, 1, 2], which isn't sorted.

//Example 2:

//Input: arr = [1,0,2,3,4]
//Output: 4
//Explanation:
//We can split into two chunks, such as [1, 0], [2, 3, 4].
//However, splitting into [1, 0], [2], [3], [4] is the highest number of chunks possible.

//Constraints:

//n == arr.length
//1 <= n <= 10
//0 <= arr[i] < n
//All the elements of arr are unique.

import java.util.Scanner;

public class Max_Chunks_To_Make_Sorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of element : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter " + n + " values :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = maxChunksToSorted(arr);

		System.out.println("Maximun chunk to sorts are : " + ans);

	}

	private static int maxChunksToSorted(int[] arr) {
		int max = 0;
		int count = 0;
//compair the array index and its value.
//reach the maximum of the arry element
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(arr[i], max);
//if the index and max count are same so there is one chunk so increment in count
			if (i == max) {
				count++;
			}
		}
		return count;
	}

}
