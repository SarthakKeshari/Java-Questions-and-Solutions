//Q. Find the missing number from the given Array[0,n],N being the number of length. 
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int a[]={0,1,2,4};//Input Arrray
        int n=a.length;
        int missing=-1;//Setting n value 
        Arrays.sort(a);//this will sort the array.
        //This function will check if   index number 
        // and value is same or not, if not same assign the  value to missing.
        for(int i=0;i<n;i++){
            if(i!=a[i]){
                missing=i;
                break;
            }
        }
        if(missing==-1){
            missing=n;
        }
        //This function will print the Input Array
        System.out.println("Input Array: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("Missing number is "+missing);//This will print the Required Answer.
    }
}
