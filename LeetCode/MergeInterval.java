public class Mergeinterval {
    public static int[] input() {
        System.out.println("Enter the size array:");
        Scanner sc=new Scanner(System.in);        int n;
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the  array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;

    }
    public static void print(int a[])
    {
        System.out.println("The array: ");
        int n=a.length;
        for (int i = 0; i < n; i++) {
          System.out.print(a[i]+ " ");
        }   System.out.println();
    }
    public static void main(String[] args) {
        
    }
}
