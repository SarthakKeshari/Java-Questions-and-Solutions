//795. Number of Subarrays with Bounded Maximum

//Given an integer array nums and two integers left and right, return the number of contiguous non-empty subarrays such that the value of the maximum array element in that subarray is in the range [left, right].

//The test cases are generated so that the answer will fit in a 32-bit integer.

//Example 1:

//Input: nums = [2,1,4,3], left = 2, right = 3
//Output: 3
//Explanation: There are three subarrays that meet the requirements: [2], [2, 1], [3].

//Example 2:

//Input: nums = [2,9,2,5,6], left = 2, right = 8
//Output: 7
 
//Constraints:

//1 <= nums.length <= 105
//0 <= nums[i] <= 109
//0 <= left <= right <= 109

import java.util.Scanner;

public class Number_of_Subarrays_with_Bounded_Maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of element : ");
		int n = sc.nextInt();

		int nums[] = new int[n];
		System.out.println("Enter " + n + " values :");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Left : ");
		int left = sc.nextInt();
		System.out.print("Right : ");
		int right = sc.nextInt();
		int ans = numSubarrayBoundedMax(nums, left, right);

		System.out.println(" ans : " + ans);

	}

	private static int numSubarrayBoundedMax(int[] nums, int left, int right) {
//		starting index and ending index both set it to 0
		int si = 0, ei = 0;
//		get length of array
		int n = nums.length;
//		store value of ans and previous count to 0
		int ans = 0, prevc = 0;
//		start loop according to the length
		while (ei < n) {
//			check the ending index value with left and right variables 
//			if the value is between the both set previous count = ending indexd - staring index + one
//			and than store value in the ans
			if (left <= nums[ei] && right >= nums[ei]) {
				prevc = ei - si + 1;
				ans += prevc;
			} 
//			if the value of the nums is less than the left variable so it store only previous count value 
			else if (nums[ei] < left) {
				ans += prevc;
			}
//			if the both cases are not valid than for uper bound not to check 
//			simply increase the starting index 
//			and set the previous count to 0
			else {
				si = ei + 1;
				prevc = 0;
			}
			ei++;
		}
		return ans;
	}

}
