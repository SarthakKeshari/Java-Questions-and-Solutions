// Addition using parallel programming
import java.rmi.*;
import java.rmi.registry.*;
import java.util.*;
public class myserver{
public static void main(String args[]){
try{
adder stub= new AddR();//fetching remote
Naming.rebind("rmi://localhost:5000/sonoo",stub);
System.out.println("Connected to server.....");// displaying once server started
}catch(Exception e){System.out.println(e);}
}
}
