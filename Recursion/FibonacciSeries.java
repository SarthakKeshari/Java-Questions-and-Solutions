import java.util.Scanner;

public class FibonacciSeries {

    static int number1 = 0;     //  Declaring and initializing the variables
    static int number2 = 1, number3 = 0;

    // Main method
    public static void main(String[] args) {        // Question: Display the fibonacci numbers from 1 to n, where n is
                                                    // limit of the fibonacci series, provided by the user as input
                                                    // Using recursion.
        System.out.println("Enter the limit of fibonacci number");  // Telling the user to enter the limit.

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();        // Taking the input from user

        System.out.print(0 + " ");      // Printing the first number
        System.out.print(1 + "");       // printing second number
        fibonacciNumber(n);             // Function call to print the fibonacci series
    }

    // Method to print fibonacci series (Recursion)
    public static void fibonacciNumber(int n) {

        if(n > 0) {

            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;

            System.out.print(" " + number3);    // Printing the number of fibonacci series one by one.

            fibonacciNumber(n - 1);         // Function call (Recursive call)
        }
    }
}
