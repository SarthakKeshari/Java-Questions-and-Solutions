
import java.util.Arrays;
import java.util.Collection;

/**
 * MergeSort_2
 */
//Q MergeSort two Arrays without taking any Extra Space
public class MergeSortWithoutExtraSpace {
 
    public static void main(String[] args) {
        int N = 2, M = 3;
        int a1[] = { 10, 12 };// first Input Array
        int a2[] = { 5, 18, 20 };//second Input Array
        
       int i=N-1;//i value will start form total number-1
       int j=0;
       //This function will Simple compare the value and swap the value
       //if Array1 value is smaller than Array2 it will sawp it. 
       while(i>=0 && j<M){
           if(a1[i]>a2[j]){
           int temp=a1[i];
            a1[i]=a2[j];
            a2[j]=temp;

               
           }i--;j++;
       }
       Arrays.sort(a1);//sort the Array one
       Arrays.sort(a2);//Sort the Array two
       for(int K=0;K<N;K++){
            System.out.println(a2[K]);
       }
    }
}