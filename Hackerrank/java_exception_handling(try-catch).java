/*Exception handling is the process of responding to the occurrence, during computation, of exceptions – anomalous or exceptional conditions requiring special processing – often changing the normal flow of program execution. (Wikipedia)

Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers  and  as input, you have to compute . If  and  are not  bit signed integers or if  is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        

    Scanner scan = new Scanner(System.in);
    try {
     //taking 2 numbers inputs
        int x = scan.nextInt();
      int y = scan.nextInt();
        //dividing 2 numbers
      System.out.println(x / y);
    }
     catch(ArithmeticException | InputMismatchException e) {
      if (e instanceof ArithmeticException) {
          //if there is arithmetic exception occured in try block then it will be catched here
        System.out.println("java.lang.ArithmeticException: / by zero");
      } else if (e instanceof InputMismatchException){
        System.out.println("java.util.InputMismatchException");
          //if there is inputmismatch exception occured in try block then it will be catched here
      }
    }
    scan.close();
  }
        

}
