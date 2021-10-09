public class C {
    public static void main(String args[]){

        for(int x=0;x<11;x++){
            for(int y=0;y<11;y++){
                
                if( (x>2 && x<8) ){
                    if(y==0 || y==1){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if((x==0 || x==10)&&(y>=4 && y<8)){
                    System.out.print("#");
                }
                else if(x!=0 && x!=10 && y!=0){
                    if(x+y==4 || x+y==3 || x-y==7 || x-y==6 || y-x==7 || y-x==8 || x+y==18 || x+y==17){
                        System.out.print("*");
                    }
                    // else if(){
                    //     System.out.print("*");
                    // }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }



    }
}
