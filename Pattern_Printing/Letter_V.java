package Pattern_Printing;

public class Letter_V {
    /*
     * Write a program to print letter V exactly as shown below -
     *
     * @@           @@
     *  @@         @@
     *   @@       @@
     *    @@     @@
     *     @@   @@
     *      @@ @@
     *       @@@
     * */
    public static void main(String[] args) {

        /*  Parameters for printing letter .
         *   This will allow the height, line thickness and spacing of the letter to be changed with ease
         */
        int height = 7;
        int lineThickness = 2;
        int baseThickness = 3;
        String character = "@";

        int proceedingSpaces = 0;
        int trailingSpaces = (height * 2) - 3;

//        for each row in the letter from the top to the bottom
        for (int i = height; i > 1; i--) {
//            print the spaces before the @@
            printSpaces(proceedingSpaces);
//            print the @@
            printCharacter(lineThickness, character);
//            print the spaces in between the lines
            printSpaces(trailingSpaces);
//            print the @@
            printCharacter(lineThickness, character);
//            this row of the letter has been printed, take a new line
            newLine();

//            decrease height by one to start printing the next line
            height--;
//            the proceeding spaces increase by 1 for each line
            proceedingSpaces++;
//            the trailing spaces (spaces in between the 2 lines of the character) decrease by 2 for each line
            trailingSpaces -= 2;
        }
//       this concerns the base of the letter (i.e. the @@@ at the bottom )

//        print the spaces to ensure the @@@ is in the middle of the character
        printSpaces(proceedingSpaces);
//        print @@@
        printCharacter(baseThickness, character);
    }

//    prints a new line
    public static void newLine() {
        System.out.println();
    }

// prints a given character (e.g. @ ) a given number of times
    private static void printCharacter(int lineThickness, String character) {
        for (int i = 0; i < lineThickness; i++) {
            System.out.print(character);
        }
    }

//    prints a given number of spaces
    private static void printSpaces(int numberOfSpaces) {
        for (int i = 0; i < numberOfSpaces; i++) {
            System.out.print(' ');
        }
    }
}
