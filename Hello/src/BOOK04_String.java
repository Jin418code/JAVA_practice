import java.util.Scanner;

public class BOOK04_String {

	public static void main(String[] args) {

		String x = "hello"; // String x = new String("hello")와의 차이
		String y = "java";
		String z = "hello";

		boolean result = (x == y);  // 값을 비교
		System.out.println(result); // false

		boolean result2 = (x == z);  // 값을 비교
		System.out.println(result2); // true //  String x = new String("hello"); 로 생성시 false
											 //  이 둘의 차이를 인지할것 				
		
		if (x.equals(y)) {
			System.out.println("동일합니다.");
		} else {
			System.out.println("동일하지 않습니다.");
		}  // 동일하지 않습니다.

		if (x.equals(z)) { 
			System.out.println("동일합니다.");
		} else {
			System.out.println("동일하지 않습니다.");
		}  // 동일합니다.

		System.out.println(x == z); // true

		String x2 = "hello";
		String y2 = new String("hello");

		System.out.println(x2.equals(y2)); // true 
		System.out.println(x2 == y2); // false
	}

}
