package pattern_program;

/*
Write a program to print letter J exactly as shown below -

$$$$$##$$$$$
	 ##     
	 ##     
	 ##     
	 ##     
	 ##     
##   ##     
 ##  ##
   ##
*/



import java.util.Scanner;

public class Letter_J{
    
  public static void main(String[] args){
      
    Scanner scan =new Scanner(System.in);
    System.out.println("Please specify the height of the alphabet and keep that integer odd and greater than 1");
    
    int patternHeight = scan.nextInt();
    
    if(patternHeight % 2 == 0) {
		System.out.println("Please specify any odd integer for a better view.");
	} 
	else if(patternHeight < 3) {
		System.out.println("Please specify any odd integer greater than 1 for a better view.");
	}
	else{
		printJ(patternHeight);
	}
  }
  
  // main logic
  public static void printJ(int n){
        for(int i=0; i <= n*2; i++){
            
            if(i==n){
              System.out.printf("##");
            }
            else{
              System.out.printf("$");
            }
        }
        System.out.println();
            
        for(int i=0; i<n; i++){
            
            for(int j=0; j<n*2; j++){
                if(j==n){
                    System.out.printf("##");
                }else{
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
            
        for(int i=0; i <= n/2; i++){
            
            for(int k =0; k<(2*i -1); k++){ 
                System.out.printf(" ");
            }
            
            System.out.printf("##");
            
            if(i == n/2){
             continue;   
            }
            
            if(i==0){
                for(int k = 0; k < (n-2); k++){
                    System.out.print(" ");
                }
            }
            else{
                for(int k = 0; k < (n-2 - (2*i - 1)); k++){
                    System.out.print(" ");
                }
            }
            System.out.printf("##");
            System.out.println();
        }
	}
}