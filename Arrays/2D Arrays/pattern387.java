import java.util.*;
class pattern387
{
    public static void main()
    {
        int sp=0;
        int sp2=11;
        int h=13;
        int k=14;
        int sp3=1;
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            sp++;
            System.out.print(i);
            if(i!=7)
            {
                for(int j=1;j<=sp2;j++)
                {
                    System.out.print(" ");
                }
                sp2=sp2-2;
                System.out.print(h);
                h--;
            }
            if(i>=2 && i<=4)
            {
                for(int j=1;j<=sp3;j++)
                {
                    System.out.print(" ");
                }
                sp3=sp3+2;
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}