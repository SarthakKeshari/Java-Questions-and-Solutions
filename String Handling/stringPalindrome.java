import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		int l=s.length();
		int temp=0;
		for(int i=0,j=l-1;i<=j;i++,j--)
		{
		    if(s.charAt(i)!=s.charAt(j))
		    {
		        System.out.println("Not Palindrome");
		        temp=1;
		        break;
		    }
		}
		if(temp==0)
		    System.out.println("Palindrome");
	}
}
