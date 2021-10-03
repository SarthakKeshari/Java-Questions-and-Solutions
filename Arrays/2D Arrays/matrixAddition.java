//Addition of 2 n*n matrices
//this program works for m*n matrices also!
import java.util.Scanner;
public class matrixAddition {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		
		int matrix_1[][];
		int matrix_2[][];
		int add_matrix[][];
		
		//taking input of number of rows and columns from user
		 System.out.println("enter row size of both matrices to be added :");
		 int row = reader.nextInt();
		 System.out.println("enter column size of both matrices to be added :");
		 int col = reader.nextInt();
		 
		 // declaring matrices of user defined rows and columns
	     matrix_1 = new int[row][col];
	     matrix_2 = new int[row][col];
	     add_matrix = new int[row][col];
	     
		 //entering elements in matrix 1
	     System.out.println("Enter elemtents in Matrix 1\n");
	     for(int i=0; i<row; i++){
	         for(int j=0; j<col; j++){
	             matrix_1[i][j] = reader.nextInt();
	         }
	     }
	     
		 //entering elements in matrix 2
	     System.out.println("Enter elemtents in Matrix 2\n");
	     for(int i=0; i<row; i++){ 
	         for(int j=0; j<col; j++){
	             matrix_2[i][j] = reader.nextInt();
	         }
	     }
	     
	    // adding matrix 1 and 2
	     for( int i=0; i<row; i++){
	         for(int j=0; j<col; j++){
	             add_matrix[i][j] = matrix_1[i][j] + matrix_2[i][j];
	         }
	     }
	     
		 // Printing output matrix
	     System.out.println("Resultant Matrix: \n");
	     for(int i=0; i<row; i++){
	         for(int j=0; j<col; j++){
	        	 System.out.print(add_matrix[i][j]+" ");
	        	 
	         } System.out.println();
	     }
	     
	    
		
	}

}
