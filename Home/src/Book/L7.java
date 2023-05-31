package Book;

import java.util.Arrays;
import java.util.Scanner;

// p224 [필드와 지역 변수의 구분]
//class ABBB {
//	int m = 3;
//	int n = 4;
//
//	void work1() {
//		int k = 5;
//		System.out.println(k);
//		work2(3);
//	}
//
//	void work2(int i) {
//		int j = 4;
//		System.out.println(i + j);
//	}
//}
//
//public class L7 {
//
//	public static void main(String[] args) {
//
//		ABBB a = new ABBB();
//		System.out.println(a.m);
//
//		System.out.println(a.n);
//
//		a.work1();
//		a.work2(0);
//	}
//
//}
//

//   ========================================================================================
//p 231 [클래스 외부에서의 메서드 호출]
//class methodTest2 {
//	void print() {
//
//	}
//
//	int data() {
//		return 3;
//	}
//
//	double sum(int a, double b) {
//		return a + b;
//	}
//
//}
//
//public class L7 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 입력");
//		int num1 = sc.nextInt();
//		double num2 = sc.nextInt();
//		
//		methodTest2 mt = new methodTest2();
//		mt.print();
//		int x = mt.data();
//		System.out.println(x);
//		
//		double sum = mt.sum(num1, num2);
//		System.out.println(sum);
//		
//	}
//}

//========================================================================================
// p237 [기본 자료형 입력매개변숫값의 변화]

//public class L7 {
//	public static void main(String[] args) {
//		int a = 3;
//		
//		int result1 = twice(3);
//		System.out.println(result1);
//		
//		int result2 = twice(a);
//		System.out.println(result2);
//		
//		System.out.println(a);
//	}
//	
//	public static int twice(int a) {
//		a = a * 2;
//		return a;
//	}
//}

//========================================================================================
//p238 [참조 자료형 매개변숫값의 변화]

//public class L7 {
//	public static void main(String[] ar) {
//		int[] array = new int[] { 1, 2, 3 };
//		printArray(array);  //// [1, 2, 3]
//		modifyData(array);
//		printArray(array);  //// [4, 5, 6]
//	}
//
//	public static void modifyData(int[] a) {
//		a[0] = 4;
//		a[1] = 5;
//		a[2] = 6;
//	}
//	
//	public static void printArray(int[] a) {
//		System.out.println(Arrays.toString(a));
//	}
//}

//========================================================================================
//p242 [메서드의 오버로딩]

//public class L7 {
//	public static void main(String[] args) {
//		print();
//		print(3);
//		print(5.8);
//		print(2, 5);
//	}
//
//	public static void print() {
//		System.out.println("no data");
//	}
//
//	public static void print(int a) {
//		System.out.println(a);
//	}
//
//	public static void print(double a) {
//		System.out.println(a);
//	}
//
////	public static void print(double b) {  // 위와 중복이어서 오류뜸
////		System.out.println(b);
////	}
//
//	public static void print(int a, int b) {
//		System.out.println("a = " + a + " b = " + b);
//	}
//}

//========================================================================================
//p245 [메서드의 가변 길이 배열 입력매개변수]

//public class L7 {
//	public static void main(String[] args) {
//		method1(1, 2);
//		method1(1, 2, 3);
//		method1();
//
//		method2("가", "나");
//		method2("가", "나", "다");
//		method2();
//	}
//
//	public static void method1(int... values) {
//		System.out.println("배열의 길이 : " + values.length);
//
////		// 배열 출력 방법 1
////		for(int i = 0; i < values.length; i++) {
////			System.out.println(values[i] + " ");
////		}
//
//		// 배열 출력 방법 2
//		for (int k : values) {
//			System.out.print(k + " ");
//		}
//
////		// 배열 출력 방법 3
////		System.out.println(Arrays.toString(values));
//
//		System.out.println();
//	}
//
//	public static void method2(String... values) {
//		System.out.println("배열의 길이 : " + values.length);
//
//		for (String k : values) {
//			System.out.print(k + " ");
//		}
//
//		System.out.println();
//	}
//}

//========================================================================================
//p251 [생성자]

//class A55 {
//	A55() {
//		System.out.println("1 생성자");
//	}
//	
//	A55(int a) {
//		System.out.println("2 생성자");
//	}
//	
//	A55(int a, int b) {
//		System.out.println("3 생성자");
//	}
//}
//
//public class L7 {
//	public static void main(String[] args) {
//		A55 a1 = new A55();
//		A55 a2 = new A55(3);
//		A55 a3 = new A55(3, 5);
//	}
//}

//========================================================================================
//p253 [묵시적 this 키워드 자동 추가]

//class A66 {
//	int m;
//	int n;
//
//	void init(int a, int b) {
//		int c;
//		c = 3;
//
//		this.m = a;  // 
//		this.n = b;  // 
//	}
//
//	void work() {
//		this.init(2, 3);
//	}
//}
//
//public class L7 {
//	public static void main(String[] args) {
//
//		A66 a = new A66();
//
//		a.work();
//		System.out.println(a.m);  // 2
//		System.out.println(a.n);  // 3
//	}
//}

//========================================================================================
//p259 [this(생성자 입력 매개변수) 활용]

class A77 {
	int m1, m2, m3, m4;

	A77() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}

	A77(int a) {
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}

	A77(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}

	void print() {
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4);
		System.out.println();
	}
}

class B77 {
	int m1, m2, m3, m4;

	B77() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}

	B77(int a) {
		this(); // B()생성자 호출
		m1 = a;
	}

	B77(int a, int b) {
		this(a);
		m1 = b;
	}
	
//	B77(int a, int b) {  // B()생성자를 호출하고
//		this();        // 두 필드 값을 한번에 수정 가능
//		m1 = a;
//		m2 = b;
//	}
	
	void print() {
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4);
		System.out.println();
	}
}

public class L7 {
	public static void main(String[] args) {
		
		// 3가지 객체 생성(this() 미사용)
		A77 a1 = new A77();
		A77 a2 = new A77(10);
		A77 a3 = new A77(10, 20);
		System.out.println("this() 미사용");
		a1.print();
		a2.print();
		a3.print();
		System.out.println();
		
		
		// 3가지 객체 생성(this() 사용)
		B77 b1 = new B77();
		B77 b2 = new B77(10);
		B77 b3 = new B77(10, 20);
		System.out.println("this() 사용");
		b1.print();
		b2.print();
		b3.print();
	}
}
