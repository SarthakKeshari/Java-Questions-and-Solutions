//Write a program to check if a number is Special or not
import java.util.Scanner;
 
public class SpecialNo {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int  num, digit, sum=0, temp;
    
    
    System.out.println("Enter any number"); // Input the number from user
    num = in.nextInt();
    temp = num;

   
    while(temp != 0){
      digit = temp%10;            //Find the factorial of its digits.
      sum += factorial(digit);    // Add all the factorial.
      temp = temp/10;
    }
    
    
    if(sum == num)                //Check if the computed sum is equal to the original number.
      System.out.println("Given number is Special Number");
    else
      System.out.println("Not a Special Number");
 
  }
    
  
  private static int factorial(int n){  //function to compute the factorial of the digits
    int f=1;
    for(int i=2; i<=n; i++){ 
      f = f*i;                    
    }
    return f;
  }
}
