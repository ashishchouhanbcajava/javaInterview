package stringCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReverseEveryWordInString {

	public static void main(String[] args) {
		String word = "I Love you i You";
		String[] split = word.split(" ");

		System.out.println("length : " + split.length);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < split.length; i++) {
			String string = split[i];
			char[] charArray = string.toCharArray();

			for (int j = charArray.length-1; j >= 0; j--) {
				result.append(charArray[j]);
			}
			result.append(" ");
//			StringBuilder builder = new StringBuilder(string);
//			result.append(builder.reverse() + " ");
		}
		System.out.println(result);

		
		
		
		

	}
}
