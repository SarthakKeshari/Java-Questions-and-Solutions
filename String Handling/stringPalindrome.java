//Created a program to check whether given string is palindrome or not.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		int l=s.length();
		int temp=0;
		for(int i=0,j=l-1;i<=j;i++,j--) //Traverse string from start and end
		{
		    if(s.charAt(i)!=s.charAt(j)) //Check Each Character From start and end
		    {
		        System.out.println("Not Palindrome"); //if condition fails it displays not palindrome
		        temp=1;
		        break;
		    }
		}
		if(temp==0) //if abpve condition does not satisfies then print palindrome 
		    System.out.println("Palindrome");
	}
}
