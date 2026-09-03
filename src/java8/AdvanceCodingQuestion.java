package java8;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class AdvanceCodingQuestion {

	public static void main(String[] args) {
		String text = "babacb";
		String collect = text.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(k -> k, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.map(m -> m.getKey() + "" + m.getValue()).collect(Collectors.joining());
		System.out.println(collect);
	}
}
