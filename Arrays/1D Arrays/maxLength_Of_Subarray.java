
import java.util.*;

public class maxLength_Of_Subarray {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(countSubarrays(arr,n,k));
        sc.close();
	}

	public static int countSubarrays(int[] arr, int n, int k) {
		
		HashMap<Integer, Integer> map = new HashMap<>();  
		int sum = 0, maxLen = 0;      // sum = prefix sum which stores sum of every element, maxlen = maximum length of sub array
		for(int i = 0; i < n; i++){
			sum += arr[i];
			if(sum==k){
				maxLen = i + 1;     // if k itself is present in the array then length will start from 0 to index of k 
			}
			if(!map.containsKey(sum)){     // putting frequencies of every sum
				map.put(sum, i);
			}
			if(map.containsKey(sum-k)){
				if(maxLen < (i-map.get(sum-k))){   // updating the maxlen variable from starting point of sub array to end point
					maxLen = i - map.get(sum-k);
				}
			}
		}
		
		return maxLen;
			
	}

}
