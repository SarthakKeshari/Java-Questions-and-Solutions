/*

Write a program to print letter H exactly as shown below -

    ##       ##
    ##       ##
    ##       ##
    ##       ##
    ## $ $ $ ##
    ##       ##
    ##       ##
    ##       ##
    ##       ##

*/

import java.util.*;

public class Letter_H{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();

    }

    static void printPattern(int N){
 
        // Declaring the values of left,
        // middle, right side
        String left = "##", middle = "$", right = "##";
    
        // Main Row Loop
        for (int row = 0; row < 2 * N - 1; row++) {
    
            // Condition for the left Values
            if (row < N)
                System.out.print(left);
            else
                System.out.print(left);
    
            // Loop for the middle values
            for (int col = 1; col < N - 1; col++) {
    
                // Condition for the middleValues
                if (row != N - 1)
    
                // Two spaces for perfect alignment
                System.out.print("  ");
                        
                else
                    System.out.print(" " +middle);
            }
    
            // Condition for the right Values
            if (row < N)
                System.out.print(" "  + right);
            else
                System.out.print(" " + right);
            System.out.println();
        }

    }
}