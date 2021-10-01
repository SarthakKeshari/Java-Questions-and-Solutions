import java.util.Scanner;

/**
 * Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order. 
 * Elements of the sequence must go one after another. A single number is assumed to be an ordered sequence with the length = 1.
 */
public class longestAscendingSequence {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tam = scanner.nextInt();
        int[] numbers = new int[tam];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxTmp = 0;
        int count = 1;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                ++count;
            } else {
                if (count > maxTmp) {
                    maxTmp = count;
                }
                count = 1;
            }
        }

        int max = Math.max(count, maxTmp);

        System.out.println(max);

        scanner.close();
    }
    
}