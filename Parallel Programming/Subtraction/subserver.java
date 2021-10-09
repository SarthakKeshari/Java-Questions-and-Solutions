//Performing subtraction of two numbers using parallel programming
import java.rmi.*;
import java.rmi.registry.*;
import java.util.*;
public class subserver{
public static void main(String args[]){
try{
subtract stub= new SubR();//passing through SubR
Naming.rebind("rmi://localhost:5000/sonoo",stub);//rebinding the server
System.out.println("Connected to subtractinng server.....");//Displaying after server started
}catch(Exception e){System.out.println(e);}
}
}
