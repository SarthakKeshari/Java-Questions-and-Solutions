// Write a program to print letter Z exactly
class Z{
    public static void main(String args[]){


        for(int x=0;x<8;x++){                  //for iteration of lines from top to bottom
            for(int y=0;y<9;y++){              //for iteration of lines from left to right
                if(x==0 || x==7){
                    System.out.print("@");     //to print @ where necessary
                }
                else if(x+y==7 || x+y==8){
                    System.out.print("#");     //to print # where necessary
                }
                else{
                    System.out.print(" ");     //to print spaces where necessary
                }
            }
            System.out.println();
        }
    }
}