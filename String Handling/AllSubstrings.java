/*
 * Q. print all substring of a given string in java?
 * input = abc
 * output = a,ab,abc, b,bc, c
 */
public class AllSubstrings {
	public static String allSubstrings(String string) {
		String result = "";
		//Java already has a native method for substrings. So we just have to find substring between every 
		//Iteration character using Nested Loop.
		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j <= string.length(); j++) {
				result += string.substring(i, j) + " , ";

			}

		}
		return result;
	}
}