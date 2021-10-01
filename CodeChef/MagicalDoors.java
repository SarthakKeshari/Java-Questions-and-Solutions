/* Question; 

Chef wants to cross a hallway of N doors. These N doors are represented as a string. Each door is initially either open or close, represented by 1 or 0 respectively. Chef is required to go through all the doors one by one in the order that they appear, starting from the leftmost door and moving only rightwards at each step.

To make the journey easier, Chef has a magic wand, using which Chef can flip the status of all the doors at once. Determine the minimum number of times Chef has to use this wand to cross the hallway of doors.

For example, the doors are 10011. Chef will start from the left and enter the first door. After passing through that door, the magic wand is waved. This flips the string to 01100. Now Chef passes through the next two doors in one go. Again, just before reaching the 4th door, the magic wand is waved. Now that the string is in its original state, Chef passes through the last two doors as well. The minimum number of times the magic wand needed to be used here was 2.
Input Format
First line will contain T, number of testcases. Then the testcases follow.
Each testcase contains of a single string S, representing the doors as given in the problem.
Output Format
For each test case, print a single line containing one integer denoting the minimum number of times the magic wand needs to be used.

Sample Input
3
111
010
10011

Sample Output
0
3
2

*/

//code
/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class MagicalDoors
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0)
        {
                
             StringBuilder str = new StringBuilder(in.next());
             long res = 0;
             if(str.charAt(0) == '0')
             res++;
             for(int i = 1; i<str.length(); i++)
             {
                 if(str.charAt(i) != str.charAt(i-1))
                     res++;
             }
             System.out.println(res);
             t--;
        }     
    }
}
