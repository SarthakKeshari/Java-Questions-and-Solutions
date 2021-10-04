//Replacing the char"pi" with the value "3.14". if not no change
public class replacepi {
   
    //This function is main logic of the solution woth replace the "pi" with "3.14".
    public static String pi(String str) {
        if(str.length()<2){ //base case
            return str;
        }
        else{
            String firsttwo=str.substring(0, 2);
            if(firsttwo.equals("pi")){  //if "pi" is found than replace
                return "3.14"+pi(str.substring(2));
            }
            else{
                return str.charAt(0)+pi(str.substring(1)); //"if not than no change"
            }
        }
    }
    public static void main(String[] args) {
        String str="xpix"; // The string 
        String ans=pi(str);
        System.out.println(ans);
    }
}
