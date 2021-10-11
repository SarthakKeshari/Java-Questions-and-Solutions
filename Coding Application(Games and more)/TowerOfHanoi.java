import java.util.Scanner;

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
		
        obj.towerOfHanoi(n, sourceRod, targetRod, auxRod); // 1, 2 and 3 are names of rods
	}
}
