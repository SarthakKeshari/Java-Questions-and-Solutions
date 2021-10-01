/*
There are N players with IDs from 1 to N, who are participating in the Javelin throw competition which has two rounds. The first is the qualification round, followed by the final round. The qualification round has gotten over, and you are given the longest distance that each of the N players has thrown as A1,A2,…,AN. Now, the selection process for the final round happens in the following two steps:

If the longest throw of a player in the qualification round is greater than or equal to the qualification mark of M cm, they qualify for the final round.

If after step 1, less than X players have qualified for the finals, the remaining spots are filled by players who have thrown the maximum distance among the players who have not qualified yet.

You are given the best throws of the N players in the qualification round A1,A2,…,AN and the integers M and X. Print the list of the players who will qualify for the finals in increasing order of their IDs.

Sample Input 1 
3
3 8000 2
5000 5001 5002
3 5000 2
7999 7998 8000
4 6000 3
5999 5998 6000 6001

Sample Output 1 
2 2 3
3 1 2 3
3 1 3 4
*/

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
