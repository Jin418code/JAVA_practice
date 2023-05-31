package Interface;

import java.util.Scanner;


//interface A {
//	void abc();
//
//
//}
//
//class B implements A {
//	void abc() { // default 접근 지정자를 가지는 메서드로 오버라이딩
//	}
//}

public class interface_sample1 implements CalAdder,CalSuber {
	
	public void adder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자");
		int x = sc.nextInt();
		System.out.println("두번째 숫자");
		int y = sc.nextInt();
		
		int sum = x + y;
		System.out.println(sum);
	}
	
	
	public void suber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자");
		int x = sc.nextInt();
		System.out.println("두번째 숫자");
		int y = sc.nextInt();
		
		int sum = x - y;
		System.out.println(sum);

	}
	public void muuuuuler() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자");
		int x = sc.nextInt();
		System.out.println("두번째 숫자");
		int y = sc.nextInt();
		
		int sum = x * y;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
//		CalAdder ca = new CalAdder();  // 인터페이스 객체 생성 불가
//		ca.adder();
		interface_sample1 si = new interface_sample1();  // 인스턴스 선언
		si.adder();
		si.muuuuuler();
		si.suber();
	}


}