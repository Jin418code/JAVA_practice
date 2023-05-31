package Book;

// [ㅇㅇ]
//interface A {
//	public static int a = 3;
//
//	public abstract void abc();
//}
//
//interface B {
//	int b = 3;  // 생략을 해도 자동으로 public static final
//	void bcd();  // 
//}
//
//public class L12 {
//	public static void main(String[] args) {
//		
//		System.out.println(A.a);
//		System.out.println(B.b);
//		
////		A.a = 5;  // final이기에 안됨
////		B.b = 6;  // final이기에 안됨
//	}
//}

// ==========================================================
// p400 [추상클래스의 객체 생성 방법 익명 이너 클래스 활용하기]

abstract class A {
	abstract void abc();
}

public class L12 {
	public static void main(String[] args) {
		
		A a1 = new A() {
			void abc() {
				System.out.println("익명의 이너클래스 방법으로 객체 생성");
			}
		};
		
		A a2 = new A() {
			void abc() {
				System.out.println("익명의 이너클래스 방법으로 객체 생성");
			}
		};
		
		a1.abc();
		a2.abc();
	}
}