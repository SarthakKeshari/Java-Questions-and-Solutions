//747. Largest Number At Least Twice of Others

//You are given an integer array nums where the largest integer is unique.

//Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

//Example 1:

//Input: nums = [3,6,1,0]
//Output: 1
//Explanation: 6 is the largest integer.
//For every other number in the array x, 6 is at least twice as big as x.
//The index of value 6 is 1, so we return 1.

//Example 2:

//Input: nums = [1,2,3,4]
//Output: -1
//Explanation: 4 is less than twice the value of 3, so we return -1.

//Example 3:

//Input: nums = [1]
//Output: 0
//Explanation: 1 is trivially at least twice the value as any other number because there are no other numbers.
 

//Constraints:

//1 <= nums.length <= 50
//0 <= nums[i] <= 100
//The largest element in nums is unique.
//

import java.util.Arrays;
import java.util.Scanner;

public class Largest_Number_at_least_twise_of_other {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of element : ");
		int n = sc.nextInt();

		int nums[] = new int[n];
		System.out.println("Enter " + n + " values :");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int ans = dominantIndex(nums);

		System.out.println(" ans : " + ans);
	}

	private static int dominantIndex(int[] nums) {
// make clone of the nums Array 		
		int[] copy=nums.clone();
//sort the nums array 
		Arrays.sort(nums);
//		if the only one element is present there return 0
		if(nums.length==1)
			return 0;
//		after sorting compair last two elements if the last element is the 2times greater than the second last element so there is the value available 
		if(nums[nums.length-1]>=(2*nums[nums.length-2])) {
//		for finding the index of the element make target variable
			int target = nums[nums.length-1];
			for (int i = 0; i < copy.length; i++) {
//		        compair target and copy Array(clone of the nums) 
				if (copy[i] == target) {
		            return i;
		         } 
			}
		}
//		if the there is no value present in the array for the greatest and twise of other so return -1
		return -1;
}
}


