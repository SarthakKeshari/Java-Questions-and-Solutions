/* "In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source.
The challenge here is to read lines of input until you reach EOF, then number and print all lines of content.

Input Format
Read some unknown lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
Output Format
For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.

Sample Output
1 Hello world
2 I am a file
3 Read me until end-of-file. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;                       //The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.

public class End_of_file_solution {    

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);     //creating new scanner object for taking input from user
        int i = 0;
        while (sc.hasNextLine()) {              //checking for the next input token until the loop ends
            System.out.printf("%d %s\n",++i,sc.nextLine());         // print the output
        }
    }
}
