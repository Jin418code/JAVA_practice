
public class J3_literal {

	public static void main(String[] args) {

		int a = 1; // 4byte 메모리 변수 a에 100을 저장
		System.out.println("a = " + a);
		
		int b = 200;
		System.out.println("b = " + b);
		
		a = b;
		System.out.println("a value = " + a);
		
		// 변수의 값을 재할당(변경)
		a = 1000;
		b = 2000;
		
		int c = a + b;
		System.out.println("a + b = " + c);
		
		int d = 10;
		d = d + 20; // 산술연산자 
		System.out.println(d);
	}

}
