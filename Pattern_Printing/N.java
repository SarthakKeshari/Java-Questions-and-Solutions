// Write a program to print letter N exactly
class N{
    public static void main(String args[]){


        for(int x=0;x<8;x++){                                      // to iterate from top to bottom 
            
            for(int y=0;y<13;y++){                                 // to iterate from left to right in the same row
                
                if(y==1 || y==0 || y==11 || y==12){
                    
                    System.out.print("#");                         // to print hash wherever necessary
                }
                else if(y-x==2 || y-x==3){
                    
                    System.out.print("@");                         // to print @ wherever necessary

                }
                else{
                    
                    System.out.print(" ");                         // to print space wherever necessary

                }
            }
            
            System.out.println();
        }



    }
}
