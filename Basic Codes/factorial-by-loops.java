//Question: You have to make an algorithm to find factorial of a given number;

//factorial of n is n*(n-1)*.....*2*1;
package com.company;

import java.util.Scanner;

public class Factorial {
    public Factorial() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("you want factorial of which number");
        
       //input of given number
        int n = in.nextInt();
        int fact = 1;
        for(int i = n; 1 <= i; --i) {
            fact *= i;
        }

        System.out.println("the factorial of " + n + " is " + fact);
    }
}
