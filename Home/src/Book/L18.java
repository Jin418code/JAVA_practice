package Book;

public class L18 {

	interface A { // 입력 x, 리턴 x
		void method1();
	}

	interface B { // 입력 o, 리턴 x
		void method2(int a);
	}

	interface C { // 입력 x, 리턴 o
		void method3();
	}

	interface D { // 입력 o, 리턴 o
		double method4(int a, double b);
	}

	public static void main(String[] args) {
		// 인터페이스의 함수 구현 -> 람다식
		// 1. 입력 x, 리턴 x
		// 1-1. 익명 이너 클래스 방식

		A a1 = new A() {
			
			public int bb = 0;
			public int aa = 0;
			@Override
			public void method1() {
				System.out.println("입력 x 리턴 x 함수");
			}
		};
		// 1-2. 람다식 표현
		A a2 = () -> {
			System.out.println("입력 x 리턴 x 함수");
		};

		A a3 = () -> System.out.println("입력 x 리턴 x 함수");  // 1줄 명령이면 중괄호 생략 가능
		
		// 2. 입력 o, 리턴 x
		// 2-1/
	}
}
