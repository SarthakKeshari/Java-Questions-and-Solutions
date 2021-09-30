/* You are in charge of the cake for a child's birthday. You have decided the cake will have one candle
   for each year of their total age. They will only be able to blow out the tallest of the candles.
   Count how many candles are tallest. A Program to input candle heights and print the total number
   of tallest candles present on the cake*/
import java.io.*;
import java.util.Arrays;
class birthday
 {
    int candle_count(int [] a, int x) //a method to sort and calculate the number of candles.
    {
         Arrays.sort(a); //to sort the elements in ascending order
         int c=0;
         int lst= a[x-1];
         for(int i=x-1;i>=0;i--)
         {
            if(a[i]==lst)
            {c++;}
         }
         return c;
    }
    public static void main() throws IOException
        {
         int ln; //a variable of integer type to store the length of array(i,e number of candles)
         InputStreamReader inp=new InputStreamReader(System.in);  
         BufferedReader br=new BufferedReader(inp); 
         ln=Integer.parseInt(br.readLine());
         int [] cdl=new int[ln]; //an array to store the candles height
         for(int i=0;i<ln;i++)
         {
             cdl[i]=Integer.parseInt(br.readLine());
             if(cdl[i]==0) //this will ensure that the input is not 0
             i=i-1;
         }
         birthday obj= new birthday();
         System.out.println(obj.candle_count(cdl,ln));
       }
 }