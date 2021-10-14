/*
  1            13
   2         12  14
    3       11    15
     4     10      16  
      5   9
       6 8
        7             
Print the above mentioned pattern using Java Code */
import java.util.*;
class pattern387
{
    public static void main()
    {
        int sp=0;//variable to print required number of spaces while printing values 1 to 7
        int sp2=11;//variable to print required number of spaces while printing values 13 to 8
        int h=13;//variable to print the values from 13 to 8
        int k=14;//variable to print the values from 14 to 16
        int sp3=1;//variable to print required number of spaces while printing values 14 to 16
        for(int i=1;i<=7;i++)//outer loop
        {
            for(int j=1;j<=sp;j++)//first inner loop to print spaces while printing values until 7
            {
                System.out.print(" ");
            }
            sp++;//number of spaces increase while printing values from 1 to 7
            System.out.print(i);
            if(i!=7)//to prevent 7 from getting printed twice
            {
                for(int j=1;j<=sp2;j++)//second inner loop to print spaces ahead of values 13 to 8 from the corresponding values in front of them Ex-b/w 1 and 13, 11 spaces are there
                { 
                    System.out.print(" ");
                }
                sp2=sp2-2;//spaces decrease by 2 as from 1 to 13 spaces b/w values decrease by 2
                System.out.print(h);
                h--;//to print values from 13 to 8
            }
            if(i>=2 && i<=4)//for values 14 to 16
            {
                for(int j=1;j<=sp3;j++)//third inner loop to print spaces ahead of values 14 to 16 from the corresponding values in front of them Ex-b/w 11 and 15, 2 spaces are there
                {
                    System.out.print(" ");
                }
                sp3=sp3+2;//spaces increase by 2 as from 10 to 16(excluding 13) spaces b/w values increase by 2
                System.out.print(k);
                k++;//to print values from 14 to 16
            }
            System.out.println();
        }
    }
}
