import java.util.*;

public class Partition_Labels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.next();

		List<Integer> res = partitionLabels(s);
		System.out.println("\nAns : ");
		for (int val : res) {
			System.out.print(val + " ");
		}
	}

	private static List<Integer> partitionLabels(String s) {
//		make hashmap 
		HashMap<Character, Integer> map = new HashMap<>();

//		take the each character and its value according to the position
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
//			here ch=key , i=value
			map.put(ch, i);
		}

//		make the result partition array
		List<Integer> res = new ArrayList<>();
//		take previous pointer for saparate two strings
		int prev = -1;
//		take the max variable for the know the last aperance of the character 
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
//			maximum from the last max value and the recently max value of the character
			max = Math.max(max, map.get(ch));
//			if the maximum is the equle to the index so there is upto one string available
			if (max == i) {
//				for know the length of the string (Max - Prev)
				res.add(max - prev);
//				update value of prev
				prev = max;
			}
		}
		return res;
	}

}
