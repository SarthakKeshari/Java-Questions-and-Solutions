//java program to check whether a number is "palindrome" or not using "recursion" technique.

import java.util.*;
class palindromerecurse
{
    static int rev(int n,int temp)
    {
        if(n==0)
        return temp;
        temp=(temp*10)+n%10;
        return rev(n/10,temp);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int revnum=rev(n,0);
        if(revnum==n)
        System.out.println("palindrome");
        else
        System.out.println("not palindrome");
    }
}
