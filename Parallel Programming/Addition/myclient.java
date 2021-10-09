// Addition using parallel programming
import java.rmi.*;
import java.util.*;
public class myclient{
public static void main(String args[]){
try{
adder stub=(adder)Naming.lookup("rmi://localhost:5000/sonoo");//fetching adder
Scanner sc=new Scanner(System.in);// taking input
System.out.println("Enter 1st no: ");
int x=sc.nextInt();//1st no. input 
System.out.println("\nEnter 2nd no: ");
int y=sc.nextInt();//2nd no. input
System.out.println("\nsum is: ");//showing output
System.out.println(stub.add(x,y));
}catch(Exception e){}
}
}
