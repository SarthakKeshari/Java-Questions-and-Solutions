import java.util.*;
/**
 * Question:
 * Fibonacci series in Java
 * Program that prints the first N numbers of the Fibonacci series.
 * The first number in the series is 1, the second number is 1, and each of the
 * following is the sum of the previous two.
 */
public class fibonacci{

    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        int number,fibo1,fibo2,i;
  
        do{
            System.out.print("Enter a number greater than 1: ");
            number = sc.nextInt();
        }while(number<=1);
  
        System.out.println("The " + number + " first terms of the Fibonacci series are:");                 

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2;i<=number;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}