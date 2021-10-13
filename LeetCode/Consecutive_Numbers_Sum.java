//829. Consecutive Numbers Sum

//Given an integer n, return the number of ways you can write n as the sum of consecutive positive integers.

//Example 1:

//Input: n = 5
//Output: 2
//Explanation: 5 = 2 + 3

//Example 2:

//Input: n = 9
//Output: 3
//Explanation: 9 = 4 + 5 = 2 + 3 + 4

//Example 3:

//Input: n = 15
//Output: 4
//Explanation: 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5

//Constraints:

//1 <= n <= 109

import java.util.Scanner;

public class Consecutive_Numbers_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int ans = consecutiveNumbersSum(num);
		System.out.println("Ans : " + ans);
	}

	private static int consecutiveNumbersSum(int num) {
		int count = 0;

//		for finding the upperlimit of k
//		sequance is start with x, consicutive upperlimit k
//		x + (x+1) + (x+2) + ... + x(k-1) = num
//		kx + k(k-1)/2 = num
//		x = (num - k(k-1)/2)/k
//		if integer is positive so x>0
//		so we got the cnditition 2*num>k(k-1)
		for (int k = 1; 2 * num > k * (k - 1); k++) {

//		Ans x is valid when the x is integer
//		so we got numanator = (num - k(k-1)/2)
//				  denomator = k			
			int numenator = num - (k * (k - 1) / 2);

//			for x integer = condition numenator % k == 0

			if (numenator % k == 0)
				count++;
		}
		return count;
	}

}
