//189. Rotate Array

//Given an array, rotate the array to the right by k steps,
//where k is non-negative.

//Example 1:
//
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]

//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]

//Example 2:
//
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]

//Explanation: 
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]

//Constraints:

//1 <= nums.length <= 105
//-231 <= nums[i] <= 231 - 1
//0 <= k <= 105

public class Rotate_Array {

	public static void main(String[] args) {
//		take array
		int[] nums = { 1, 0, 0, 0, 0, 0, 0 };
//		take value for rotation
		int k = 2;
//		call the function rotate
		rotate(nums, k);
	}

//	-----------------------------------------------
//	method one o(n2) time complexity

//	take two for loops and with the help of temp variable rotate array

//	-----------------------------------------------
//	public static void rotate(int[] nums, int k) {
//		int temp,n=nums.length,i,j;
//		for (i = 0; i < k; i++) {
//		temp = nums[n - 1];
//			for (j = n - 1; j > 0; j--) {
//				nums[j] = nums[j - 1];
//			}
//			nums[0] = temp;
//		}
//		
//		for(j=0;j<n;j++) {			
//			System.out.print(nums[j]+ " ");
//		}
//	}

//	-----------------------------------------------
//	method for get perfect solution in leetcode

//	take the another array for storing the value into that but 
//	that is not proper answer for the leetcode 
//	-----------------------------------------------

//	private static void rotate(int[] nums, int k) {
//		int[] reordered = new int[nums.length];
//		for (int i = 0; i < nums.length; i++)
//			reordered[i] = nums[(k + i + 1) % nums.length];
//		System.out.print("[");
//		for (int j = 0; j < nums.length; j++) {
//			
//			if(j!=(nums.length-1))
//				System.out.print(reordered[j] + ",");
//			else
//				System.out.print(reordered[j]);
//		}
//		System.out.println("]");
//	}

//	-----------------------------------------------
// code submitted in leetcode

//	first copy the array in duplicate array.
//	than using the k value and positioning with the i set nums array
//	-----------------------------------------------
	private static void rotate(int[] nums, int k) {
		int[] duplicate = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
			duplicate[i] = nums[i];

		for (int i = 0; i < nums.length; i++)
			nums[(k + i) % nums.length] = duplicate[i];

		for (int j = 0; j < nums.length; j++) {
			System.out.print(nums[j] + " ");
		}

	}

}
