package Book;

// p430 [이너클래스 내부에서 아우터 클래스의 필드/메서드사용]

//class A22 {
//	int a = 3;
//	int b = 4;
//
//	void abc() {
//		System.out.println("A클래스 메서드");
//	}
//
//	class B22 {
//		int a = 5;
//		int b = 6;
//
//		void abc() {
//			System.out.println("B클래스 메서드");
//		}
//
//		void bcd() {
//			System.out.println(a);
//			System.out.println(b);
//			abc();
//		}
//	}
//}
//
//public class L13 {
//	public static void main(String[] args) {
//		A22 a = new A22();
//
//		A22.B22 b = a.new B22();
//		b.bcd();
//		System.out.println(a.a);
//	}
//}

//p437_1 [인터페이스를 상속한 이너 클래스를 생성해 인터페이스 객체 생성]

//class A11 {
//	C11 c = new B11();
//
//	void abc() {
//		c.bcd();
//	}
//
//	class B11 implements C11 {
//		public void bcd() {
//			System.out.println("인스턴스 이너 클래스");
//		}
//	}
//}
//
//interface C11 {
//	public abstract void bcd();
//}
//
//public class L13 {
//	public static void main(String[] args) {
//		A11 a = new A11();
//		a.abc();
//	}
//}

//p437_2 [익명 이너 클래스를 활용해 인터페이스 객체 생성]
class A12 {
	C12 c = new C12() {

		public void bcd() {
			System.out.println("익명 이너 클래스");
		}
	};

	void abc() {
		c.bcd();
	}
}

interface C12 {
	public abstract void bcd();
}

public class L13 {
	public static void main(String[] args) {
		A12 a = new A12();
		a.abc();
	}
}

