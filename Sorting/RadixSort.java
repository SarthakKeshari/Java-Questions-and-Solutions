
 //Write a program to sort an array using Radix Sort Algorithm. 


public class Radix {
    public static void main(String[] args) {
        int[] arr={ 4725, 4586, 1330, 8792, 1594, 5729};
        radixsort(arr, 4, 10);

        for (int i= 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void radixsort(int[] arr, int width, int radix)
    {
        for(int i=0 ; i<width ; i++){
            singleradix(arr, i, radix);
        }
    }

    public static void singleradix(int[] arr, int pos, int radix){
         int numlength= arr.length;
         int[] countArr= new int[radix];
         //raw count that how many digits have same valued at same position
         for (int value: arr){
             countArr[getDigit(pos, value, radix)]++;
         }
         //adjust counts to make a stable counting sort
         for (int j=1 ; j<radix ; j++){
             countArr[j] += countArr[j - 1];
         }
         //values are being copied in a temporary array
         int[] temp= new int[numlength];
         for (int k= numlength-1 ; k>=0 ; k--){
             temp[--countArr[getDigit(pos, arr[k], radix)]]= arr[k];
         }
         //coping temporary array to original array
         for (int i=0 ; i<numlength ; i++){
             arr[i] = temp[i];
         }
    }

    public static int getDigit(int pos, int value, int radix){
        return value / (int) Math.pow(radix , pos) % radix;
    }
}
