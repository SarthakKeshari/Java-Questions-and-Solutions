/* Question: Given a string str, return the longest palindromic substring in str.
 * Time complexity:(n^2) and Space complexity:O(1)
 * The idea is to generate all even length and odd length palindromes
 * and keep track of the longest palindrome seen so far.
 */

import java.util.*;
public class LongestPalindromicSubs {
	public static String longestPalindrome(String s) {
		if(s==null || s.length()<1)
		 return "";
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int len1=expand(s,i,i);
            int len2=expand(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>end-start){
                start=i-((len-1)/2);
                end=i+(len/2);
            }
        }
        return s.substring(start,end+1);
	}
	public static int expand(String s,int left,int right){
        if(s==null||left>right) return 0;
        while(left>=0 && right<s.length()&& s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(longestPalindrome(str));
	}

}
