import java.util.Scanner;

/**
Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. 
The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:
	1) Only one disk can be moved at a time.
	2) Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack 
	   i.e. a disk can only be moved if it is the uppermost disk on a stack.
	3) No disk may be placed on top of a smaller disk.
*/

// Java recursive program to solve tower of hanoi puzzle

public class TowerOfHanoi
{
	// recursive method to display moves to be made
	void towerOfHanoi(int n, String sourceRod, String targetRod, String auxRod)
	{
		// disk = 1, simply move the disk to target rod
        	if (n == 1)
		{
			System.out.println("Move disk 1 from rod " + sourceRod + " to rod " + targetRod);
			return;
		}

        	// moving n-1 disks to auxiliary rod
        	// so that nth disk can be moved to target rod
		towerOfHanoi(n-1, sourceRod, auxRod, targetRod);
		
        	// displaying the move to be made
        	System.out.println("Move disk " + n + " from rod " + sourceRod + " to rod " + targetRod);

        	// moving n-1 disks to target rod above the nth disk
        	// nth disk is already present at taget rod 
		towerOfHanoi(n-1, auxRod, targetRod, sourceRod);
	}
	
	// Driver method
	public static void main(String args[])
	{
        	Scanner sc = new Scanner(System.in);
        	towerOfHanoi obj = new towerOfHanoi();
        
        	// source/start rod
        	System.out.print("Enter source rod: ");
        	String sourceRod = sc.next();
        
        	// target/destination rod
        	System.out.print("Enter target rod: ");
        	String targetRod = sc.next();
			
        	// auxiliary rod
        	System.out.print("Enter auxiliary rod: ");
        	String auxRod = sc.next();
        
        	// Number of disks
        	System.out.print("Enter number of disks: ");
		int n = sc.nextInt(); 
		
        	obj.towerOfHanoi(n, sourceRod, targetRod, auxRod);
	}
}
