public class Generic1 {
/*
	// 정수형 데이터 처리
	private static void printArray(Integer[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}
	
	// 실수형 데이터 처리
	private static void printArray(Double[] doubleArray) {
		for (double i = 0; i < doubleArray.length; i++) {
			System.out.print(doubleArray[(int) i] + " ");
		}
	}
	
	// 문자열 데이터 처리
	private static void printArray(String[] stringArray) {
		for (String element: stringArray) {
			System.out.print(element + " ");
		}
	}
	*/  
	// 위의 긴 코드를 아래의 제네릭으로 커버 가능
	
/*	public static void printArray(Object[] OArray) {
		for (Object element: OArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}*/
	
	public static <T> void printArray(T[] TArray) {
		
		for(T element : TArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] intArray = { 10, 20, 30, 40, 50 };
		printArray(intArray);
		
		System.out.println("==========================");

		Double[] doubleArray = { 10.1, 20.2, 30.3, 40.4, 50.5 };
		printArray(doubleArray);
		
		System.out.println("==========================");
		
		String[] stringArray = { "A" , "B", "C", "D", "E" };
		printArray(stringArray);
	}

}
