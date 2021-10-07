// Question
// Generate Power set using Bitwise operator

// Sample Case
// Input="ab"
// Output="","a","b","ab"

package javaquestion;

import java.util.*;

public class power {
	static void subset(String s) {
		int a = s.length();
		int pow = (int) Math.pow(2, a);
		for (int counter = 0; counter < pow; counter++) {
			for (int j = 0; j < a; j++) {
				if ((counter & (1 << j)) != 0) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		subset(s);
	}
}
