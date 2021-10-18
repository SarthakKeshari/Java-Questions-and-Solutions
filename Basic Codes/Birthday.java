//Birthday Paradox problem
class HBD {
    static double find(double p) {
        return Math.ceil(Math.sqrt(2 * 365 * Math.log(1 / (1 - p))));
    }

    //Driver
    public static void main(String[] args){

        System.out.println(find(0.70));
    }
}