import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Problem statement:
 * Given a string 's' of length 'n'. Find the longest palindromic substring.
 * Expected time complexity: O(n*n)
 * Expected space complexity: O(n*n)
 *
 * Approach: Using Dynamic Programming
 * Let's consider string of length 1. which is always a palindrome.
 * and then we can set the state dp[i][i] = true (for all 1 <= i <= n)
 * We can consider this as our base case for the DP recurrence.
 * Also to find out if a substring from index 'i' to 'j' (where i < j) is palindrome or not,
 * we only need check if s[i] == s[j] and dp[i+1][j-1] is true.
 * if above conditions are true then dp[i][j] is also true.
 * We will write our algorithm in bottom-up manner and start building the solution for the whole string.
 */

public class LongestPalindromicSubstring {
    private static String longestPalindrome(String s) {
        int length = s.length();
        if(length == 0) return s;
        boolean[][] dp = new boolean[length][length];

        int ans = 1;
        int from = 0;
        int to = 0;
        for(int i = 0; i < length; i++) {
            dp[i][i] = true;
        }
        for(int i = 0; i < length - 1; i++) {
            dp[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
            if(dp[i][i + 1] && ans == 1) {
                ans = 2;
                from = i;
                to = i + 1;
            }
        }

        for(int i =  3; i <= length; i++) {
            int j = 0;
            int offset = i - 1;
            while(j + offset < length) {
                if(s.charAt(j) == s.charAt(j + offset)) {
                    dp[j][j + offset] = dp[j + 1][j + offset - 1];
                } else {
                    dp[j][j + offset] = false;
                }
                if(dp[j][j + offset] && i > ans) {
                    from = j;
                    to = j + offset;
                }
                j++;
            }
        }
        StringBuilder sub = new StringBuilder();
        for(int i = from; i <= to; i++) {
            sub.append(s.charAt(i));
        }
        return sub.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(longestPalindrome(input));
    }
}
