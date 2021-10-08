package Pattern_Printing;

/*

Expected output =

##@@@
##   @@@
##      @@@
##   @@@
##@@@
## @@
##  @@
##   @@
##    @@


 */

public class Letter_R {

    public static void main(String[] args) {
        //prints at the start of each line
        final String HASH = "##";
        //for upper half of the R
        final String THREE_ATS = "@@@";
        //for the lower half of the r
        final String TWO_ATS = "@@";


        var tabs = "   ";
        var spaces = new StringBuilder(" ");

        //Loop through upper half of the R
        for (int i = 1; i < 6; i++) {
            System.out.print(HASH);
            //determines if any indentation is necessary
            if (i % 2 == 0) {
                System.out.print(tabs);
            } else if (i == 3) {
                System.out.print(tabs+tabs);
            }
            //prints the ascii for the R
            System.out.print(THREE_ATS + "\n");
        }

        //loop through lower half of the R
        for (int i = 0; i < 4; i++) {
            System.out.print(HASH);
            System.out.print(spaces + TWO_ATS + "\n");
            //increases the space with each iteration of loop
            spaces.append(" ");
        }
    }
}