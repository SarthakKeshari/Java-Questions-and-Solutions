/*
Problem Statement: Given three numbers 'a', 'b' and 'm' calculate a^b under modulo m.
Constraints: a<=10^9, b<=10^9, m<=10^9

Idea: Any number can be represented in sum of powers of 2. The idea is to represent the power 'b' in sum of
powers of 2.

Example: 3^11 can be written as 3^(1011) where power is in binary.
        = 3^(1*(2^3) + 0*(2^2) + 1*(2^1) + 1*(2^0))
        = 3^(1*8 + 0*4 + 1*2 + 1*1)
        = 3^8 * 3^0 * 3^2 * 3^1
        = 6561 * 1 * 9 * 3
        = 177417

Why use modulo m?
Answer: Since the multiplication operation in lines 48 and 51 can easily exceed 'm' modulo is taken.

Complexity: O(Log(b))
Reason: The while loop will run for number of bits in 'b' which is Log(b)

Modulo properties used:
(a * b * c *d) % m = ((( a * b ) % m) * c) % m) * d) % m
*/

import java.util.Scanner;

public class ModularExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long m = sc.nextLong();

        long result = modularExp(a, b, m);

        System.out.println(result);
    }

    public static long modularExp(long a, long b, long m) {
        long ans = 1;

        //handle case where 'a' is large
        a = a % m;

        while (b > 0) {
            //LSB is set
            if ((b & 1) == 1) {
                //multiply current base with ans if bit is set
                ans = (ans * a) % m;
            }
            //drop LSB by right-shifing by 1
            b >>= 1;
            //increase base with every iteration
            a = (a * a) % m;
        }

        return ans;
    }
}
