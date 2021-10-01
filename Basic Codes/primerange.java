import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting and Ending Range Values");
        int s=sc.nextInt();
        int e=sc.nextInt();
        int temp=0;
        System.out.println("Prime numbers are ");
        for(int i=s;i<=e;i++)
        {
            temp=0;
            for(int j=2;j<i/2;j++)
            {
                if(i%j==0)
                {
                    temp=1;
                    break;
                }
            }
            if(temp==0 && i!=1)
                System.out.print(i+" ");
        }
    
	}
}