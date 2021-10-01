/** There are N people in the vaccination queue, Chef is standing on the Pth position from the front of the queue. It takes X minutes to vaccinate a child and Y minutes to vaccinate an elderly person. Assume Chef is an elderly person.

You are given a binary array A1,A2,…,AN of length N, where Ai=1 denotes there is an elderly person standing on the ith position of the queue, Ai=0 denotes there is a child standing on the ith position of the queue. You are also given the three integers P,X,Y. Find the number of minutes after which Chef's vaccination will be completed.

Input Format
First line will contain T, number of testcases. Then the testcases follow.
The first line of each test case contains four space-separated integers N,P,X,Y.
The second line of each test case contains N space-separated integer A1,A2,…,AN.
Output Format
For each testcase, output in a single line the number of minutes after which Chef's vaccination will be completed.**/

import java.util.*;
public class vaccination_queue
{
    public static void main(String args[]) //main function
    {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();           // taking variable t for no. of test cases
        while(t>0)
        {
            int n = in.nextInt();       //n = No.of people
            int p = in.nextInt();       //p = Position of chef from front of the queue
            int x = in.nextInt();       //x = Minutes taken to vaccinate a child
            int y = in.nextInt();       //y = Minutes taken to vaccinate an elder
            int countc =0;              //Counter that counts no of child present ahead of chef. 
            int counta =0;              //Counter that counts no of elder present ahead of chef. 
            int arr[] = new int[n];     //Array to store the position of people statnding in line.
            //Loop For storing position of people where 1 stands for elder person and 0 stands for child.
            for(int i =0;i<n;i++)       
            {
                arr[i] = in.nextInt();
            }
            //Loop to count all the children and elder person ahead of chef including the chef 
            for(int j =0;j<p;j++)
            {
                if(arr[j]==0) //checking if the person is child then incrementing the counter
                {
                    countc++;
                }
                if(arr[j]==1) //checking if the person is elder then incrementing the counter
                {
                    counta++;
                }
                
            }
            int tmin = (countc*x)+(counta*y); //Calculating the total time taken by multiplying with the x and y given.
            System.out.println(tmin); //printing the result
            
            
            
         t--;  //decrementing the value after running a testcase. 
        }
    }
}