package stringCoding;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GroupSimilarStringBasedOnAnagram {

	public static void main(String[] args) {
//		List<String> list = List.of("Aman", "Pan", "Nama", "nap");
//
//		Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(e -> e.length()));
//		Collection<List<String>> values = collect.values();
//		values.forEach(System.out::print);

//		int arr[] = { 10, 50, 100, 6, 90 };
//
//		int largest = arr[0];
//		int secondLargest = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > largest) {
//				secondLargest = largest;
//				largest = arr[i];
//			} else if (arr[i] > secondLargest && arr[i] != largest) {
//				secondLargest = arr[i];
//			}
//
//		}
//		System.out.println("largest in array : " + largest);
//		System.out.println("second largest : " + secondLargest);

		// removing spaces
//Approach 1 :
		String name = "My name is Ashish";

//		char[] charArray = name.toCharArray();
//		StringBuilder newName = new StringBuilder();
//		for (int i = 0; i < charArray.length; i++) {
//			System.out.println(charArray[i]);
//			if (charArray[i] != ' ') {
//				newName.append(charArray[i]);
//			}
//		}
//		System.out.println(newName);

		// Approach 2

//		String replacedString = name.replace(" ", "");
//		System.out.println(replacedString);

		// reverse every word in string

//		String[] split = name.split(" ");
//		StringBuilder builder = new StringBuilder();
//		for (String s : split) {
//			char[] charArray = s.toCharArray();
//			for (int i = charArray.length - 1; i >= 0; i--) {
//				builder.append(charArray[i]);
//			}
//		}

//		System.out.println(name);
//		System.out.println(builder);

//		finding largest ,second largest amd third largest and smallest ,second smallest third smallest in arrray

//		int arr[] = { 100, 200, 50, 90, 190 };
//
//		int largest = arr[0];
//		int secondLargest = 0;
//		int thirdLargest = 0;
//
//		int smallest = arr[0];
//		int secondSmallest = 0;
//		int thirdSmallest = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (largest < arr[i]) {
//
//				System.out.println("i m in if in iteration : " + i);
//				thirdLargest = secondLargest;
//				secondLargest = largest;
//				largest = arr[i];
//			} else if (secondLargest < arr[i] && arr[i] != largest) {
//				System.out.println("i m in elseif in iteration :  " + i);
//
//				thirdLargest = secondLargest;
//				secondLargest = arr[i];
//			}
//
//			if (smallest > arr[i]) {
//				thirdSmallest = secondSmallest;
//				secondSmallest = smallest;
//				smallest = arr[i];
//			} else if (arr[i] < secondSmallest && arr[i] != smallest) {
//
//				thirdSmallest = secondSmallest;
//				secondSmallest = arr[i];
//			}
//		}
//
//		System.out.println("largest element in array : " + largest);
//		System.out.println("second largest element in array : " + secondLargest);
//		System.out.println("third largest element in array : " + thirdLargest);
//
//		System.out.println("smallest in array : " + smallest);
//		System.out.println("second smallest in array : " + secondSmallest);
//		System.out.println("third smallest in array : " + thirdSmallest);

		/** frequency of each word in a string **/
//		String text = "i love java";
//		String replace = text.replace(" ", "");
//		String[] split = replace.split("");
//
//		List<String> list = Arrays.asList(split);
//		System.out.println("list : " + list);
//		list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k, v) -> {
//			System.out.println("text  " + k + "  occurs : " + v);
//		});

//		System.out.println(text);
//		text.chars().mapToObj(t -> (char) t).filter(c -> !c.equals(' '))
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k, v) -> {
//					System.out.println("text  " + k + "  occurs : " + v);
//				});
////

		/** Duplicate characters in a string **/
//		text.chars().mapToObj(t -> (char) t).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//				.entrySet().stream().filter(e -> !e.getKey().equals(' ') && e.getValue() > 1)
//				.forEach(System.out::println);

		/** Duplicate words in a string **/
//		String text2 = "I love java and java";
//
//		String[] split2 = text2.split(" ");
//		List<String> list2 = Arrays.asList(split2);
//		System.out.println(list2);
//
//		list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k, v) -> {
//			System.out.println(k + "  occurs : " + v);
//		});

		/** First non repeating character in a String **/

		String character = "holleoh";
//		Optional<Character> findFirst = character.chars().mapToObj(e -> (char) e)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
//				.filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
//
//		System.out.println(" First non repeating charaxter : " + findFirst.get());

//		IntStream chars = character.chars();

		/** first non repeating character from end of the string **/
//		Character key = IntStream.range(0, character.length())
//				.mapToObj(i -> character.charAt(character.length() - 1 - i))
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
//				.filter(e -> e.getValue() == 1).findFirst().get().getKey();
//		findFirst.isPresent(System.out::print);

//		System.out.println(" textttttttttttttt : " + key);

		/** longest string in an array using stream reduce method **/
		String[] ar = { "name", "Ashishh", "Aakash", "I am jaaavaaaaaa" };

		String string = Arrays.stream(ar).reduce((a, b) -> a.length() > b.length() ? a : b).get();

//		System.out.println("longest string : " + string);

//		List<Integer> list = List.of(1,2);

//		Optional<Integer> ans = list.stream().reduce((a, b) -> a + b);

//		System.out.println(ans);

		/*** Reverse a number in string ***/

		int number = 456;

		int remainder, reverse = 0;
		while (number != 0) {

			remainder = number % 10;
			System.out.println("remainder :  " + remainder);
			reverse = reverse * 10 + remainder;
			System.out.println("reversed : " + reverse);
			number = number / 10;
			System.out.println("number : " + number);
		}
		System.out.println("reversed after all  : " + reverse);

	}
}
