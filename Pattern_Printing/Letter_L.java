/*
 Write a program to print letter L exactly as shown below -
##       
##       
##       
##       
##       
##       
##       
##&&&&&&&
 */
public class Letter_L {

	public static void main(String[] args) {
		int height = 8;	//height of pattern

        int i, j;
        // Pattern printing
        for (i = 0; i < height; i++) { //traversing each row
            for (j = 0; j < height+1; j++) {//traversing each col=row+1
                if(j==0 ||j==1)		//if col number is 0 and 1 then printing #
                {
                	System.out.print('#');
                }
                else if(i==height-1) //if it is last row printing &
                {
                	System.out.print('&');
                }
                else //spacing after 0 and 1 col
                    System.out.print(" ");
            }
            System.out.printf("\n"); //for next line
        }

	}

}