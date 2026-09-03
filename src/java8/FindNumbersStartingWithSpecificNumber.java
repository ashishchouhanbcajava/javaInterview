package java8;

import java.util.Arrays;
import java.util.List;

public class FindNumbersStartingWithSpecificNumber {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 11, 22, 104);

		numbers.stream().filter(n -> String.valueOf(n).startsWith("1")).forEach(System.out::println);
	}
}
