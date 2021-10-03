//Write a program to sort the array accordingly
import java.util.Scanner;
class Array_semi_sort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int l=sc.nextInt();
        int ar[]=new int[l];
        for(int x=0;x<l;x++){
            System.out.println("Enter number at index "+x);
            ar[x]=sc.nextInt();
        }

        int odd[]=new int[l/2];
        int even[]=new int[l-(l/2)];
        int i=0;
        int j=0;

        for(int x=0;x<l;x++){
            if(x%2==0){
                even[i++]=ar[x];
            }
            else{
                odd[j++]=ar[x];
            }
        }
        even=ascending(even);
        odd=reverse(odd);
        odd=ascending(odd);
        odd=reverse(odd);
        i=0;j=0;

        for(int x=0;x<l;x++){
            if(x%2==0){
                ar[x]=even[i++];
            }
            else{
                ar[x]=odd[j++];
            }
        }

        for(int x=0;x<ar.length;x++){
            System.out.print(ar[x]+" ");
        }

    }
    public static int[] ascending(int ar[]){
        int l=ar.length;
        for(int x=0;x<l;x++){
            for(int y=x;y<l-1;y++){
                if(ar[y]>ar[y+1]){
                    int t=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=t;
                }
            }
        }
        return ar;
    }

    public static int[] reverse(int ar[]){
        int l=ar.length;
        int r[]=new int[l];
        for(int x=0;x<l;x++){
            r[l-1-x]=ar[x];
        }
        return r;
    }
    
}