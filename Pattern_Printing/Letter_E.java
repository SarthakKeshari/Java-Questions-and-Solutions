
/*

##$$$$$$$
##
##
##
##$$$$$$$
##
##
##
##$$$$$$$
 */
public class Letter_E {
    //declaring constants for HASH && DOLLAR
    public static final String HASH = "#";
    public static final String DOLLAR = "$";
    public static void main(String[] args) {
        //calling function printE with  n = 5 as total no of rows in the pattern is 2*n-1 .
        // In this case no of rows is 2*5-1 i.e 9 so n is 5
        printE(5);
    }

    public static void printE(int n){
        //looping over rows from 0 to 2*n-1
        for (int row = 0; row <= 2*n-1; row++) {
            //looping over column from 0 to 2*n-1
            for (int col = 0; col < 2*n-1; col++) {
                //print constant hash in column 0 and column 1 for each row
                if(col ==0 || col ==1) {
                    System.out.print(HASH);
                }
                //print constant dollar in column 2 onwards for rows 0,n-1 and 2*n-1
                if(row == 0|| row ==n-1 || row == 2*n-1){
                    if(col > 1  ){
                        System.out.print(DOLLAR);
                    }
                }
            }
            //Moving to next line after printing each row
            System.out.println();

        }
    }
}
