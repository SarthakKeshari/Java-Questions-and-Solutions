import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
                                        // Question: Convert the temperature from celsius to fahrenheit and Fahrenheit to
                                        // Celsius according to the user`s choice provided by the input

        System.out.println("To convert from Celsius to Fahrenheit Enter 0\n" + "To convert from Fahrenheit to Celsius enter 1");    // Asking user for input

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();        // Taking input to choose the temperature conversion

        switch (n) {

            case 0:
                System.out.println("Enter the temperature in Celsius");

                float temp = input.nextFloat();             // Taking the temperature in celsius
                double ans = ((temp * 9) / 5) + 32;         // Formula to calculate the temperature in celsius

                System.out.printf("The %.3f degree celsius = %.3f Fahrenheit", temp, ans);
                break;

            case 1:
                System.out.println("Enter the temperature in Fahrenheit");

                temp = input.nextFloat();                   // Taking the temperature in celsius
                ans = ((temp - 32) * 5) / 9;                // Formula to calculate the temperature in celsius

                System.out.printf("The %.3f = %.3f degree celsius", temp, ans);
                break;

            default:            // Showing the message if user provides invalid argument
                System.out.println("Enter valid input");
        }
    }
}
