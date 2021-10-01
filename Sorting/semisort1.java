 /*
  Write a program to sort half of the array in ascending and second half in descending or vice versa depending on users choice.
  AD - Ascending then descending
  DA - Descending then ascending 
  */
import java.io.*;
import java.util.Arrays;
class semisort1
{
     static void sort(int [] ar,int ln,String styl) //A method to sort array according to the style
     {
        int x;
        int [] tmparr =ar.clone(); //A method to clone an array
        if(ln%2==0)        
        {x=(ln/2)-1; }
        else
        {x=(ln/2);}
        
        Arrays.sort(ar,0,(x+1));          //A method to sort array in ascending order from specified start index(inclusive)
        Arrays.sort(tmparr,(x+1),(ln));   // to end index(exclusive) .   
        if(styl.equals("AD"))
        { 
          int c=ln-1;
          for(int i=(x+1);i<ln;i++)
          {
             ar[i]=tmparr[c];
             c--;
          }
          System.out.println(Arrays.toString(ar));
          
        }
        
        else
        { int c=0;
            for(int i=x;i>=0;i--)
          {
             tmparr[c]=ar[i];
             c++;
          }
          System.out.println(Arrays.toString(tmparr));
        }
     }
     public static void main(String[] args) throws IOException
        {
         
         InputStreamReader inp=new InputStreamReader(System.in);  
         BufferedReader br=new BufferedReader(inp); 
         System.out.print("Enter Sorting style :");
         
         String styl=br.readLine(); //A string to store the style of sorting AD or DA
         
         System.out.print("Enter the length of the array(greater than 1) and elements of the array :");
         int len=Integer.parseInt(br.readLine()); //A string to store length if the array
         
         System.out.println();
         
         int []ar=new int[len];
         for(int i=0;i<len;i++) //Storing the array elements
         {
            ar[i]=Integer.parseInt(br.readLine());
         }
         semisort1 obj= new semisort1(); //Program by LN11211
         obj.sort(ar,len,styl);
        }
}