//169. Majority Element
//
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. 
//You may assume that the majority element always exists in the array.
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
// 
//
//
//Constraints:
//
//n == nums.length
//1 <= n <= 5 * 104
//-231 <= nums[i] <= 231 - 1

import java.util.Scanner;

public class Majority_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of element : ");
		int n = sc.nextInt();

		int nums[] = new int[n];
		System.out.println("Enter " + n + " values :");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int ans = majorityElement(nums);

		System.out.println("Majority Element is : " + ans);

	}

	private static int majorityElement(int[] nums) {
		
//		take two variables for as key value pair 
		int count = 0;
		int candidate = 0;
//		loop
		for (int num : nums) {
//			if the number apears for the first-time after count value is zero than make it candidate
			if (count == 0) {
				candidate = num;
			}
			
//			if the key(candidate) and the number from the array are same than add one in count else reduce one
			if (candidate == num)
				count++;
			else
				count--;
		}
		return candidate;
	}

}
