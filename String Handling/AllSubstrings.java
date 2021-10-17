import java.util.HashSet;
import java.util.Set;

/*
 * Q. print all substring of a given string in java?
 * input = abc
 * output = a,ab,abc, b,bc, c
 */
public class AllSubstrings {
	public static Set<String> allSubstrings(String string) {
		Set<String> uniqueSubs = new HashSet<String>();
		// Java already has a native method for substrings. So we just have to find
		// substring between every
		// Iteration character using Nested Loop.
		// adding into a HashSet because , we doesn't need duplicates.
		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j <= string.length(); j++) {

				uniqueSubs.add(string.substring(i, j));

			}

		}
		// adding the result in a string because we need to transfor this in Array of Character after all
		String result = String.valueOf(uniqueSubs);
		// removing the [] , we dont need this inside the array and after ensuring that just have one space between the Character
		result = result.substring(1, 21).replaceAll("\\s+", "");
		//Storing the result inside Array of Characters
		String[] filter = result.split(",");
		
		// Declaring the variables for the First check , wich will verify every Character
		String filterPass = "";
		String filterRemove = "";
		
		
		for (String string2 : filter) {
			if (string2.length() == 1) {
				filterPass += string2 + " ";
			} else {
				// Java has a method which retuns the numbers of the CodePoint at determinated index of array
				// So, we need to loop and comparing all results possible
				// In this code i opted for storing the valid ones and the failed , but you can just store one of them.
				for (int i = 0; i < string2.length() - 1; i++) {
					for (int j = i + 1; j <= string2.length() - i - 1; j++) {
						if (Character.codePointAt(string2, i) < Character.codePointAt(string2, j)) {
							filterPass += string2 + " ";
						} else {
							filterRemove += string2 + " ";
						}
					}

				}
			}

		}
		
		// Second Check , just for garantee  that if is contained in the Failed not to be in the approved.
		
		String[] arrPass = filterPass.split(" ");
		String[] arrFail = filterRemove.split(" ");
		Set<String> finallyPass = new HashSet<String>();
		
		for (String string2 : arrPass) {
			for (String string3 : arrFail) {
				if(string2.equals(string3)) {
					finallyPass.remove(string2);
				}else {
					finallyPass.add(string2);
				}
			}
		}
		
		
		return finallyPass;
	}

}
