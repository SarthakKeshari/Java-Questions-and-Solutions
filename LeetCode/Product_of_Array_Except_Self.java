import java.util.Scanner;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of element : ");
		int n = sc.nextInt();

		int nums[] = new int[n];
		System.out.println("Enter " + n + " values :");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int[] ans = productExceptSelf(nums);

		System.out.println(" Ans : ");
		for(int i=0;i<nums.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

	private static int[] productExceptSelf(int[] nums) {
		int[] right = new int[nums.length];
		int prod =1 ;
//		make the right product array
		for(int i=nums.length-1;i>=0;i--) {
			prod*=nums[i];
			right[i]=prod;
		}
		
//		make the result array with using of left array
		prod=1;
		int[] result=new int[nums.length];
		for(int i=0;i<nums.length-1;i++) {
//			make the result array 
			int lp=prod;
			int rp=right[i+1];
//			except the the self 
			result[i] = lp * rp;
//			update the product variable
			prod*=nums[i];
		}
//		set the last element of the array with the product variable
		result[nums.length-1]=prod;
		
		return result;
	}

}
