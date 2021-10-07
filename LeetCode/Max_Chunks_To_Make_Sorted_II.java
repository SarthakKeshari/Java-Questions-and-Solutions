
//768. Max Chunks To Make Sorted II

//You are given an integer array arr.

//We split arr into some number of chunks (i.e., partitions), and individually sort each chunk. After concatenating them, the result should equal the sorted array.

//Return the largest number of chunks we can make to sort the array.
 

//Example 1:

//Input: arr = [5,4,3,2,1]
//Output: 1
//Explanation:
//Splitting into two or more chunks will not return the required result.
//For example, splitting into [5, 4], [3, 2, 1] will result in [4, 5, 1, 2, 3], which isn't sorted.

//Example 2:

//Input: arr = [2,1,3,4,4]
//Output: 4
//Explanation:
//We can split into two chunks, such as [2, 1], [3, 4, 4].
//However, splitting into [2, 1], [3], [4], [4] is the highest number of chunks possible.
 

//Constraints:

//1 <= arr.length <= 2000
//0 <= arr[i] <= 108

import java.util.Scanner;

public class Max_Chunks_To_Make_Sorted_II {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of element : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter " + n + " values :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = maxChunksToSorted2(arr);

		System.out.println("Maximun chunk to sorts are : " + ans);
	}

	private static int maxChunksToSorted2(int[] arr) {
//		generate right minimum 
		int[] rmin = new int[arr.length + 1];

		rmin[arr.length] = Integer.MAX_VALUE;
		for (int i = arr.length - 1; i >= 0; i--) {
			rmin[i] = Math.min(rmin[i + 1], arr[i]);
		}

//		iterate on array and manage left maximum as well as count chunk
		int lmax = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			lmax = Math.max(lmax, arr[i]);
//			if the left max element is less than right minimum element than left partis one of the chunk so increment count
			if (lmax <= rmin[i + 1])
				count++;
		}
		return count;
	}

}
