/* question -
In this question will have to print element of matrix in wave form

Sample Case
Input:
1 2 3
4 5 6
7 8 9
Output:1 4 7 8 5 2 3 6 9*/

package matrix;
import java.util.*;

public class wave {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
// no of rows
		int n = sc.nextInt();
// no of columns
		int m = sc.nextInt();
		int[][] mat = new int[n][m];

		//To recieve elements of matrix as input from user
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		for (int i = 0; i < mat[0].length; i++) {
			//column with even serial number will be printed in increasing order
			if (i % 2 == 0) {
				for (int j = 0; j < mat.length; j++) {
					System.out.println(mat[j][i]);
				}
				//column with odd serial number will be printed in decreasing order
			} else {
				for (int j = mat.length - 1; j >= 0; j--) {
					System.out.println(mat[j][i]);
				}
			}
		}

	}

}
