//Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.

package Array;
import java.util.Arrays;

public class missing {
    public static void main(String[] args) {
        int a[]={1,2};  //INput array
        int n=a.length; //Taking its length in variable n
        int missing=-1;  //Since the input is betweem [0,n] we set missing -1;
        Arrays.sort(a);//Sorting the Array
        for(int i=0;i<n;i++){
            if(i!=a[i]){
                missing=i;
                break;
            }
        }
        if(missing==-1){
            missing=n;
        }
        System.out.println("Input Array: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println(missing);  //This will display the Answer.
    }
}
