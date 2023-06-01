package Exception;
import java.util.Scanner;

public class ExceptionSample2 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("searching index");
		int input = sc.nextInt();
		
		
		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println(numbers[5]); // Accessing index 5, which doesn't exist
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("An exception occurred: " + e);
		}
	}
}