/*
Given an array of integers where each element represents the max number of steps that can be made forward from that element.
Return the minimum number of jumps to reach the end of the array. If an element is 0, it cannot move through that element. If the end isn’t reachable, return -1.
*/
import java.util.*;

public class minimum_Jumps {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        minJumps(arr, n);
        sc.close();

    }
    static void minJumps(int[] arr, int n){
        int[] jumps = new int[n];
        int min;
        jumps[n-1] = 0;
        for(int i = n-2; i >= 0; i--){
            // If arr[i] is 0 then arr[n-1]
            // can't be reached from here
            if(arr[i]==0){
                jumps[i] = Integer.MAX_VALUE;
                // If we can directly reach to
                // the end point from here then
                // jumps[i] is 1    
            }else if(arr[i] >= n-i-1){
                jumps[i] = 1;
            }else{
                min = Integer.MAX_VALUE;
                // following loop checks
                // with all reachable points
                // and takes the minimum
                for(int j = i+1; j < n && j <= arr[i]+i; j++){
                    if(min > jumps[i]){
                        min = jumps[j];
                    }
                }
                // Handle overflow
                if(min!=Integer.MAX_VALUE){
                    jumps[i] = min+1;
                }else{
                    jumps[i] = min;     // or Integer.MAX_VALUE
                }
            }
        }
        System.out.println(jumps[0]);
    }

}
