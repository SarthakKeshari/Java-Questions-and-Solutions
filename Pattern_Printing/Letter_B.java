package Pattern_Printing;

// Write a program to print letter B exactly as shown below -

public class Letter_B {
    // Driver code
    public static void main(String[] args) {
        // Number of lines for the Letter
        int height = 7;

        for (int i=0;i<height ;i++ )
        {
            for (int j=0;j<=height/2 ;j++ )
            {
                // for vertical line of letter B
                if (j==0)
                {
                    System.out.print("**");
                } // for all the curved strokes of letter B 
                else  if (i==0&&j!=height/2||j==height/2&&i!=0&&i!=height/2&&i!=height-1||i==height/2&&j!=height/2||i==height-1&&j!=height/2) {
                    System.out.print("##");
                } // for empty spaces 
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

// Output :
/*

 **####
 **    ##
 **    ##
 **####
 **    ##
 **    ##
 **####

 */
