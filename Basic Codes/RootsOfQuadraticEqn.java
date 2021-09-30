//Find the roots of the quadratic Equation
import java.util.Scanner;

public class quadratic_roots {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double root1, root2;
		
		System.out.println("Quadratic Equation : a(x)^2 + b(x) + c = 0");
		System.out.println("Enter value of a: ");
		a = reader.nextDouble();
		System.out.println("Enter value of b: ");
		b = reader.nextDouble();
		System.out.println("Enter value of c: ");
		c = reader.nextDouble();
		
		// d stands for determinant
		double d = (b * b) - 4 * (a * c);
		
		//if d = 0 roots are equal and real, id d>0 roots are real and distinct
		if (d >= 0) {
			root1 = (-b + Math.sqrt(d)) / (2 * a);
			root2 = (-b - Math.sqrt(d)) / (2 * a);

			System.out.println("root1 = "+root1+ "\nroot2 = "+ root2);
			if (root1 == root2) {
				System.out.println("Both roots are equal and real!");
			}
			
			else{
				System.out.println("Roots are real and distinct");
			}
		}
		//d<0, roots are imaginary
		else {
			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-d) / (2 * a);				
			System.out.println("root1 = "+real+ " + " +imaginary+"i");
			System.out.println("root2 = "+real+ " - " +imaginary+"i");
			System.out.println("Roots are imaginary!");
		}
	}
}
