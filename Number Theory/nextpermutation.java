import java.util.Scanner;

public class nextpermutation {
    public static int[] input() {
        System.out.println("Enter the size array:");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the  array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;

    }

    public static void print(int a[]) {
        System.out.println("The array: ");
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static int[] nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
        return nums;
    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

            int a[] = input();
           int b[]= nextPermutation(a);
           print(b);
        
    }
}
