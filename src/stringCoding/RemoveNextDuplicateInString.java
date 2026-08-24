package stringCoding;

public class RemoveNextDuplicateInString {
	public static void main(String[] args) {
		String n = "Ashhishh";
		String m = "";
		char[] array = n.toCharArray();
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1] ) {
				m += array[i];
			}
		}

		m += array[array.length - 1];
		System.out.println("name : " + m);
	}
}
