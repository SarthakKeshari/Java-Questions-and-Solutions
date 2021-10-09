//Performing subtraction of two numbers using parallel programming
import java.rmi.*;
import java.util.*;
public class subclient{
public static void main(String args[]){
try{
subtract stub=(subtract)Naming.lookup("rmi://localhost:5000/sonoo");
Scanner sc=new Scanner(System.in);//taking input
System.out.println("Enter 1st no: ");
int x=sc.nextInt();//input 1st num
System.out.println("\nEnter 2nd no: ");
int y=sc.nextInt();//input 2nd num
System.out.println("\ndifference is: ");
System.out.println(stub.sub(x,y));//passing the values
}catch(Exception e){}
}
}
