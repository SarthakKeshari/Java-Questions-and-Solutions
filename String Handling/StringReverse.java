// Write a java program to reverse the string without using the inbuilt function.

import java.util.Scanner;

class StringReverse {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine();
		System.out.println("-----------------------");
		System.out.println("Sting Before Reversing:");
		System.out.println(str);
		
//		 Converting the string into character array
		char arr1[] = str.toCharArray();
		
//		 Creating the new array to store the character while reversing
		char arr2[] = new char[arr1.length];

//		 The j value will be used to start storing the character from last index in arr2
		int j = arr2.length - 1;
		
//		 Using for loop to traverse through the arr1
//		 In each iteration the character in arr1 is stored in the arr2 from last index in each iteration the j value decrements  
		for (int i = 0; i <= arr1.length-1; i++) {
			arr2[j] = arr1[i];
			j--;
		}
		
//		 Creating the string using the character array arr2
		str = new String(arr2);
		System.out.println("-----------------------");
		System.out.println("String After Reversing:");
		System.out.println(str);
	}
}