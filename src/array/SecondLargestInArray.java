package array;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int arr[] = { 120, 30, 3, 5, 6, 5, 3 };
		int max = arr[0];
		int min = arr[0];
		int secondLargest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min : " + min);
		System.out.println("max : " + max);
		System.out.println("second max : " + secondLargest);

	}
	

}

//1 ->120
// 