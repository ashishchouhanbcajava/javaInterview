package arrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;

class ListComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1 - o2;
	}

}

public class ArrayListImpl {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, Exception, IllegalAccessException {

		ArrayList<Integer> list = new ArrayList<>();
//		System.out.println("size of list : " + list.size());
		Field declaredField = ArrayList.class.getDeclaredField("elementData");
		declaredField.setAccessible(true);

		Object[] arr = (Object[]) declaredField.get(list);
//		System.out.println("default capacity before adding element : " + arr.length);

//		Field declaredField2 = ArrayList.class.getDeclaredField("DEFAULT_CAPACITY");
//		declaredField2.setAccessible(true);
//		int capacity=(int) declaredField2.get(list);
//		

//		list.add(1);

		Object[] arr1 = (Object[]) declaredField.get(list);

//		System.out.println("capacity after adding element : " + arr1.length);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(6);
		
		list.get(2);
//		list.add(1);
//		list.add(1);
//		list.add(1);
//		list.add(1);

		Object[] arr2 = (Object[]) declaredField.get(list);

//		System.out.println("capacity after adding 10 elements : " + arr2.length);

		list.trimToSize();

		Object[] arr3 = (Object[]) declaredField.get(list);

//		System.out.println("capacity after trimming : " + arr3.length);
//		System.out.println("size before end : " + list.size());

//		list.remove(Integer.valueOf(1));
//		System.out.println("size at end : " + list.size());

//		System.out.println("list before sorting : " + list);

		list.sort(null);
//		Integer[] array = list.toArray(new Integer[list.size()]);

		// sort an array in ascending order
		int[] array = { 7, 2, 4, 5, 3, 1, 6 };

		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] > array[i + 1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println("element ascending sorted :  " + array[i]);
		}

//		for (int i = 0; i < array.length - 1; i++) {
//			if (array[i] < array[i + 1]) {
//				int temp = array[i];
//				array[i] = array[i + 1];
//				array[i + 1] = temp;
//			}
//		}
//		2,1,4,3,5,7,6--1st
//		2,4,1,3,5,7,6--2nd

//		for (int i = 0; i < array.length; i++) {
//			System.out.println("element descending sorted :  " + array[i]);
//		}

	}
}
