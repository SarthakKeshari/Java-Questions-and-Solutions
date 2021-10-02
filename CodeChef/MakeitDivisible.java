/*
 Given an integer N, help Chef in finding an N-digit odd positive integer X such that X is divisible by 3 but not by 9.

Note: There should not be any leading zeroes in X. In other words, 003 is not a valid 3-digit odd positive integer.

Input Format
The first line of input contains a single integer T, denoting the number of testcases. The description of the T testcases follows.
The first and only line of each test case contains a single integer N, denoting the number of digits in X.
Output Format
For each testcase, output a single line containing an N-digit odd positive integer X in decimal number system, such that X is divisible by 3 but not by 9.

Constraints
1?T?500
1?N?104
The sum of N over all test cases does not exceed 105
Sample Input 1 
3
1
2
3
Sample Output 1 
3
15
123
 */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MakeitDivisible 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in); //Scanner for taking input
		int t = in.nextInt(); //variable t for number of test case
		while(t>0) //Loop for each test case
		{
		    int n = in.nextInt(); //integer N, denoting the number of digits in X.
		    if(n==1) //checking if n is 1
		    {
		        System.out.println(3); // then printing the value of 1.
		    }
		    else //if not 1 (else part)
		    {
		        int arr[] = new int[n]; // Array arr of int type.
		        arr[0] = 3; // Setting the value of 1st index of Array to 3.
		        arr[n-1] = 3; //Setting the value of last index of Array to 3.
		        System.out.println(Arrays.toString(arr).replaceAll("[\\[\\], ]", "")); //Converting array to sting and then replcing all special characters and printing it.
		    }
		    t--; // decrementing the value of t.
		}
	}
}
