//Write a program to check if a number is Emirp or not
import java.util.*;

class Emirp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");     // Input number from the user
        int n = sc.nextInt();
        int r = 0;
        boolean prime = true;
        boolean emirp = true;
        for (int x = 2; x < n; x++) {             // to check whether the number is prime or not
            if (n % x == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            for (int x = n; x != 0; x /= 10) {    // to reverse the number inputted
                int d = x % 10;
                r = r * 10 + d;
            }
            for (int x = 2; x < n; x++) {         // to check the reversed number for being prime or not
                if (r % x == 0) {
                    emirp = false;
                    break;
                }
            }
            if(emirp){
                System.out.println(n+" is an Emirp Number");
            }
            else{
                System.out.println(n+" is not an Emirp Number");
            }
        }
        else{
            System.out.println(n+" is not a Prime number and hence cannot be an Emirp Number");
        }
    }
}