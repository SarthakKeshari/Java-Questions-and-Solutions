package pattern_program;

/*
Write a program to print letter H exactly as shown below -

	$$$$$##$$$$$
	     ##     
   	     ##     
   	     ##     
   	     ##     
   	     ##     
   	     ##     
   	     ##   
   	     ##   
   	     ##     
	$$$$$##$$$$$
*/


import java.util.Scanner;

public class Letter_I {
	
	// main logic
	public static void printI(int patternHeight)
	{   
		
	    for (int i = 0; i < patternHeight; i++)
	    {
	        for (int j = 0; j < patternHeight; j++)
	        {
				//condition for first and last line of the pattern
				//also middle of the line
	            if ((i == 0 || i == patternHeight - 1) && (j != patternHeight-j-1)) {
	                System.out.printf("$");
	            } else if (j == patternHeight / 2 || (i == 0 || i == patternHeight - 1)) {
	                System.out.printf("##");
	            }
	            else {
					//spacing for perfect alignment
	                System.out.printf(" ");
	            }
	        }
			//shifting to new line after filling the current line pattern
	        System.out.printf("\n");
	    }
	}
	
	//main method
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please specify the height of the alphabet and keep that integer odd.");
		
		//taking user input
		int patternHeight = sc.nextInt();
		
		if(height % 2 == 0) {
			System.out.println("Please specify any odd integer for a better view.");
		} else {
			printI(patternHeight);
		}
		
		//closed scanner
		sc.close();
	}
}
