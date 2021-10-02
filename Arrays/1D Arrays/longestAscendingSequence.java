import java.util.Scanner;

/**
 * Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order. 
 * Print the elements of longest ascending sequence in an array
 * Elements of the sequence must go one after another. A single number is assumed to be an ordered sequence with the length = 1.
 */

public class longestAscendingSequence {
    
    public static void main(String[] args) {
        
        //Read elements and size
        Scanner scanner = new Scanner(System.in);
        int tam = scanner.nextInt();
        int[] numbers = new int[tam];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        //Defining auxiliary variables

        int maxTmp = 0;
        int count = 1;
        int pos = -1;

        //Traverse the array and increment the amount by 1 the longest amount in the array, in addition to obtaining the position
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                ++count;
            } else {
                if (count > maxTmp) {
                    maxTmp = count;
                    pos = i;
                }
                count = 1;
            }
        }

        //Check if count or maxTemp is the highest to assign the position from which the numbers will start printing
        if (maxTmp > count) {
            pos = (pos - maxTmp);
        }

        //Get max value
        int max = Math.max(count, maxTmp);
        System.out.println("The max value is : " + max);

        //Print elements
        for (int i = pos + 1; i <= pos + max; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();


        /*
        Value test
        10
        1 2 4 1 2 3 5 7 4 3

        12
        1 2 4 1 2 3 5 7 8 9 10 11

        20
        1 2 4 1 2 3 5 7 4 3 5 8 9 10 12 15 16 2 5 6

        15
        1 0 2 4 6 3 8 7 0 1 5 8 2 1 3

        3
        1 2 4

        4
        1 2 0 0

        8
        1 2 3 4 5 6 0 3*/

    }
    
}
