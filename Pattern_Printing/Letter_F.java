package pattern_program;

/*
Write a program to print letter F exactly as shown below -

##$$$$$$$
##
##
##
##$$$$$$$
##
##
##
##

*/


import java.util.Scanner;

public class Letter_F {
	
	// function to print the letter F
	public static void printLetterF(int letterHeight)
	{
	    for (int row = 0; row < letterHeight; row++)
	    {
	        System.out.print("##");
	        for (int col = 0; col < letterHeight-2; col++)
	        {
		    //condition for first and last line of the pattern
	            if ((row == 0) || (row == letterHeight / 2)) {
	                System.out.print("$");
		    } else {
	                continue;
		    }
	        }
		//shifting to new line after filling the current line pattern
	        System.out.println();
	    }
	}
	
	//main method
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please specify the height of the alphabet and keep that integer odd.");
		
		//taking user input
		int letterHeight = sc.nextInt();
		
		if(letterHeight % 2 == 0) {
			System.out.println("Please specify any odd integer for a better view.");
		} else {
			printLetterF(letterHeight);
		}
		
		//closed scanner
		sc.close();
	}
}
