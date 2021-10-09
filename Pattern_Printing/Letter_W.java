/*
 Write a program to print letter W exactly as shown below -
@@         #         @@  
 @@       # #       @@   
  @@     #   #     @@    
   @@   #     #   @@     
    @@ #       # @@      
     @@         @@      
 */
public class Letter_W {

	public static void main(String[] args) {
		int height = 6;	//height of pattern
        int i, j;
        // Pattern printing
        //here if row=height then col=height*4-1
        for (i = 0; i < height; i++) { //traversing each row
            for (j = 0; j <(height*4-1); j++) {//traversing each col
            	if(i==j)		//diagonally printing @@ symbol
                {
                	System.out.print("@@");
                }
                else if(j==4*(height-1)-i) //for printing the @@ symbol reverse diagonally
                {
                	System.out.print("@@");
                }
                else if(j==((height*4-3)/2)+i) //for printing the # symbol diagonally
            	{
            		System.out.print('#');
            	}
                else if (j==((height*4-3)/2)-i)//for printing the # symbol reverse diagonally
                {
                	System.out.print('#');
                }
                else //spacing 
                    System.out.print(" ");
            }
            System.out.printf("\n"); //for next line
        }

	}

}
