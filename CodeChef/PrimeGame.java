import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeGame {

    private static final int NUMBER = 1000000;
    private static final int[] array = new int[NUMBER + 1];
    private static final BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int t;
        int chefPlay;
        int divyamPlay;

        boolean[] primes = getPrimesBySieveOfEratosthenes(NUMBER);
        setArrayWithPrimes(primes);

        t = Integer.parseInt(br.readLine());

        while (t-- >= 0) {

            String line = br.readLine();
            String[] strings = line.split(" ");

            chefPlay = Integer.parseInt(strings[0]);
            divyamPlay = Integer.parseInt(strings[1]);

            checkWinner(chefPlay, divyamPlay);
        }

        br.close();
    }


    /*
        Receives 2 plays and checks and prints the winner
     */
    private static void checkWinner(int chefPlay, int divyamPlay) {
        if (array[chefPlay] <= divyamPlay) {
            System.out.println("Chef");
        }
        else {
            System.out.println("Divyam");
        }
    }

    /*
        Receives a integer number and defines an boolean array with all primes smaller than or equal to
        the number using Sieve of Eratosthenes algorithm
        link: https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     */
    private static boolean[] getPrimesBySieveOfEratosthenes(int number) {

        /*
            Create a boolean array "prime[0..n]" and initialize
            all entries it as true. Each prime[i] will
            finally be false if i is Not a prime, else true.
        */
        boolean[] prime = new boolean[number + 1];

        for (int i = 0; i <= number; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= number; p++) {

            // If prime[p] is not changed, then it is a prime
            if (prime[p]) {
                // Update all multiples of p
                for (int i = p*p; i <= number; i += p) {
                    prime[i] = false;
                }
            }
        }

        return prime;
    }

    /*
        Sets the array according to the givens primes array
     */
    private static void setArrayWithPrimes(boolean[] primes) {

        array[0] = 0;
        array[1] = 0;

        for (int i = 2; i <= NUMBER; i++) {
            array[i] = array[i - 1];

            if (primes[i]) {
                array[i] = array[i] + 1;
            }
        }
    }

}