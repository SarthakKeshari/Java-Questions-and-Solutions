import java.util.Scanner;

/**
 * Write a program that reads an array of ints and outputs the maximum product of two adjacent elements 
 * in the given array of numbers.
 */

public class Maximum_Product_Adjacent_Elements {
    public static void main(String[] args) {

        // Read elements and size
        Scanner scanner = new Scanner(System.in);
        int tam = scanner.nextInt();
        int[] numbers = new int[tam];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calling the method and 
        int max = getMaxProductAdjacentElements(numbers);

        // Print the value
        System.out.println("The maximum product: "  + max);

        scanner.close();

    }

    private static int getMaxProductAdjacentElements(int[] numbers) {

        // Check if there is only one element to return the same
        if (numbers.length == 1) return numbers[0];

        // Get the maximum of the first two values
        int max = numbers[0] * numbers[1];

        // Traverse the array and check if each pair of elements is greater than the previous pair and assign to the variable max
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] * numbers[i + 1] > max) {
                max = numbers[i] * numbers[i + 1];
            }
        }

        // Get max value
        return max;
    }
}
