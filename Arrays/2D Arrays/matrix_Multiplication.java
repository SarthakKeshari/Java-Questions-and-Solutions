import java.util.Scanner;

public class matrix_Multiplication {
    public static void main(String args[]) {

        int m, n, p, q, sum = 0, c, d, k;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number of Rows and Columns of First Matrix : ");
        m = in.nextInt();
        n = in.nextInt();

        int first[][] = new int[m][n];

        System.out.print("Enter First Matrix Elements : ");

        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                first[c][d] = in.nextInt();
            }
        }

        System.out.print("Enter Number of Rows and Columns of Second Matrix : ");
        p = in.nextInt();
        q = in.nextInt();

        if (n != p) {
            System.out.print("Matrix of the entered order can't be Multiplied..!!");
        } else {
            int second[][] = new int[p][q];
            int multiply[][] = new int[m][q];

            System.out.print("Enter Second Matrix Elements :\n");

            for (c = 0; c < p; c++) {
                for (d = 0; d < q; d++) {
                    second[c][d] = in.nextInt();
                }
            }

            System.out.print("Multiplying both Matrix...\n");

            for (c = 0; c < m; c++) {
                for (d = 0; d < q; d++) {
                    for (k = 0; k < p; k++) {
                        sum = sum + first[c][k] * second[k][d];
                    }

                    multiply[c][d] = sum;
                    sum = 0;
                }
            }

            System.out.print("Multiplication Successfully performed..!!\n");
            System.out.print("Now the Matrix Multiplication Result is :\n");

            for (c = 0; c < m; c++) {
                for (d = 0; d < q; d++) {
                    System.out.print(multiply[c][d] + "\t");
                }
                System.out.print("\n");
            }
        }

    }
}
