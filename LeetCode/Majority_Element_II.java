
//229. Majority Element II
//Given an integer array of size n, find all elements that appear more than ⌊ n/3⌋  times.

//Example 1:

//Input: nums = [3,2,3]
//Output: [3]
//Example 2:

//Input: nums = [1]
//Output: [1]
//Example 3:

//Input: nums = [1,2]
//Output: [1,2]

//Constraints:

//1 <= nums.length <= 5 * 104
//-109 <= nums[i] <= 109

import java.util.*;

public class Majority_Element_II {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of element : ");
		int n = sc.nextInt();

		int nums[] = new int[n];
		System.out.println("Enter " + n + " values :");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		List<Integer> ans = majorityElement_II(nums);

		System.out.println("Majority Element is : " + ans);
	}

	public static List<Integer> majorityElement_II(int[] nums) {
		
//		take variables 
		int num1 = -1, num2 = -1, c1 = 0, c2 = 0, len = nums.length;
//		run foreach loop
		for (int el : nums) {
//		for first time check with the num1 if the numbers are same than increment in c1(count 1)
//		else if first time check with the num2 if the numbers are same than increment in c2(count 2)
//		if c1 is the first element so value of num1 is same as e1 and same for e2		
			if (el == num1)
				c1++;
			else if (el == num2)
				c2++;
			else if (c1 == 0) {
				num1 = el;
				c1 = 1;
			} else if (c2 == 0) {
				num2 = el;
				c2 = 1;
			} else {
				c1--;
				c2--;
			}
		}
//		make list for the find all elements that appear more than ⌊ n/3⌋  times.
		List<Integer> ans = new ArrayList<Integer>();
		c1 = 0;
		c2 = 0;
		for (int el : nums) {
			if (el == num1)
				c1++;
			else if (el == num2)
				c2++;
		}
//		checking the conditition
		if (c1 > len / 3)
			ans.add(num1);
		if (c2 > len / 3)
			ans.add(num2);

		return ans;

	}

}
