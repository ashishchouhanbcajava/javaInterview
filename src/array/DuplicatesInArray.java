package array;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {
	public static <E> void main(String[] args) {
		int arr[] = { 1, 1, 1, 2, 3, 2, 4, 2, 5, 6, 5, 3 };

		Set<Integer> duplicates = new HashSet<>();
		Set<Integer> seen = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (!seen.add(arr[i])) {
				duplicates.add(arr[i]);
			}

		}
		System.out.println(seen);
		System.out.println(duplicates);
	}
}
