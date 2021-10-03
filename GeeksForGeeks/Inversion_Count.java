import java.util.Scanner;

public class Inversion_Count {
    public static int[] input() {
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;

    }
    
        public static void inversecount(int a[]) {
            int count=0;
            for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++)
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    count++;
                }
            }
            System.out.println("The Answer is: ");
            System.out.println(count);
        }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases you want to perform: ");
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int a[] = input();
            inversecount(a);
          
        }
    }
}
