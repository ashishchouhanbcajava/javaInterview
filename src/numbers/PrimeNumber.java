package numbers;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 4;
		boolean prime = true;

		for (int i = 2; i <= n / 2; i++) {
			System.out.println("in the loop");
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		System.out.println(prime);
	}
}
