//write a program to check if number is greater than or less than 10
import java.util.Scanner;
public class greaterOrLesserThan10 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		//Taking number from user
		System.out.println("Enter any number");
		int num = reader.nextInt();
		
		//Checking whether num > 10
		if(num>10){
			System.out.println("Number is Greater than 10.");
		}
		//Checking whether num = 10
		if(num==10){
			System.out.println("Number is Equal to 10.");
		}
		//Checking whether num < 10
		else if (num<10){
			System.out.println("Number is Less than 10.");
		}		
	}
}