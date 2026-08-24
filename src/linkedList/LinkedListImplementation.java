package linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class LruCache extends LinkedHashMap<Integer, String> {

	private static final long serialVersionUID = 1L;

	private int capacity;

	public LruCache(int capacity) {
		// TODO Auto-generated constructor stub
		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}

	@Override
	protected boolean removeEldestEntry(Entry<Integer, String> eldest) {
		// TODO Auto-generated method stub
		return size() > capacity;
	}

}

public class LinkedListImplementation {

	public static int[] twoSum(int[] transactions, int target) {
//		400, 200, 300, 300, 450, 100
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < transactions.length; i++) {

			int required = target - transactions[i];

			if (map.containsKey(required)) {
				return new int[] { map.get(required), i };
			}

			map.put(transactions[i], i);
			// 400,0
			//
		}

		return new int[] { -1, -1 };
	}

	public static int[] twoSum2(int[] transactions, int target) {

		for (int i = 0; i < transactions.length; i++) {
			for (int j = i + 1; j < transactions.length; j++) {

				if (transactions[i] + transactions[j] == target) {
					return new int[] { i, j };
				}

			}
		}

		return new int[] {};
	}

	public static int[] topKplayers(int[] scores, int k) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < scores.length; i++) {
			list.add(scores[i]);
		}
		list.sort(Comparator.reverseOrder());

		int[] result = new int[k];

		for (int i = 0; i < k; i++) {
			result[i] = list.get(i);
		}

		return result;
	}

	public static int[] accendingSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	public static int[] decendingSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	public static int[] topKplayers2(int[] scores, int k) {

		Arrays.sort(scores);

		int[] result = new int[k];

//		400, 200, 300, 300, 450, 100
		for (int i = 0; i < k; i++) {
			result[i] = scores[scores.length - 1 - i];
		}

		return result;
	}

	public static <E> void main(String[] args) {

//		LinkedList<Integer> list = new LinkedList<>();
//		long currentTimeMillis = System.currentTimeMillis();
//		System.out.println("before adding element");
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(0, null);
//		list.get(2);

//		LruCache lruCache = new LruCache(3);
//		lruCache.put(1, "A");
//		lruCache.put(2, "B");
//		lruCache.put(3, "C");
//		System.out.println("cache : " + lruCache.toString());
//
//		lruCache.get(1);
//
//		System.out.println("cache : " + lruCache.toString());
//
//		lruCache.put(4, "D");
//
//		System.out.println("cache : " + lruCache.toString());

		int[] transactions = { 400, 200, 300, 300, 450, 100 };
		int[] twoSum = twoSum2(transactions, 600);
//		for (int i = 0; i < twoSum.length; i++) {
//			System.out.println(twoSum[i]);
//		}

//		int[] topKplayers = topKplayers2(transactions, 2);
//		for (int i = 0; i < topKplayers.length; i++) {
//			System.out.println(topKplayers[i]);
//		}

		for (int i = 0; i < transactions.length; i++) {
			System.out.println("element : " + transactions[i]);
		}
		System.out.println("after sorting ....");

		int[] sort = decendingSort(transactions);
		for (int i = 0; i < sort.length; i++) {
			System.out.println("element : " + sort[i]);
		}

	}

}
