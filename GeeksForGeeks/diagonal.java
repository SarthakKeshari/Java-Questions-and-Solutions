/* Given a 2D matrix, print all elements of the given matrix in diagonal order.
For example, consider the following 5 X 4 input matrix.
Example:

1   2   3   4
5   6   7   8
9  10  11  12
13 14  15  16
17 18  19  20

Diagonal printing of the above matrix is

1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20 */

import java.io.*;
class diagonal
{
    int [][]a;
    int p,q;
    diagonal() // A constructor
    {
        p=0;
        q=0;
    }
    void input ()throws IOException  // A method to input the array order and elements.
    {    InputStreamReader inp=new InputStreamReader(System.in); 
         BufferedReader br=new BufferedReader(inp);
         System.out.println("Enter the matrix order of the matrix");
         p=Integer.parseInt(br.readLine());
         q=Integer.parseInt(br.readLine());
         a=new int[p][q]; // creating a 2D array.
        System.out.println("now enter the matrix elements");
        for(int i=0;i<p;i++)
         {
            for(int j=0;j<q;j++)
            { a[i][j]=Integer.parseInt(br.readLine()); }
           }
          System.out.println("the matrix elements are"); 
         for(int i=0;i<p;i++)
         {
            for(int j=0;j<q;j++)
            { System.out.print(a[i][j]+"\t");}
            System.out.println("\n");
          }
        }
    void logic() // A method to print the diagonal elements..
    {
        System.out.println("The diagonal elements of the matrix are");
      for(int i=0;i<p;i++)
      {    int j=i;
          for(int x=0;x<=i && x<q;x++,j--)
          {
             System.out.print(a[j][x]+"\t");
            }
         System.out.println();
    }
     for( int i=1;i<q;i++)
     {
         int j=p-1;
       for(int x=i;x<q;x++,j--)
          {
           System.out.print(a[j][x]+"\t");
            }
            System.out.println();
    }
}
public static void main(String[] args)throws IOException
 {  
    diagonal obj= new diagonal();
    obj.input();
    obj.logic();
 }
}
