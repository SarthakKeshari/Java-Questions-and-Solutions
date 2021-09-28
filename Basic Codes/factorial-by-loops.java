package com.company;

import java.util.Scanner;

public class Factorial {
    public Factorial() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("you want factorial of which number");
        int n = in.nextInt();
        int fact = 1;

        for(int i = n; 1 <= i; --i) {
            fact *= i;
        }

        System.out.println("the factorial of " + n + " is " + fact);
    }
}
