//Given a positive integer n, find the smallest integer which has exactly 
//the same digits existing in the integer n and is greater in value than n. 
//If no such positive integer exists, return -1.

//Note that the returned integer should fit in 32-bit integer,
//if there is a valid answer but it does not fit in 32-bit integer, return -1.

//Example 1:

//Input: n = 12
//Output: 21

//Example 2:

//Input: n = 21
//Output: -1

import java.util.Scanner;

public class NextGreaterElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long ans = nextGreaterElement(n);
		System.out.println(ans);
	}

	private static long nextGreaterElement(int n) {
//		convert interger to string and than string to character array
		char arr[] = (Integer.toString(n)).toCharArray();
		
//		firstly find first lower element from left
		int i = arr.length-2;
		while(i>=0 && arr[i]>=arr[i+1])
			i--;
//		according top test case returning the -1
		if(i==-1)
			return -1;
		
		int k = arr.length-1;
		while(arr[i]>=arr[k]) 
			k--;
//		swap the values of ith and kth
		  char temp = arr[i];
	        arr[i] = arr[k];
	        arr[k] = temp;
		
//	      Storing the values of 0 to i in res
	      String res = "";
	      for(int j=0;j<=i;j++) 
	    	  res+=arr[j];
//		  for nearest greater integer store it in the reverse order 
	      for(int j=arr.length-1;j>i;j--)
	    	  res+=arr[j];
	      
	      
//	      typecast to Long
	      long ans = Long.parseLong(res);  
	      if(ans<=2147483647)
		      return (int) ans; 
	        else
	            return -1;
	      
	}

}
