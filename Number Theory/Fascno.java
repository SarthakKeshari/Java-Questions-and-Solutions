//Find given number is Fascinating Number or not

import java.util.*;  
public class Fascno
{  
public static void main(String args[])  
{  
int n1, n2, n3;      
Scanner sc=new Scanner(System.in);  
System.out.print("Enter any Number: ");  
   n1 = sc.nextInt();  
   n2 = n1 * 2;  
   n3 = n1 * 3;  //concatenating n1, n2, and n3 user input 
 
String concatstr = n1 + "" + n2 + n3;  
boolean found = true;  

for(char c = '1'; c <= '9'; c++)  //checks all digits from 1 to 9 are present or not  
{  
int count = 0;  

for(int i = 0; i < concatstr.length(); i++)  //loop counts the frequency of each digit  
{  
char ch = concatstr.charAt(i);  
 
if(ch == c)  
 
count++;  
}                                         //returns true if any of the condition returns true  

if(count > 1 || count == 0)  
{  
found = false;  
break;  
}  
}  
if(found)  
System.out.println(n1 + " is a fascinating number.");  
else  
System.out.println(n1 + " is not a fascinating number.");  
}  
}  

//by Dinesh