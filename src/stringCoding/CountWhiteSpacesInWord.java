package stringCoding;

public class CountWhiteSpacesInWord {

	public static void main(String[] args) {
		String word = "I Am Ashish And I Am Java Developer";
		char[] charArray = word.toCharArray();
		int count = 0;
		for (char c : charArray) {
			if (Character.isWhitespace(c)) {
				count++;
			}
//			if (c == ' ') {
//				count++;
//			}
		}
		System.out.println("here are the total Whitespaces : " + count);
	}

}
