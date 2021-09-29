// Write a program to swap two numbers (with the help of third variable).
import java.util.Scanner;

class Swapnum
{
   public static void main(String args[])
   {
      int num1, num2, temp; //create temp variable for storing value
      System.out.println("Enter number1 and number2");
      Scanner in = new Scanner(System.in);
 
      num1 = in.nextInt();
      num2 = in.nextInt();
 
      System.out.println("Before Swapping\nnum1 = "+num1+"\nnum2 = "+num2); //before swap 
 
      temp = num1; //temp assign to num1
      num1 = num2;
      num2 = temp;
 
      System.out.println("After Swapping\nnum1 = "+num1+"\nnum2 = "+num2);
   }
}
