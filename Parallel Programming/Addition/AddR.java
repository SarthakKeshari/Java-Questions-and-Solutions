// Addition using parallel programming
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public class AddR extends UnicastRemoteObject implements adder{
	AddR() throws RemoteException{
	super();
	}
	public int add(int x,int y){
		return x+y;// performing addition
	}	
}	
