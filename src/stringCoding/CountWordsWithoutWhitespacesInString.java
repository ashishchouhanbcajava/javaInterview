package stringCoding;

public class CountWordsWithoutWhitespacesInString {
	public static void main(String[] args) {
		String word = "I Am Ashish And I Am Java Developer";
		char[] charArray = word.toCharArray();
		int count = 0;
		for (char c : charArray) {
			if (!Character.isWhitespace(c)) {
				count++;
			}
		}
		System.out.println("here are the total words : " + count);
	}
}
