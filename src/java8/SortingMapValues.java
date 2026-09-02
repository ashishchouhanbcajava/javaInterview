package java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingMapValues {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Ashish", 23);
		map.put("Aman", 30);
		map.put("Raman", 40);
		map.put("Rahul", 20);

		Map<String, Integer> collect = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
		collect.forEach((k, v) -> {
			System.out.println("key : " + k + "  Value : " + v);
		});
	}
}
