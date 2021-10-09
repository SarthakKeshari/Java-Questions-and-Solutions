/*question -
In this question will have to print element of matrix in spiral form .
Basically you have to print character moving from outer most layer to inner most layer spirally

Sample Case
Input:
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
25 26 28 29 30
Output:
1 6 11 16 21 26 27 28 29 30 25 20 15 10 5 4 3 2 7 12 17 22 23 24 19 14 9 8 13 18*/

package matrix;

import java.util.Scanner;

public class spira {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
//To enter no of rows
		int n = sc.nextInt();
//To enter no of columns
		int m = sc.nextInt();
		int[][] mat = new int[n][m];

		//To recieve elements of matrix as input from user
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
//		total no of elements in matrix
		int total=m*n;
		int cnt=0;
		int minr=0,minc=0,maxr=mat.length-1,maxc=mat[0].length-1;
		
		//this while condition  is used so that no element is printed twice or more
		while(cnt<total) {
			//this loop will print left most column of outermost matrix
			for(int i=minr,j=minc;i<=maxr&&cnt<total;i++) {
				System.out.println(mat[i][j]);
				cnt++;
			}
			minc++;
			//this loop will print bottom most column of outermost matrix
			
			for(int i=maxr,j=minc;j<=maxc&&cnt<total;j++) {
				System.out.println(mat[i][j]);
				cnt++;
			}
			maxr--;
			//this loop will print right most column of outermost matrix
		
			for(int i=maxr,j=maxc;i>=minr&&cnt<total;i--) {
				System.out.println(mat[i][j]);
				cnt++;
			}
			maxc--;
			//this loop will print top most column of outermost matrix
		
			for(int i=minr,j=maxc;j>=minc&&cnt<total;j--) {
				System.out.println(mat[i][j]);
				cnt++;
			}
			minr++;
			
		}
		
		
		
	}

}
