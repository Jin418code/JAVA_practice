package ArraySample;

public class array1 {

	public static void main(String args[]) {

		int myintarray[] = { 100, 32, 33, 55, 67 };
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("배열 : " + myintarray[i]);
			sum += myintarray[i];
		}
		System.out.println("배열의 합계는 = " + sum);

		double average = sum / myintarray.length;
		System.out.println("배열의 합계는 = " + average);
		System.out.print("\n");

		for (int value : myintarray) {
			System.out.println("배열 : " + value);
		}
	}
	
	String my[];
	String[] aaa;

} // 같은 결과 나옴
