import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.generate;

/**
 * This Program prints the Y letter where only `@` is used for left part and `#` is used for right part.
 *
 * Expected Output:
 * @@        ##
 *  @@      ##
 *   @@    ##
 *    @@  ##
 *     @@##
 *      @@
 *      @@
 *      @@
 *      @@
 */

public class Letter_Y {

    // This method generates an empty string of length x
    private static String generateEmptyStringOfLengthX(int x) {
        return generate(() -> " ").limit(x).collect(joining());
    }

    private static String printY() {
        int leftOffset = 0;
        StringBuilder generateY = new StringBuilder();

        // This loop generates the V shape of Y
        for (int middleOffset = 8; middleOffset >= 0; middleOffset -= 2, leftOffset++) {
            generateY.append(generateEmptyStringOfLengthX(leftOffset) + "@@" + generateEmptyStringOfLengthX(middleOffset) + "##\n");
        }

        // This loop generates the lower part of Y
        for (int i = 0; i < 4; i++) {
            generateY.append(generateEmptyStringOfLengthX(leftOffset) + "@@\n");
        }
        return generateY.toString();
    }

    public static void main(String[] args) {
        System.out.println(printY());
    }
}
