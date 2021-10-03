import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Class providing the Strassen algorithm as a divide-and-conquer
 * functionality to multiply two square matrices.
 */
public class StrassenAlgorithm {

    /**
     * Adds matrix A to B.
     *
     * @param A The first matrix to add.
     * @param B The second matrix to add.
     * @return The sum of A and B.
     */
    public static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int row = 0; row < n; row++) {
            final int i = row;
            C[i] = IntStream.range(0, n).map(j -> A[i][j] + B[i][j]).toArray();
        }
        return C;
    }

    /**
     * Subtracts matrix B from A.
     *
     * @param A The matrix to subtract from.
     * @param B The matrix to subtract.
     * @return The difference between A and B.
     */
    public static int[][] sub(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int row = 0; row < n; row++) {
            final int i = row;
            C[i] = IntStream.range(0, n).map(j -> A[i][j] - B[i][j]).toArray();
        }
        return C;
    }

    /**
     * Multiply two matrices A and B using the Strassen algorithm.
     *
     * @param A The first matrix.
     * @param B The second matrix.
     * @return The product of A and B.
     */
    public static int[][] multiply(int[][] A, int[][] B) {
        // Size of the matrices
        int n = A.length;

        // Return matrix initialization
        int[][] R = new int[n][n];

        if (n == 1) {
            // Stop recursion, base case with matrix sizes 1
            R[0][0] = A[0][0] * B[0][0];
        } else if (n % 2 != 0) {
            // Odd matrix size, expand matrices to be of even size
            int[][] Anew = new int[n + 1][n + 1];
            int[][] Bnew = new int[n + 1][n + 1];
            conquer(A, Anew, 0, 0);
            conquer(B, Bnew, 0, 0);

            // Multiply matrices of even size
            int[][] Cnew = multiply(Anew, Bnew);

            // Extract relevant values
            for (int i = 0; i < n; i++) {
                System.arraycopy(Cnew[i], 0, R[i], 0, n);
            }
        } else {
            // Divide matrix A into 4 quarters
            int[][] A11 = divide(A, 0, 0, n / 2);
            int[][] A12 = divide(A, 0, n / 2, n / 2);
            int[][] A21 = divide(A, n / 2, 0, n / 2);
            int[][] A22 = divide(A, n / 2, n / 2, n / 2);

            // Divide matrix B into 4 quarters
            int[][] B11 = divide(B, 0, 0, n / 2);
            int[][] B12 = divide(B, 0, n / 2, n / 2);
            int[][] B21 = divide(B, n / 2, 0, n / 2);
            int[][] B22 = divide(B, n / 2, n / 2, n / 2);

            // Apply all the calculation steps from the algorithm itself
            int[][] M1 = multiply(add(A11, A22), add(B11, B22));
            int[][] M2 = multiply(add(A21, A22), B11);
            int[][] M3 = multiply(A11, sub(B12, B22));
            int[][] M4 = multiply(A22, sub(B21, B11));
            int[][] M5 = multiply(add(A11, A12), B22);
            int[][] M6 = multiply(sub(A21, A11), add(B11, B12));
            int[][] M7 = multiply(sub(A12, A22), add(B21, B22));
            int[][] C11 = add(sub(add(M1, M4), M5), M7);
            int[][] C12 = add(M3, M5);
            int[][] C21 = add(M2, M4);
            int[][] C22 = add(sub(add(M1, M3), M2), M6);

            // Join matrices and return result
            conquer(C11, R, 0, 0);
            conquer(C12, R, 0, n / 2);
            conquer(C21, R, n / 2, 0);
            conquer(C22, R, n / 2, n / 2);
        }
        return R;
    }

    /**
     * Extract a square sub-matrix from matrix A.
     *
     * @param A   The matrix to extract a sub-matrix from.
     * @param row The start row index.
     * @param col The start column index.
     * @param n   The size of the sub-matrix to extract.
     * @return The extracted sub-matrix of A.
     */
    private static int[][] divide(int[][] A, int row, int col, int n) {
        int[][] R = new int[n][n];
        for (int Rrow = 0, Arow = row; Rrow < n; Rrow++, Arow++) {
            System.arraycopy(A[Arow], col, R[Rrow], 0, n);
        }
        return R;
    }

    /**
     * Insert a matrix S into A.
     *
     * @param S   The matrix to insert.
     * @param A   The matrix to insert S into.
     * @param row The start row index.
     * @param col The start column index.
     */
    private static void conquer(int[][] S, int[][] A, int row, int col) {
        for (int Srow = 0, Arow = row; Srow < S.length; Srow++, Arow++) {
            System.arraycopy(S[Srow], 0, A[Arow], col, S.length);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Starting the Strassen Algorithm...");

        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader in = new BufferedReader(isr)) {
            System.out.print("Enter number of rows/columns of the input matrices: ");
            int n = Integer.parseInt(in.readLine());

            int[][] A = new int[n][n];
            int[][] B = new int[n][n];

            System.out.println("Enter first matrix elements:");

            for (int i = 0; i < n; i++) {
                String[] line = in.readLine().split(" ");
                A[i] = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
            }

            System.out.println("Enter second matrix elements:");

            for (int i = 0; i < n; i++) {
                String[] line = in.readLine().split(" ");
                B[i] = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
            }

            int[][] C = multiply(A, B);

            System.out.println("Product of the matrices:");

            for (int i = 0; i < n; i++) {
                System.out.println(Arrays.stream(C[i])
                        .mapToObj(e -> e + " ")
                        .collect(Collectors.joining()));
            }
        }
    }

}
