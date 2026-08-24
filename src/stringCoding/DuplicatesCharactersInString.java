package stringCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicatesCharactersInString {

	public static <V> void main(String[] args) {
		String n = "Javvvaaa";

//		Map<Character, Integer> map = new HashMap<>();
//		char[] charArray = n.toCharArray();
//		for (char c : charArray) {
//			map.put(c, map.getOrDefault(c, 0) + 1);
//		}
//
//		Set<Entry<Character, Integer>> entrySet = map.entrySet();
//		entrySet.forEach(e -> {
//			if (e.getValue() > 1) {
//				System.out.println("duplicate is : " + e.getKey() + "  and it occurs : " + e.getValue());
//			}
//		});
//		
////		
//		IntStream chars = n.chars();
//		chars.map
//		chars.mapToObj(null);
		List<Integer> list = Arrays.asList(1, 20, 13, 22, 4, 1);

//		Set<Integer> duplicates = list.stream().filter(m -> Collections.frequency(list, m) > 1)
//				.collect(Collectors.toSet());

//		System.out.println(duplicates);

//		Stream<Integer> stream = list.stream();
//		stream.forEach(System.out::println);

		Stream<Integer> map = list.stream().filter(x -> {
//			System.out.println("filter: " + x);
			return x > 10;
		}).map(e -> {
			return e * 2;
		}).sorted();
//		map.forEach(System.out::println);

		
		
		List<Integer> list2 = Arrays.asList(111, 20, 134, 22, 47, 10);

		list2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


//		.map(x -> {
//			System.out.println("map: " + x);
//			return x * 2;
//		}).forEach(System.out::println);

	}
}
