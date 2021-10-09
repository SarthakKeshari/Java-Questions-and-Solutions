// Addition using parallel programming

import java.rmi.*;
import java.util.*;
public interface adder extends Remote{ //connecting to remote
	public int add(int x,int y) throws RemoteException;
}	
