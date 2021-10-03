//Performing Linear search of any number entered by user in an Array
import java.util.Scanner;
public class linearSearch {

	public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in);
		 int num[];
		 int i;
		 int search;			 
//(optional) count is required to print how many times an element occurs in an array
		 int count=0;	
		 
		// Declaring array of n numbers
		 System.out.println("enter number of elements in array :");
		 int n = reader.nextInt();
		 num = new int[n];
		 
		 //Taking input for elements of array from user
		 System.out.println("Enter elements in array: ");
		 for (i=0;i<n;i++)
		 {
		   num[i] = reader.nextInt();
		        
		 }
		 
		//searching given element in array
		   System.out.println("enter element to be searched ");
		   search = reader.nextInt();		   
		   for(i=0;i<n;i++)
		    {
		        if(num[i]==search)
		        {   
		            System.out.println(search+" is found at index "+(i+1));
		            
		        count++;
		        }
		    } 
		   
		 //if given element is not present in array
		    if (count==0)   
		    {
		    	System.out.println("element not found!");
		    }
		  //optional: to print how many times the searched number occurs in the array
		  else{
		        System.out.println(search+" is occuring "+count+" times");  
		  }
		    
		   
	}
}

