package GenericSample;

/*
 * 
 * 
 */
public class Vector_1 {

	
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
