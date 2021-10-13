public class DigitalClock {
    public static void main(String[] args) throws InterruptedException {

        //Variables
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        
        while (true) {
            //If 'hours' are less than 10, we write a '0' in front to get the desired structure
            if (hours < 10) {
                System.out.print("0");
            }

            System.out.print(hours + ":");

            //If 'minutes' are less than 10, we write a '0' in front to get the desired structure
            if (minutes < 10) {
                System.out.print("0");
            }

            System.out.print(minutes + ":");

            //If 'seconds' are less than 10, we write a '0' in front to get the desired structure
            if (seconds < 10) {
                System.out.print("0");
            }

            //Line break
            System.out.println(seconds);

            //We increase 'seconds'
            seconds++;

            //We check the time
            if (seconds == 60) {//If 'seconds' = 60
                //We need to reset 'seconds' to '0'
                seconds = 0;
                //And increase 'minutes'
                minutes++;
                if (minutes == 60) {//If 'minutes' = 60
                    //We need to reset 'minutes' to '0'
                    minutes = 0;
                    //And increase 'hours'
                    hours++;
                    if (hours == 24) {//If 'hours' = '24'
                        //We need to reset 'hours' and it will be '00:00:00' again
                        hours = 0;
                    }
                }
            }

            //It interrupts the program's execution in 1 sec to give realism to the clock
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }   
}