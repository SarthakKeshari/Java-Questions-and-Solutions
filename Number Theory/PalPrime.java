//Write a program to check a number for palindrome prime.
public class PalPrime
{     
    static boolean isPalPrime(int num)
    {  
        int d = 1;                       /// Find the appropriate d (divisor)
        while (num / d >= 10)
            d *= 10;
      
        while (num != 0)
        {
            int leading = num / d;
            int trailing = num % 10;
      
            if (leading != trailing) // If first and last digit
                return false;        // not same return false
      
            
            num = (num % d) / 10;    // number find from digit
      
           
            d = d / 100;             // Reducing divisor 
            
        }
        return true;
    }
      
    public static void main(String args[])
    {
        if(isPalPrime(16461))
            System.out.println("Yes, Number is Palindrome");
        else
            System.out.println("No, Number is not Palindrome");
    }
}
