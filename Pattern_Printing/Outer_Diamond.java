// Write a program to print a diamond void on a 7 x 7 grid matrix
class Outer_Diamond{
    public static void main(String args[]){
       
       
       
       
       
        for(int x=0;x<7;x++){                                     //to iterate the rows
            for(int y=0;y<7;y++){                                 //to iterate the columns
                if(x+y>=3 && x+y<=9 && y-x<=3 && y-x>=-3){        //to make the area of the diamond with the equations of the boundary lines
                    System.out.print("*");                        //to print asterisks wherever necessary
                }
                else{
                    System.out.print(" ");                        //to print spaces wherever necessary
                }
            }
            System.out.println();                                 //to change rows after completion of all columns in a particular row
        }



    }
}