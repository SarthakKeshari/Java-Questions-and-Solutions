//628. Maximum Product of Three Numbers

//Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

//Example 1:

//Input: nums = [1,2,3]
//Output: 6

//Example 2:

//Input: nums = [1,2,3,4]
//Output: 24

//Example 3:

//Input: nums = [-1,-2,-3]
//Output: -6

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Maximum_Product_of_Three_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of element : ");
		int n = sc.nextInt();
		if (n < 3) {
			System.out.println("you must enter atlist 3 numbers");
		} else {
			int nums[] = new int[n];
			System.out.println("Enter " + n + " values :");
			for (int i = 0; i < n; i++) {
				nums[i] = sc.nextInt();
			}
			int ans = maximumProduct(nums);

			System.out.println("Maximun product of three numbers : " + ans);
		}
	}

	private static int maximumProduct(int[] nums) {
			
// 		if the numbers is negative and so it will be the first index position second index position after sorting
// 		take that two numbers and Array's last index number
// 		compair with the last three index numbers which are largest in the array after sorting
// 		using the math.max function we got maximun from them
		Arrays.sort(nums);
        int mul = Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
		return mul;
		
	}

}
