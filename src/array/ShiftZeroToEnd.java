package array;

import java.util.Arrays;

public class ShiftZeroToEnd {
	public static void main(String[] args) {

//		int arr[] = new int[2];
		int arr[] = { 0, 0, 1, 2, 3 };
		int index = 0;
//		System.out.println("array length : " + arr.length);
//
//		System.out.println("array : " + arr);
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 0 && arr.length-1>0) {
//				arr[i] = arr[i + 1];
//				arr[i + 1]=0;
//			}
//		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}
			System.out.println("indexxx : " + index);
		}
		System.out.println("after shifting : " + Arrays.toString(arr));

		while (index <arr.length) {
			arr[index++] = 0;
		}
		System.out.println("after all shifting : " + Arrays.toString(arr));
	}
}
