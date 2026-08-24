package stringCoding;

public class StringReverse {

	public static void main(String[] args) {
		String name = "Ashish";

//		StringBuilder builder = new StringBuilder(name);
//		System.out.println(builder.reverse());

//		System.out.println("length : " + name.length());
//		String name2 = "";
//		char[] charArray = name.toCharArray();
//		for (int i = charArray.length - 1; i >= 0; i--) {
//			name2 = name2 + charArray[i];
//		}
//		System.out.println("reversed : " + name2);

//		String n = "Raman";
//		System.out.println("Raman hashcode : " + n.hashCode());
//		n = n + "Aman";
//		System.out.println("Aman +raman hashcode : " + n.hashCode());
//
//		System.out.println(n);

		long start = System.currentTimeMillis();

		for (int i = 0; i <= 1000; i++) {
			name = name + " chouhan";
		}
		System.out.println("name  : " + name);
		long total = System.currentTimeMillis() - start;

		System.out.println("total time taken in string modification : " + (total / 1000.0) + " seconds");

		StringBuffer s = new StringBuffer("Amit");

		long start1 = System.currentTimeMillis();

		for (int i = 0; i <= 1000; i++) {
			s.append(" chouhan");
		}
		System.out.println("name  : " + s);
		long total1 = System.currentTimeMillis() - start1;

		System.out.println("total time taken in string buffer modification : " + (total1 / 1000.0) + " seconds");
	}
}
