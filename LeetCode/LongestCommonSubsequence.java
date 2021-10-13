

public class LongestCommonSubsequence {
	public static String lcs(String string1, String string2) {
		int x = string1.length();
		int y = string2.length();
		int result = 0;

		// matrix 2 x 2
		int arrPossibilities[][] = new int[x + 1][y + 1];

		/*
		 * Nested Loop , for a matrix 2 x 2 that will be define all the possiblities
		 * from theory of permutation and combination
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
		result = arrPossibilities[x][y];
		String numberOfMatches = Integer.toString(result);

		char[] stringMatch = new char[arrPossibilities.length + 1];
		while (x > 0 && y > 0) {
			// If current character  are same, so they are part of the Longest Possibilitie
			if (string1.charAt(x - 1) == string2.charAt(y - 1)) {
				stringMatch[result - 1] = string1.charAt(x - 1);

				x--;
				y--;
				result--;
			}

			else if (arrPossibilities[x - 1][y] > arrPossibilities[x][y - 1])
				x--;
			else
				y--;
		}
		for (int k = 0; k <= result; k++) {
			stringMatch[k] = stringMatch[k];
		}

		String stringMatcher = new String(stringMatch);
		String formatedResult = String.format("The Longest Common Subsequens was : %s , %s times ", stringMatcher.strip().trim(),
				numberOfMatches);
		return formatedResult;
	}

}
