// Write a program to print letter N exactly
class N{
    public static void main(String args[]){


        for(int x=0;x<8;x++){
            for(int y=0;y<13;y++){
                if(y==1 || y==0 || y==11 || y==12){
                    System.out.print("#");
                }
                else if(y-x==2 || y-x==3){
                    System.out.print("@");

                }
                else{
                    System.out.print(" ");

                }
            }
            
            System.out.println();
        }



    }
}