package array;

public class LargestInArray {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 40, 5, 60, 69 };
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min : " + min);
		System.out.println("max : " + max);

	}
}
