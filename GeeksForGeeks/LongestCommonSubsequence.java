/*
 * Question :length of longest common subsequence of 2 string in java ?
 * input = s1 = "AGGTAB" s2 = "GXTXAYB";
 * output =4 (GTAB)
 */

public class LongestCommonSubsequence {
	public static String lcs(String string1, String string2) {
		// Initialize variables
		int x = string1.length();
		int y = string2.length();
		int result = 0;

		// matrix 2 x 2 , plus one because the last one will be the result
		int arrPossibilities[][] = new int[x + 1][y + 1];

		/*
		 * Nested Loop , for a matrix 2 x 2 that will be define all the possibilities
		 * from theory of permutation .
		 */
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= y; j++) {
				if (i == 0 || j == 0)
					arrPossibilities[i][j] = 0;
				else if (string1.charAt(i - 1) == string2.charAt(j - 1))
					arrPossibilities[i][j] = arrPossibilities[i - 1][j - 1] + 1;
				else
					arrPossibilities[i][j] = Math.max(arrPossibilities[i - 1][j], arrPossibilities[i][j - 1]);
			}
		}
		// Just a simple conversion, int for string.
		result = arrPossibilities[x][y];
		String numberOfMatches = Integer.toString(result);

		// The next step will discovery the phrase that repeats more often.
		// So we need to walkthrough the array of Possibilities
		char[] stringMatch = new char[arrPossibilities.length + 1];
		while (x > 0 && y > 0) {
			// If current character are same, so they are part of the Longest Possibilities
			if (string1.charAt(x - 1) == string2.charAt(y - 1)) {
				stringMatch[result - 1] = string1.charAt(x - 1);
				// condition for the while loop breaks.
				x--;
				y--;
				result--;
			}
			// If not same, then find the larger of two and go in the direction of larger value
			else if (arrPossibilities[x - 1][y] > arrPossibilities[x][y - 1])
				x--;
			else
				y--;
		}

		String stringMatcher = new String(stringMatch);
		String formatedResult = String.format("The Longest Common Subsequens was : %s , %s times ",
				stringMatcher.strip().trim(), numberOfMatches);
		return formatedResult;
	}

}