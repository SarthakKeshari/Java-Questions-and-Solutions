
import java.util.*;

public class Max_Freq_Character {

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(maxFreqChar(str));
		sc.close();

	}

	private static char maxFreqChar(String str) {
		
		HashMap<Character, Integer> map = new HashMap<>(); // creating a hashmap which store frequency of each characters
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.getOrDefault(ch,0)+1);    // incrementing frequency of each character
			}else {
				map.put(ch, 1);
			}
		}
		
		Set<Character> keys = map.keySet(); // making a set of distinct character(non repeating)
		char maxChar = ' ';
		int maxFreq = Integer.MIN_VALUE;
		for(char key: keys) {               // iterating each distinct character from the set
			if(map.get(key)>maxFreq) {      // getting frequency of each character and checking if it is the largest or not
				maxFreq = map.get(key);    // updating the maximum fequency of the character
				maxChar = key;             // updating the maximum occurring character
			}
		}
		return maxChar;
	}

}
