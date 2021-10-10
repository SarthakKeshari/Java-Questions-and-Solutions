import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int a[]={0,1,2,4};
        int n=a.length;
        int missing=-1;
        Arrays.sort(a);
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
        System.out.println("Missing number is "+missing);
    }
}
