//Find The All Possible Permutations Of The Given String

import java.util.Scanner;

public class Permutation {
    
    
    
    public static void main (String args[])
    {
        System.out.println("Please enter the string whose permutations we need to show ");
        Scanner in = new Scanner(System.in);
        String original=in.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Results are :");
        System.out.println("");
        System.out.println("");
        permute(original);
    }
    
    
    
    public static   void permute( String input)
    {
        int inputLength = input.length();
        boolean[ ] used = new boolean[ inputLength ];     //check inputlength
        StringBuffer outputString = new StringBuffer();   //Java StringBuffer class is used to create mutable (modifiable) String objects. 
                                                          
        char[ ] in = input.toCharArray( );
        doPermute ( in, outputString, used, inputLength, 0 );
        
    }
    
    public static    void doPermute ( char[ ] in, StringBuffer outputString,   //create doPermute function 
    boolean[ ] used, int inputLength, int level)
    {
        if( level == inputLength) {                       //check condition level of string inputlength 
            System.out.println ( outputString.toString());
            return;
        }
        
        for( int i = 0; i < inputLength; ++i )
        {
            
            if( used[i] ) continue;
            
            outputString.append( in[i] );
            used[i] = true;
            doPermute( in,   outputString, used, inputLength, level + 1 );
            used[i] = false;
            outputString.setLength(   outputString.length() - 1 );
        }
    }
    
}
