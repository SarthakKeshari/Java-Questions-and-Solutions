//Write a program to check if a number is Keprekar or not
import java.util.*;
class Keprekar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");   //Input number from the user
        int n=sc.nextInt();

        String s=String.valueOf(n);
        int l=s.length();
        int sq=n*n;
        int sum=(sq/(int)(Math.pow(10,l)))+(sq%(int)(Math.pow(10,l)));    // Find the sum of the two divided parts of the number
        if(sum==n){                                                       // Compare whether the sum is equal to the number or not
            System.out.println(n+" is a Keprekar Number");
        }
        else{
            System.out.println(n+" is not a Keprekar Number");
        }
    }
}