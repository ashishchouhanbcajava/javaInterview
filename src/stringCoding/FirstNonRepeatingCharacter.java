package stringCoding;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "swiiws";

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//			System.out.println("character : " + entry.getKey() + "   value : " + entry.getValue());

			if (entry.getValue() == 1) {
				System.out.println(" first non repeating character : " + entry.getKey());
				break;
			}
			if (entry.getValue() != 1) {
				System.out.println(" Not found  ");
				break;
			}
//
			if (entry.getValue() > 1) {
				System.out.println(" first repeating character : " + entry.getKey());
				break;
			}
		}
	}
}
