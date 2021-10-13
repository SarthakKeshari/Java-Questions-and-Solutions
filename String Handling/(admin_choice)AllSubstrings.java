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
		String result = "";
		String capitalLatter = "";
		String specialCharacters = "";
		String regex = "[a-z]+[~!@#$%^&*()_+{}\\\\[\\\\]:;,.<>/?-]";

		// Java already has a native method for substrings. So we just have to find
		// substring between every
		// Iteration character using Nested Loop.
		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j <= string.length(); j++) {

				result += string.substring(i, j) + "  ";

			}

		}
		String formated = result.replaceAll("//s+", "\\s");

		char[] verifictation = formated.toCharArray();
		for (char c : verifictation) {
			if (Character.isUpperCase(c)) {
				capitalLatter = formated.replaceAll("[a-z][A-Z]", "");

				return capitalLatter;
			} else if (!Character.isLetter(c)) {
				specialCharacters = formated.replaceAll(regex, "");
				String[] noDuplicates = specialCharacters.split(" ");
				Set<String> set = new HashSet<>(Arrays.asList(noDuplicates));
				String end = String.join(" ", set);

				return end;
			}

		}

		return formated;
	}
}
