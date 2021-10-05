import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class End_of_file_solution {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);  
        int i = 0;
        while (sc.hasNextLine()) {
            System.out.printf("%d %s\n",++i,sc.nextLine());
        }
    }
}
