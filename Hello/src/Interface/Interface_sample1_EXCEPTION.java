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

public class Interface_sample1_EXCEPTION implements CalAdder, CalSuber {

	public void adder() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("첫번째 숫자");
			int x = sc.nextInt();
			System.out.println("두번째 숫자");
			int y = sc.nextInt();

			int sum = x + y;
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다");
		}
	}

	public void suber() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자");
		int x = sc.nextInt();
		System.out.println("두번째 숫자");
		int y = sc.nextInt();

		int sum = x - y;
		System.out.println(sum);
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다");
		}
	}

	public void muuuuuler() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자");
		int x = sc.nextInt();
		System.out.println("두번째 숫자");
		int y = sc.nextInt();

		int sum = x * y;
		System.out.println(sum);
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다");
		}
	}

	public static void main(String[] args) {
//		CalAdder ca = new CalAdder();  // 인터페이스 객체 생성 불가
//		ca.adder();
		Interface_sample1_EXCEPTION si = new Interface_sample1_EXCEPTION(); // 인스턴스 선언
		si.adder();
		si.muuuuuler();
		si.suber();
	}

}