import java.util.Scanner;

/*
Given a number 'n' check if the number is odd or even using bit manipulation.
Idea: If a number is even then its LSB must be unset and if the number is odd its LSB must be set.
We can use bitwise AND with 1 to check this condition.
 */
public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isEven(n)) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }

    static boolean isEven(int n) {
        //If n is even then LSB must be unset(0) therefore bitwise AND with 1 must be 0 as (0 & 1) == 0
        //If If n is odd then LSB must be set(1) therefore bitwise AND with 1 must be 1 as (1 & 1) == 1
        return (n & 1) == 0;
    }
}
