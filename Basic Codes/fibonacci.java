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

        //A scanner that reads the data entered by keyboard
        Scanner sc = new Scanner(System.in);

        //Variables we work with
        int number,fibo1,fibo2,i;
  
        do{
            System.out.print("Enter a number greater than 1: ");//Ask for a number greater than 1
            number = sc.nextInt();//We store that number in the variable 'number'
        }while(number<=1);//Repeats the loop if the stored number is less than or equal to 1
  
        System.out.println("The " + number + " first terms of the Fibonacci series are:");                 

        //We give start value to variables
        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        //We apply the fibonacci formula until 'i' is less than the 'number' entered
        for(i=2;i<=number;i++){
            System.out.print(fibo2 + " ");
            //Fibonacci sequence formula -> x=(x–2)+(x-1)
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}