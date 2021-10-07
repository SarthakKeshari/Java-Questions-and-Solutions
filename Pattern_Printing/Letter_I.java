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
	public static void printI(int height)
	{   
	    for (int i = 0; i < height; i++)
	    {
	        for (int j = 0; j < height; j++)
	        {
	            if ((i == 0 || i == height - 1) && (j != height-j-1)) {
	                System.out.printf("$");
	            } else if (j == height / 2 || (i == 0 || i == height - 1)) {
	                System.out.printf("##");
	            }
	            else {
	                System.out.printf(" ");
	            }
	        }
	        System.out.printf("\n");
	    }
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please specify the height of the alphabet and keep that integer odd.");
		
		int height = sc.nextInt();
		if(height % 2 == 0) {
			System.out.println("Please specify any odd integer for a better view.");
		} else {
			printI(height);
		}
		
		sc.close();
	}
}
