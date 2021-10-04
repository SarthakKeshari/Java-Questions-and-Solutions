//replacing pi with 3.14

public class replacepi {
   //Here we search the characterand if it match we change
    public static String pi(String str) {
        if(str.length()<2){
            return str;
        }
        else{
            String firsttwo=str.substring(0, 2);
            if(firsttwo.equals("pi")){
                return "3.14"+pi(str.substring(2));
            }
            else{
                return str.charAt(0)+pi(str.substring(1));
            }
        }
    }


    public static void main(String[] args) {
        String str="xpix";
        String ans=pi(str);
        System.out.println(ans);
    }
}
