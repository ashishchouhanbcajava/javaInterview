package array;

public class FindMissingNumberInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5 };

		int n = arr.length + 1;
		int expectedSum = n * (n + 1) / 2;

		int sum = 0;
		for (int s : arr) {
			sum += s;
		}
		System.out.println("sum : " + expectedSum);
		System.out.println("missing number is : " + (expectedSum - sum));
	}
}
