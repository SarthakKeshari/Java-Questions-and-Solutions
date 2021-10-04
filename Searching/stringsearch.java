// Seaching the character present in string or not
package com.company;

public class stringsearch {
    public static void main(String[] args) {
    String str= "hello word ";
    char want= 'k';
    boolean ans=ss(str,want );
    if (ans==true){
        System.out.println("Expected character is present in given string");
    }
    else {
        System.out.println("Expected character not there in given string");
    }

    }

    static boolean ss(String str,char target ){
        if(str.length()==0){  //if string length is 0
            return false;
        }
        for(int i=0;i<str.length();i++){ // finding the character in string
            if(target==str.charAt(i)){
                return true;
            }
        }
    return false;
    }
}

