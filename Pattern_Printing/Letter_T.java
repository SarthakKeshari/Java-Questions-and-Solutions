package Pattern_Printing;

// Write a program to print letter T exactly as shown below -

public class Letter_T {
    // Driver code
    public static void main(String[] args) {
        // Number of lines for the Letter
        int height = 7;

        int i, j;
        // Pattern printing
        for (i = 0; i < height; i++) {
            for (j = 0; j < height; j++) {
                if (i == 0)
                    System.out.printf("$$");
                else if (j == height / 2)
                    System.out.printf("@@");
                else
                    System.out.printf("  ");
            }
            System.out.printf("\n");
        }
    }
}

// Output :
/*
$$$$$$$$$$$$$$
      @@
      @@
      @@
      @@
      @@
      @@
      @@
*/