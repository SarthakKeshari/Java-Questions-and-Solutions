import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Q. print all substring of a given string in java?
 * input = abc
 * output = a,ab,abc, b,bc, c
 */
public class AllSubstrings {
	public static String allSubstrings(String string) {
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
		result = result.substring(1,21).replaceAll("\\s+", "");
		String[] filter = result.split(",");
		String filterPass = "";
		String filterRemove = "";
		
		for (String string2 : filter) {
			char[] t = string2.toCharArray();
			int limit = t.length -1;
			if (t.length == 1) {
				filterPass += String.valueOf(t) + " ";
			}else {
				if(Character.codePointAt(t, 0) > Character.codePointAt(t,1) ||Character.codePointAt(t,limit) < Character.codePointAt(t, 0)) {
					filterRemove += String.valueOf(t)+ " ";
				}else {
					filterPass += String.valueOf(t) + " ";
				}
			}
		}
		String pass ="Pass in Test --> " + filterPass;
		String failed = "Failed : " + filterRemove;
		
		
		return pass + "\n" + failed;
		
	}
}