//Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers;
/* 153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153  */

public class ArmstrongNumber {
    public ArmstrongNumber() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;

        int result;
        for(result = 0; 0 < num; num /= 10) {
            int rem = num % 10;
            result += rem * rem * rem;
        }

        if (temp == result) {
            System.out.println(temp + " is a armstrong number");
        } else {
            System.out.println(temp + " is not a armstrong number");
        }

    }
}
