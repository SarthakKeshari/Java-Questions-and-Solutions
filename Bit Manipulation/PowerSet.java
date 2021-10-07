/* Question
Generate Power set using Bitwise operator

Sample Case
Input="ab"
Output="","a","b","ab" */

package javaquestion;

import java.util.*;

public class power {
	static void subset(String s) {
		//To find the length of string
		int a = s.length();
		
		// To get total number of subsets
		int pow = (int) Math.pow(2, a);
		
		//Outer loop from 0 to pow-1
		for (int counter = 0; counter < pow; counter++) {
			
			//inner loop for length of string
			for (int j = 0; j < a; j++) {
				
				//To check if nth bit is set or not 
				if ((counter & (1 << j)) != 0) {
					
					//To print that set bit from string
					System.out.print(s.charAt(j));
					
				}
			}
			//will print line to separate subsets
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		subset(s);
	}
}

// Time complexity- Theta(2^n*n)
