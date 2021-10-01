/*
Given a number print its Binary Representation using Bit Manipulation
Examples:

Input: 2
Output: 10

Input: 64
Output: 1000000
 */
 
import java.util.Scanner;

public class PrintBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        printBinary(num);
    }

    public static void printBinary(int num) {

        if (num == 0) {
            System.out.print(0);
            return;
        }

        //Number of bits needed to represent a number in Binary
        int bits = (int) (Math.log(num) / Math.log(2)) + 1;

        for (int i = bits - 1; i >= 0; --i) {
            //ith bit is set
            if ((num & (1 << i)) != 0) {
                System.out.print("1");
            }
            //ith bit is not set
            else {
                System.out.print("0");
            }
        }
    }
}

