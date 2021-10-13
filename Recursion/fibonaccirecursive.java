import java.util.*;
class fibonaccirecursive
{
    
    public static int fib(int n)
    
    
    {
        if (n==1)
        return 0;
        else if(n==2)
        return 1;
        else if(n>2)
        return fib(n-1)+fib(n-2);
        else
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int term;
        int m=sc.nextInt();
        fibonaccirecursive obj=new fibonaccirecursive();
        for(int i=1;i<=m;i++)
        {
            term=obj.fib(i);
            System.out.println(term+",");
        }
    }
}
