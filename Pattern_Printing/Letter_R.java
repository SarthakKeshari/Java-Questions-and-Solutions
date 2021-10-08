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
        final String HASH = "##";
        final String THREE_ATS = "@@@";
        final String TWO_ATS = "@@";

        var tabs = "   ";
        var spaces = new StringBuilder(" ");

        for (int i = 1; i < 6; i++) {
            System.out.print(HASH);

            if (i % 2 == 0) {
                System.out.print(tabs);
            } else if (i == 3) {
                System.out.print(tabs);
                System.out.print(tabs);
            }
            System.out.print(THREE_ATS + "\n");
        }

        for (int i = 0; i < 4; i++){
            System.out.print(HASH);
            System.out.print(spaces + TWO_ATS + "\n");
            spaces.append(" ");
        }
    }
}
