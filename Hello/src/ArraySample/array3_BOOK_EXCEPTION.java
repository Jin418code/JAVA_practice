package ArraySample;

import java.util.Arrays;

public class array3_BOOK_EXCEPTION {

	public static void main(String args[]) {
		try {
			int value = 0;
			System.out.println(value);

			int[] value2 = null;
			System.out.println(value2);
			System.out.println();

			boolean[] array1 = new boolean[3];
			for (int i = 0; i < 3; i++) {
				System.out.print(array1[i] + " ");
			}
			System.out.println();

			int[] array2 = new int[3];
			for (int i = 0; i < 3; i++) {
				System.out.print(array2[i] + " ");
			}
			System.out.println();

			double[] array3 = new double[3];
			for (int i = 0; i < 3; i++) {
				System.out.print(array3[i] + " ");
			}

			System.out.println();
			String[] array4 = new String[3];
			for (int i = 0; i < 3; i++) {
				System.out.print(array4[i] + " ");
			}
			System.out.println();
			System.out.println();
			System.out.println("=================");

			System.out.println(array1); // Z@1d8d30f7
			System.out.println(array2); // 아래 모두
			System.out.println(array3); // 이렇게 주소가
			System.out.println(array4); // 찍힘

			System.out.println(Arrays.toString(array1)); // [false, false, false]
			System.out.println(Arrays.toString(array2)); // [0, 0, 0]
			System.out.println(Arrays.toString(array3)); // [0.0, 0.0, 0.0]
			System.out.println(Arrays.toString(array4)); // [null, null, null]
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
