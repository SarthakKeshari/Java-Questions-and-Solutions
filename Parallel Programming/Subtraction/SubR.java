//Performing subtraction of two numbers using parallel programming
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public class SubR extends UnicastRemoteObject implements subtract{//declaring remote
	SubR () throws RemoteException{
	super();
	}
	public int sub(int x,int y){// passing values
		return x-y;//performing operation
	}	
}	
