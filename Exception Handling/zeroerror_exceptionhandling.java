///zeroerror_exceptionhandling

import java.util.*;  
///handling exception of dividing a number by zero
public class MyClass {
    
	static int Dividebyzero(int x) {
		///dividing the given x value by zero
		int value =0;
		
		try
		{
		value = x / 0;  //provoking the error
		}
		catch(NumberFormatException knownerror)
		{
		System.out.println(knownerror.getMessage()); // identifying the error
		}
		
		return value;
	}
	
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the number - "); // printing statement to recieve an input  
        
        
        int x = sc.nextInt();  //getting an input and assigned it to x
        
      try
		{
			int value = Dividebyzero(x); // dividing x by zero
		
		}
		catch(ArithmeticException errormessage)
		{
			System.out.println("Error is " + errormessage.getMessage()); /// getting the error and printing it
		}

    }
    
    
}
