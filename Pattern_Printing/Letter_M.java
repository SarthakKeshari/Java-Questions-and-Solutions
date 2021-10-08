package Pattern_Printing;

public class Letter_M {
    /*
Expected output=

    ##@@       @@##
    ## @@    @@  ##
    ##  @@  @@   ##
    ##    ##     ##
    ##           ##
    ##           ##
    ##           ##


 */

    //setting up globals
    public static final String HASH = "##";
    public static final String ATS = "@@";
    public static final String WIDE_SPACE = "            ";

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            if (i < 4){
                //top half
                System.out.print(HASH);
                getSpacing(i);
                System.out.print(HASH + "\n");
            }else if(i == 4 ){
                //middle bit
                System.out.print(HASH + "     "+ HASH + "     " + HASH + "\n");
            }
            else{
                //bottom half
                System.out.print(HASH + WIDE_SPACE + HASH +"\n");

            }

        }
    }

    public static void getSpacing(int leadingSpaces){
        //the gap in the middle
        var centreSpaces = 8 - (leadingSpaces * 2);
        var out = new StringBuilder();
        //create n many spaces before the "@@"s
        out.append(" ".repeat(Math.max(0, leadingSpaces)));
        out.append(ATS);
        //create n many spaces in between the "@@"s
        out.append(" ".repeat(Math.max(0, centreSpaces)));
        out.append(ATS);
        //create n many spaces after the "@@"s
        out.append(" ".repeat(Math.max(0, leadingSpaces)));
        //outputs.
        System.out.print(out);


    }
}
