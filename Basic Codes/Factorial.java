import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
      System.out.print("Enter number : ");

      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int ans = factorialRecursion(num);
      System.out.print(num+"! = " +ans);

    }
    static int factorialRecursion(int i){
        if(i==1)
            return 1;

        return i*factorialRecursion(i-1);
    }
}