package java8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 5, 7, 9, 6 };

		IntStream stream = Arrays.stream(arr1);
//		Stream<Integer> integerArray1 = stream.mapToObj(int::new);
		IntStream stream2 = Arrays.stream(arr2);
//		Stream<Integer> integerArray2 = stream2.mapToObj(Integer::new);
		Object[] array = Stream.concat(stream.boxed(), stream2.boxed()).toArray();

		for (int i = 0; i < array.length; i++) {
			System.out.println("here is elements : " + array[i]);
		}
	}
}
