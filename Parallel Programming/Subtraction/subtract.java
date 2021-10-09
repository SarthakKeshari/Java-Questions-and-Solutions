//Performing subtraction of two numbers using parallel programming
import java.rmi.*;
import java.util.*;
public interface subtract extends Remote{//remote declaration
	public int sub(int x,int y) throws RemoteException;//passing arg...
}	
