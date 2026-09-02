package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindWordsStartsWithSpecificAlphabetFromSentence {

	public static void main(String[] args) {

		String sentence = "Apple Banana Mango Bike Balloon";
		String[] split = sentence.split(" ");
		List<String> list = Arrays.asList(split);
		List<String> collect = list.stream().filter(c -> c.toLowerCase().startsWith("b")).collect(Collectors.toList());

		System.out.println(collect);
	}
}
