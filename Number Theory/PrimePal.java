import java.io.*;
import java.util.*;
public class PrimePal
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int nm,pn,rev,s=0,i,c=0;
        System.out.println("Enter No.");
        nm= in.nextInt(); // User input
        pn=nm; // store the entered number in "pn" variable
        for(i=1;i<=pn;i++)
        {
            if(pn%i==0)
            {
                c++;
            }
        }
        while(nm>0)
        {
            rev=nm%10; // extract last digit of the number
            s=s*10+rev; // store the digit last digit
            nm=nm/10; // extract all digit except the last
        }
        if(pn==s&&c==2) // comparing with original number
        {
            System.out.println("Number is PalPrime : "+pn);
        }
        else
        {
            System.out.println("Number is not PalPrime : "+pn);
        }
    } // end of main method
} // end of class
