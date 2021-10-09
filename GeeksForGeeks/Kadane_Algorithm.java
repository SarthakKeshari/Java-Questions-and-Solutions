/**
 * Kadane's_Algorithm
 */
public class Kadane_Algorithm {

    //here we have taken tow sum maxsum,current sum
    static int maxSub(int arr[], int n){
        int maxsum=Integer.MIN_VALUE,cursum=0;
        for(int i=0;i<n;i++){
            cursum=cursum+arr[i];
           
            if(cursum>maxsum){    //if current sum is greater than maxsum we update maxsum
                maxsum=cursum;
            }
            
            if(cursum<0){   //currentsum is negative discard the sum and startover
                cursum=0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
       int  Arr[] = {1,2,3,-2,5}; //The Array we use 
       int n=5;                   //Size of Array
      int ans=maxSub(Arr,n);     //Functionn call to maxSub
      System.out.println(ans);
    }
}
