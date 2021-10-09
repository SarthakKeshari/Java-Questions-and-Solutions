package Pattern_Printing;

/*
Expected Output=

@@       ##
 @@     ##
  @@   ##
   @@ ##
    @@@
   ## @@
  ##   @@
 ##     @@
##       @@

 */


public class Letter_X {

    public static final String ATS = "@@";
    public static final String HASHS = "##";
    public static final int HEIGHT = 9;

    public static void main(String[] args) {

        for (int i = 0; i < HEIGHT; i++) {
            var out = new StringBuilder();

            //for the top half of the X
            if (i < HEIGHT/2 ){
                //set up middle space
                var centerSpace = 7 - (i * 2);
                //build line
                out.append(" ".repeat( i));
                out.append(ATS);
                out.append(" ".repeat(centerSpace));
                out.append(HASHS);
                //print line
                System.out.println(out);

            //for the bottom half of the X
            }else if (i > HEIGHT/2){
                //set up spacing
                var leadingSpace =  8-i;
                var centerSpace = i*2 - HEIGHT;
                //build output
                out.append(" ".repeat(leadingSpace));
                out.append(HASHS);
                out.append(" ".repeat(centerSpace));
                out.append(ATS);
                //print line
                System.out.println(out);
            }else{
                //center line
                System.out.println("    @@@" );
            }
        }


    }

}
