package java8;

import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicatesInAnList {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 3, 4, 5, 2, 4,4);

		list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream()
				.filter(f -> f.getValue() > 1).forEach(System.out::println);
	}
}
