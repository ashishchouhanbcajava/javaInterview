package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveAllZerosToRight {

	public static void main(String[] args) {

		List<Integer> list = List.of(-1, -2, 3, 5, 0, 6, 2, 0, -3, 7, 0);
		List<Integer> asList = Arrays.asList(-1, -2, 3, 5, 0, 6, 2, 0, -3, 7, 0);

//		List<Integer> withOutZeroList = list.stream().filter(e -> e != 0).collect(Collectors.toList());
//		List<Integer> onlyZeroList = list.stream().filter(e -> e == 0).collect(Collectors.toList());
//		List<Integer> finalList = Stream.concat(withOutZeroList.stream(), onlyZeroList.stream())
//				.collect(Collectors.toList());
//		System.out.println(finalList);
//		list.stream().sorted();
		
		
		System.out.println(asList);

	}
}
