//A program to swap two numbers without using another variable.
import java.io.*;
class swap2
{
    void swap(int x, int y)
    {
        if(x>=0 && y>=0) //If the numbers are both positive..
        {
            x=x+y;
            y=x-y;
            x=x-y;
        }
        else //if any of the number is negative or both are negative..
        {
            x=x+y;
            y=y-x;
            x=x+y;
            y=-y;
        }
        System.out.println("After swap \n"+"x= "+x+"\ny= "+y);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader inp=new InputStreamReader(System.in);  
        BufferedReader br=new BufferedReader(inp);
        int x=Integer.parseInt(br.readLine());  // Accepting the numbers and storing them
        int y=Integer.parseInt(br.readLine());
        System.out.println("Before swap \n"+"x= "+x+"\ny= "+y);
        swap2 obj=new swap2();
        obj.swap(x,y);
    }
}
