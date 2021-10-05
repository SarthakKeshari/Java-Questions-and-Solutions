import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * Problem:
 * Given an array of integers of size `n`. Now 2 players are playing a game with this array.
 * They make their turn alternatively and in each turn, they pick a number from either end and add it to their score.
 * If player 1 gets more or equal score than the player 2, player 1 wins otherwise player 2 wins.
 * Both players play the game optimally.
 *
 * Approach: Dynamic Programming
 * As we know both players play optimally,
 * If a player pick an element from either end then next player will also try to maximize the score and will try to minimize other player's score
 * So for subarray `i` and `j`, the recurrence would be,
 *      dp[i][j] = Math.max(
 *                    a[i] + Math.min(dp[i + 1][j - 1], dp[i + 2][j]),
 *                    a[j] + Math.min(dp[i + 1][j - 1], dp[i][j - 2])
 *                  )
 *  and base case would be dp[i][i] = a[i]
 *  Complexity:
 *  Time complexity = O(n * n) // as we have 2 dp states, the complexity is squared
 *  Space complexity = O(n * n) // as we are calculating an answer for each subarray, the complexity is also squared
 */

public class PredictTheWinner {
    private static boolean PredictTheWinner(int[] nums) {
        int totalScore = 0;

        // iterate through all the elements in an array to calculate the total possible score
        for(int i = 0; i < nums.length; i++) {
            totalScore += nums[i];
        }

        // initialize a 2-d dp array to store answers for sub problems
        // if the dp[i][j] is -1, that means we haven't calculated the answer for that particular subarray
        // if not, then we can simply return the value instead of recalculating it again
        int[][] dp = new int[nums.length][nums.length];
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++ ) {
                dp[i][j] = -1;
            }
        }

        // let's find out what is maximum score player 1 can get if plays optimally
        int player1Score = score(nums, 0, nums.length - 1, dp);

        // similarly we can simply subtract it from total possible score to calculate the player 2 score
        int player2Score = totalScore - player1Score;

        // player 1 wins if the score is not lower than player 2 score
        return player1Score >= player2Score;
    }

    private static int score(int[] nums, int i, int j, int[][] dp) {
        if(i > j) return 0;

        // this is the base case and for single element, nums[i] is the only possible score a player can get
        if(i == j) return nums[i];

        // if we have already calculated the score for this subarray, then we don't need to recalculate it
        // and can return the one we stored in the 2d dp array
        if(dp[i][j] != -1) return dp[i][j];

        // here a player can have two choice,
        // 1) player picks the number from left end
        // 2) or player picks the number from right end
        // check above for the detailed explaination about the recurrence
        int selectLeft = nums[i] + Math.min(
                score(nums, i + 2, j, dp),
                score(nums, i + 1, j - 1, dp)
        );

        int selectRight = nums[j] + Math.min(
                score(nums, i, j - 2, dp),
                score(nums, i + 1, j - 1, dp)
        );

        // persist the optimal score in an dp array before returning it
        return dp[i][j] = Math.max(selectLeft, selectRight);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(PredictTheWinner(array));
    }
}
