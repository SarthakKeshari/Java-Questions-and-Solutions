import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * Parse a given date in dd/yyyy/mm format with different difficulties
 */
public class DateValidation {

    /**
     * Very naive approach.
     */
    public static Pattern EASY_FORMAT = Pattern.compile("\\d\\d/\\d\\d\\d\\d/\\d\\d");

    /**
     * Let's split up into different cases, i.e. different months.
     */
    public static Pattern MEDIUM_FORMAT = Pattern.compile(""
            + "(((0[1-9])|([1-2][0-9]))/\\d\\d\\d\\d/02" // February
            + "|((0[1-9])|([1-2][0-9])|(3[0-1]))/\\d\\d\\d\\d/(01|03|05|07|08|10|12)" // Months with 31 days
            + "|((0[1-9])|([1-2][0-9])|(30))/\\d\\d\\d\\d/(04|06|09|11))" // Months with 30 days
    );

    /**
     * For the hard format, take into account that a year is a leap year if it is divisible by 4, but not by 100.
     * However, if the year is divisible by 400, it will nevertheless be counted as a leap year.
     */
    public static Pattern HARD_FORMAT = Pattern.compile(""
            + "(29/" // 29th day
            + "((([0-9]{2})(04|08|[2468][048]|[13579][26]))|" // First two numbers are arbitrary; if the last two
                                                              // numbers are divisible by 4, but are not 00
                                                              // So, the year is divisible by 4, but not 100
            + "(00|04|08|[2468][048]|[13579][26])00)" // If the first two numbers are divisible by 4 and the last two
                                                      // are 00. So, the year is divisible by 400
            + "/02" // February
            + "|((0[1-9])|(1[0-9])|(2[0-8]))/\\d\\d\\d\\d/02" // "Normal" Februaries
            + "|((0[1-9])|([1-2][0-9])|(3[0-1]))/\\d\\d\\d\\d/(01|03|05|07|08|10|12)" // Months with 31 days
            + "|((0[1-9])|([1-2][0-9])|(30))/\\d\\d\\d\\d/(04|06|09|11))" // Months with 30 days
    );

    public static void main(String[] args) throws IOException {
        System.out.println("Starting the Regex Date Validation...");

        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader in = new BufferedReader(isr)) {
            System.out.print("Enter date to validate: ");
            String date = in.readLine();

            System.out.println("Matches dd/yyyy/mm format:   " + EASY_FORMAT.matcher(date).matches());
            System.out.println("Matches also days per month: " + MEDIUM_FORMAT.matcher(date).matches());
            System.out.println("Matches also leap years:     " + HARD_FORMAT.matcher(date).matches());
        }
    }

}
