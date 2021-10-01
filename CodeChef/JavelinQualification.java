import java.util.*;

public class JavelinQualification
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int x = sc.nextInt();
		    int[] arr = new int[n];             // creating array which stores throws of each player
		    int[] player = new int[n];
		    int count = 0;
		    HashMap<Integer,Integer> map = new HashMap<>();
		    int index = 0;
		    for(int i = 0; i < n; i++){
		        arr[i] = sc.nextInt();
		        map.put(arr[i],i+1);
		        if(arr[i]>=m){                // if the throw is qualified
		            player[index] = i+1;      // storing selected players in 'player' array
		            arr[i] = 0;
		            count++;                  // storing count of qualified players
		            x--;
		            index++;
		        }
		    }
		    while(x-->0){                   // getting remaining x player who are left
		        int max1 = map.getOrDefault(max(arr, n),0); // creating variable to get index of maximum of the remaining players
		        if(arr[max1-1]>0){          // checking if the player is not selected
		            player[index] = max1;
		            arr[max1-1] = 0;
		            count++;
		            index++;
		        }
		    }
		    Arrays.sort(player);            // sorting player in increasing order
		    System.out.print(count+" ");
		    for(int i = 0; i < n; i++){
		        if(player[i]!=0){           // if the player is qualified
		            System.out.print(player[i]+" ");
		        }
		    }
		    System.out.println();
		}
        sc.close();
	}
	static int max(int[] arr, int n){     // funtion to get maximum throw
	    int max = Integer.MIN_VALUE;
	    for(int i = 0; i < n; i++){
	        if(max<arr[i]){
	            max=arr[i];
	        }
	    }
	    return max;
	}
}
