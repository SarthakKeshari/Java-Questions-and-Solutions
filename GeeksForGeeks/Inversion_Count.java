// Given an array of integers. Find the Inversion Count in the array.


import java.util.Scanner;


public class Inversion_Count {
    public static int[] input() {   //This function is sued to take input from the user
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {   //This forloop will help to store array 
            a[i] = sc.nextInt();
        }
        return a;

    }
             //This is the main logic of the solution 
             //The first loop will run till the length of array starting from 0
             //Second loop will run till length f array starting from (i+1);
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
            System.out.println(count);//The final answer is printed using this line
        }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases you want to perform: ");
        int t = sc.nextInt();//"t " stores the number of test cases you want to perform
        for (int p = 0; p < t; p++) {
            int a[] = input();
            inversecount(a);
        }
    }
}
