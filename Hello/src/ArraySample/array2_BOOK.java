package ArraySample;

public class array2_BOOK {

	public static void main(String args[]) {

		int[] array1 = new int[3];

		int[] array2;
		array2 = new int[3];

		int array3[] = new int[3];

		int array4[];
		array4 = new int[3];

		boolean[] array5 = new boolean[3];

		int[] array6 = new int[5];

		double[] array7 = new double[7];

		String[] array8 = new String[9];
		

		
		int[] array9 = new int[3];
		array9[0] = 300;
		array9[1] = 400;
		array9[2] = 500;
		
		for(int i = 0; i < array9.length; i++) {
			System.out.println("배열 : " + array9[i]);
		} // 아래와 같은 결과
		
		System.out.println("====================");
		
		// 가변 for문 (현업에서 많이 사용)
		for(int array9Value:array9) {
			System.out.println("array배열 : " + array9Value);
		}
		
		System.out.println("====================");
		
		// 자료형 참조 변수명 = new 자료형 [] {100, 200, 300, 400, 500};
		int[] array10 = new int[] {100, 200, 300, 400, 500};
		
		// 위 아래 같음
//		int[] array10; 
//		array10 = new int[] {100, 200, 300, 400, 500};
		
//		하지만 이렇게는 안 됨 / 메모리 할당을 받지 못한 상태임
//		int[] array10; 
//		array10 = {100, 200, 300, 400, 500};
		
		for(int i = 0; i < array10.length; i ++) {
			System.out.println("array10 배열 : " + array10[i]);
		}
		
		int value3 = 0;
		System.out.println(value3);
		
		int[] value4 = null;
		System.out.println(value4);
		System.out.println();

	}
}
