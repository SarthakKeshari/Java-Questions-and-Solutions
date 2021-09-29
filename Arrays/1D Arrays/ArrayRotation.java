import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * Program to rotate the array in left or right with m number of steps
 */
public class ArrayRotation {

    public static void main(String[] args) {

        //To read the input from console
        MyScanner myScanner = new MyScanner();
        //Number of test cases
        int testCase = myScanner.nextInt();
        while (testCase > 0) {
            //array size
            int n = myScanner.nextInt();
            //number of steps to rotate
            int m = myScanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = myScanner.nextInt();
            }

            int l = arr.length;
            for (int i = 0; i < m; i++) {
                //left rotation
                printArrayValue(leftRotate(arr, l));
            }
            for (int i = 0; i < m; i++) {
                //right rotation
                printArrayValue(rightRotate(arr, l));
            }
            testCase--;
        }


    }

    public static int[] leftRotate(int[] arr, int l) {
        int temp = arr[0];
        int i = 0;
        for (i = 0; i < l - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
        return arr;
    }

    public static int[] rightRotate(int[] arr, int l) {
        int temp = arr[l - 1];
        int i = 0;
        for (i = l - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }

    public static void printArrayValue(int[] arr) {
        System.out.println("rotated array=" + Arrays.toString(arr));
    }

    static class MyScanner {
        private final BufferedReader bufferedReader;
        private StringTokenizer stringTokenizer;

        public MyScanner() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            try {
                while (stringTokenizer == null || !stringTokenizer.hasMoreTokens()) {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            return stringTokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }


}
