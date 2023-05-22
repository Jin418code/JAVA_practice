import java.util.Scanner;

public class BOOK05_String {

	public static void main(String[] args) {

		int a = 100;
		
		// Integer : wrapper class 
		// 정수형 데이터 100을 2진수로 변환하여 data1에 저장
		String data1 = Integer.toBinaryString(a);
		System.out.println(data1);  // 1100100 => 64 + 32 + 4
		
		String data2 = Integer.toOctalString(a);
		System.out.println(data2);  // 144 
		
		String data3 = Integer.toHexString(a);
		System.out.println(data3);  // 64
		
		int b = Integer.parseInt("1100100", 2);
		System.out.println(b);
		
		int b2 = Integer.parseInt("144", 8);
		System.out.println(b2);
		
		int b3 = Integer.parseInt("64", 16);
		System.out.println(b3);
	}

}
