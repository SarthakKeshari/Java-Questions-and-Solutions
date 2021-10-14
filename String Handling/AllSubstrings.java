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
		String result = String.valueOf(uniqueSubs);
		result = result.substring(1, 21).replaceAll("\\s+", "");
		String[] filter = result.split(",");

		String filterPass = "";
		String filterRemove = "";

		for (String string2 : filter) {
			if (string2.length() == 1) {
				filterPass += string2 + " ";
			} else {
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
