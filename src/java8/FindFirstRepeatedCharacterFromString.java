package java8;

import java.util.stream.Collectors;

public class FindFirstRepeatedCharacterFromString {

	public static void main(String[] args) {
		String name = "Ashish";

		Character key = name.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream()
				.filter(r -> r.getValue() > 1).findFirst().get().getKey();

		System.out.println("here is first repeating character : " + key);
	}
}
