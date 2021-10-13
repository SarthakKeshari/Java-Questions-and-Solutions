/**
 * demo
 */
//Logic
//firstly we ascend to 7 starting from 1
//Since we have to keep 1 ad 13 at same line and so on
//so we came up with logic that 13 is actually (2*7-1)
//we also recognized that there is space between 12 and 14 so another loop is there to take care of it.
//lastly we make sure that the printing number shouldnot exceed 16. for which we have to carryout nested if else ladder.
public class Pattern1 {

    public static void main(String[] args) {
        int count = 0;
        int ascendingStop=7;
        int finalStop=16;
        int valueStored = 2 * ascendingStop - 1;
        for (int i = 1; i <= ascendingStop; i++) {
            int x = 0;

            //This while loop is used to print space before 1 to 7
            while (x < count) {
                System.out.print(" ");
                x += 1;
            }
            System.out.print(i);//This line is use to print actual number 1 to 7
            count += 1;
            x = 0; //Here any variable can be taken 

            //This line is use to print the space between ascending numbers 1 to 7 and descending number 13 to 8.
            while (x < ascendingStop * 2 - 2 * i) {
                System.out.print(" ");
                x += 1;
            }
            x = 2 * ascendingStop - i;
            //
            if (i < ascendingStop && x <= finalStop) {
                System.out.print(x); //This line used to print number 13 to 8
            }
            int z = x;
            //This loopis used t print space between 12-14,11-15,10-16.
            while (x - count < valueStored) {
                System.out.print(" ");
                x += 1;
            }
            if (z < valueStored) {
                if (valueStored + count - 1 <= finalStop)
                    System.out.println(x + i - count - 1); //This line print 14,15,16.
                else
                    System.out.println();
            } else
                System.out.println();
    }
 }
}