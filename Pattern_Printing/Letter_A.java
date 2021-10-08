package Pattern_Printing;

public class Letter_A {
    /*
     * Write a program to print letter A exactly as shown below -
     *
     *       **
     *     **  **
     *    **    **
     *   **      **
     *  **        **
     *  **########**
     *  **        **
     *  **        **
     *  **        **
     *
     * */

    public static void main(String[] args) {
//        number of spaces to go before the line making up the character
        int beforeSpaces = 5;
//        number of spaces between the lines of the character
        int betweenSpaces = 0;

//        The first 5 lines make up the top part of the A
        for (int i = 0; i < 5; i++) {
//            print the spaces before the line
            printLine(beforeSpaces, ' ');
//            print the line
            printLine(2, '*');
//            after printing the first line, the indentation decreases by 2 spaces
            if (i == 0) {
                beforeSpaces-=2;
            }else{
//            print the spaces before the line
                printLine(betweenSpaces, ' ');
//            print the line
                printLine(2, '*');
//                decrease indentation by 1
                beforeSpaces--;
            }
//            move onto the next line
            printNewLine();

//            in all cases apart from line number 4, the space in between lines should be increased by 2
            if(i != 4){
                betweenSpaces += 2;
            }
        }

//        call the method to print the bottom half of A
        printLowerSection(betweenSpaces);
    }
    // method to print the bottom half of A
    private static void printLowerSection(int betweenSpaces) {

//        this will print **
        printLine(2, '*');
//        this will print ########
        printLine(betweenSpaces, '#');
//        this will print **
        printLine(2, '*');
//        take a new line
        printNewLine();

//      print the final 2 lines of the A
        for (int i = 0; i < 3; i++) {
//            print the line
            printLine(2,'*');
//            print the spaces
            printLine(betweenSpaces, ' ');
//            print the line
            printLine(2,'*');
//            take a new line
            printNewLine();
        }
    }

    //    method to print a new line
    private static void printNewLine() {
        System.out.println();
    }

    //    method to print the given character the given number of times
    private static void printLine(int lineThickness, char character) {
        for (int i = 0; i < lineThickness; i++) {
            System.out.print(character);
        }
    }
}
