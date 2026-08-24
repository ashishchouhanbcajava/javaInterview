package stringCoding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicatesInString {

	public static <V> void main(String[] args) {
		String n = "Ashhishh";
		String mn = "";
		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] array = n.toCharArray();

		for (int i = 0; i < array.length; i++) {
			map.put(array[i], map.getOrDefault(array[i], 0) + 1);
		}

		Set<Entry<Character, Integer>> set = map.entrySet();

		for (Map.Entry<Character, Integer> m : set) {
//			System.out.println("word : " + m.getKey() + " occurs : " + m.getValue());
//			Integer value = m.getValue();
//			if (value > 0 && value <= 2) {
//				System.out.println("in value ");
//				mn += m.getKey();
//			}

			mn += m.getKey();
		}
		System.out.println(mn);
	}
}
