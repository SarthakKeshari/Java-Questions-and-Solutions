package Pattern_Printing;

import java.util.HashMap;
import java.util.Map;

/*
We are given a string, in the string, we need to find out, what is
the biggest substring containing distinct characters.
Example: abcddrghh - Here abcd or drgh are two substrings,
containing 4 distinct characters each of length 4.
 */
public class LongestSubstringWithDistinctCharacters {
    public static void main(String[] args) {
        // biggest substring is acdef - length 5.
        System.out.println(findMaxSubstringLength("abcaacdef"));
        // biggest substring is abc / bca - length 3.
        System.out.println(findMaxSubstringLength("abcaaa"));
        // biggest substring is klm - length 3.
        System.out.println(findMaxSubstringLength("klmmma"));
    }

    /**
     * Method to find biggest distinct character substring length.
     * @param str
     * @return
     */
    private static int findMaxSubstringLength(String str) {
        // variable to track biggest substring length.
        int maxLength = 0;
        //  we initially consider window start to be 0;
        int windowStartIdx = 0;
        // map to store latest index of characters, this tell us
        // if any character of string already appeared.
        Map<Character, Integer> charIndexStore = new HashMap<>();
        // window end is always beginning as well, windowEnd expands, as
        // we progress.
        for (int windowEndIdx = 0; windowEndIdx < str.length(); windowEndIdx++) {
            // this is the current char, we have to understand, if this char can
            // be part of distinct characters substring.
            char charToConsider = str.charAt(windowEndIdx);
            if (charIndexStore.containsKey(charToConsider)) {
                // this means character is already there in map, from previous
                // iteration, we need to change window size.
                // we need to pick either windowStartIdx or charToConsider index + 1
                // as window start
                // this is because, charToConsider index + 1 is next sliding window
                // in which, we have charToConsider again.
                windowStartIdx = Math.max(windowStartIdx, charIndexStore.get(charToConsider) + 1);
            }
            // we store the index of char in indexstore map.
            charIndexStore.put(charToConsider, windowEndIdx);
            // our max length is either itself or window length.
            maxLength = Math.max(maxLength, windowEndIdx - windowStartIdx + 1);
        }
        return maxLength;
    }
}
