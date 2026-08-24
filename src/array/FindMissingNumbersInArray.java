package array;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumbersInArray {
	public static <E> void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 8, 10 };

		int min = arr[0];
		int max = arr[0];

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
			if (arr[i] < arr[0]) {
				min = arr[i];
			} else if (arr[i] > arr[0]) {
				max = arr[i];
			}
		}

		System.out.println(set);

		for (int i = min; i <= max; i++) {
			if (!set.contains(i)) {
				System.out.println("missing numbers in array : " + i);
			}
		}

	}
}
