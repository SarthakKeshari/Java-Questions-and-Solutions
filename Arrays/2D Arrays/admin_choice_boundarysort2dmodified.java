/*
Enter your question -
Create a program to sort a 2 Dimensional Matrix according to given -

Condition -
First sort(decreasing order) the elements column-wise then sort(decreasing order) the matrix row-wise.
If the initail matrix contains a 0 then the row and column containing 0 should be sorted in increasing order.
Let's see an example -
Input -
Rows: 4
Columns: 4
1 5 3 6
6 4 7 0
4 7 0 5
1 2 4 1

Output -
7 6 0 0
1 3 4 5
1 4 4 5
7 6 2 1

Explaination -
First step -> we will sort column-wise:
6 7 0 0
4 5 3 1
1 4 4 5
1 2 7 6
(Since column -> 2 and 3 were containing 0 in initial matrix so they were sorted in increasing order)

Second step -> we will sort row-wise
7 6 0 0
1 3 4 5
1 4 4 5
7 6 2 1
(Since row -> 1 and 2 were containing 0 in initial matrix so they were sorted in increasing order)
*/
import java.util.*;
class admin_choice_boundarysort2dmodified
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows:");
        int r=sc.nextInt();//Input number of rows
        System.out.print("Coloumns:");
        int c=sc.nextInt();//Input number of coloumns
        int ar[][]= new int[r][c];//initialzed a 2d array with dimensions r and c
        int br[][]=new int[r][c];//initialzed another 2d array with dimensions r and c
        int f=0;//variable for checking if zero is present for the respective coloumns
        int h=0;//variable for checking if zero is present for the respective rows
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++)//Entering the values one by one into the matrix row-wise 
        {
            for(int j=0;j<c;j++)
            {
                ar[i][j]=sc.nextInt();
                br[i][j]=ar[i][j];//store the values in the same position in the array br[][]
            }
        }
        System.out.println("The Original Matrix : ");
        for(int i=0;i<r;i++)//print the original matrix
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //sorting coloumn-wise begins
        for(int k=0;k<c;k++)//outer loop till total number of coloumns
        {
            f=0;//for each coloumn respectively f gets initiazed to zero before checking for zeros in that coloumn
            for(int i=0;i<r;i++)//loop to check if zero is present for each coloum respectively
            {
                if(ar[i][k]==0)//f becomes 1 if zero is found the respective coloumn 
                {
                    f=1;
                }
            }
            if(f!=1)//if zero is not found sort in descending 
            {
                //sorting in descending order
                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<r-i-1;j++)
                    {
                        if(ar[j][k]<ar[j+1][k])
                        {
                            int temp=ar[j][k];
                            ar[j][k]=ar[j+1][k];
                            ar[j+1][k]=temp;
                        }
                    }
                }
            }
            else if(f==1)//if zero is found sort in ascending order
            {
                //sorting in ascending order
                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<r-i-1;j++)
                    {
                        if(ar[j][k]>ar[j+1][k])
                        {
                            int temp=ar[j][k];
                            ar[j][k]=ar[j+1][k];
                            ar[j+1][k]=temp;
                        }
                    }
                }
            }
        }
        //sorting row-wise begins
        for(int k=0;k<r;k++)//outer loop till total number of rows
        {
            h=0;//for each row respectively h gets initiazed to zero before checking for zeros in that row
            for(int i=0;i<c;i++)
            {
                if(br[k][i]==0)//h becomes 1 if zero is found the respective row of the original matrix stored in br[][]
                {
                    h=1;
                }
            }
            if(h!=1)//if zero is not found sort in descending 
            {
                //sorting in descending order
                for(int i=0;i<c;i++)
                {
                    for(int j=0;j<c-i-1;j++)
                    {
                        if(ar[k][j]<ar[k][j+1])
                        {
                            int temp=ar[k][j];
                            ar[k][j]=ar[k][j+1];
                            ar[k][j+1]=temp;
                        }
                    }
                }
            }
            else if(h==1)//if zero is found sort in ascending order
            {
                //sorting in ascending order
                for(int i=0;i<c;i++)
                {
                    for(int j=0;j<c-i-1;j++)
                    {
                        if(ar[k][j]>ar[k][j+1])
                        {
                            int temp=ar[k][j];
                            ar[k][j]=ar[k][j+1];
                            ar[k][j+1]=temp;
                        }
                    }
                }
            }
        }
        //printing the final sorted matrix
        System.out.println("The Sorted Matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}