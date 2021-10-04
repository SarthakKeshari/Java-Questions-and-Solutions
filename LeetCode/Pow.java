//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
//example input 2 2
//output = 4

//exmple input 2 10
//output = 1024



import java.util.*;
public class POW { 
    static int pwr(int x, int n) 
    { 
      //if power is zero return 1
        if (n == 0) 
            return 1; 
        else if (n % 2 == 0) 
          // lwt if x = 2 & n = 8 which is divisible by 2 -  returns 2^4 * 2^4 = 2^8
            return pwr(x, n / 2) * pwr(x, n / 2); 
        else
            return x * pwr(x, n / 2) * pwr(x, n / 2);
      //if n = 7 returns 2*(2^3 * 2^3) = 2^7
    } 
  
    public static void main(String[] args) 
    { 
      //take input  x,n
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int n = sc.nextInt();
	
        System.out.printf("%d", pwr(x, n)); 
    } 
} 
