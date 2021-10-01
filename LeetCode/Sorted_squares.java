//977. Squares of a Sorted Array

//Given an integer array nums sorted in non-decreasing order, 
//return an array of the squares of each number sorted in non-decreasing order.

//Example 1:
//
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100].

import java.util.Arrays;

public class Sorted_squares {
//	main method
	public static void main(String[] args) {
		int[] nums = { -2, 3, 4, 5, 0 };
		sortedSquares(nums);
	}

//	sortedSquares method
	public static int sortedSquares(int[] nums) {
//		get length of array and put into the n
		int n = nums.length;
//		make sq variable array for storing the values
		int[] sq = new int[n];
//       storing the square values call square function 
		for (int i = 0; i < n; i++) {
			sq[i] = square(nums[i]);
		}
//        sort() method of the Arrays class.
		Arrays.sort(sq);
//        print the value 
		for (int i = 0; i < n; i++) {
			System.out.print(sq[i] + " ");
		}
		return 0;
	}

//		for squareing the number
	private static int square(int i) {
		return i * i;
	}
}
