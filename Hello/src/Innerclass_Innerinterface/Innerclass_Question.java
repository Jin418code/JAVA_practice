package Innerclass_Innerinterface;

// [문제

// data는 추상클래스이거나 인터페이스 상태
// data = 50000원이 저축되어있습니다.
// 익명 클래스를 사용하여 5만원을 출력해보세요.

//interface BankAccount {
//	public abstract void countAccount();
//}
//
//class Output {
//	
//	BankAccount ba = new BankAccount() {
//		
//		public void countAccount() {
//			System.out.println("50000원이 저축 되어있습니다.");
//		}
//	};
//
//	void print() {
//		ba.countAccount();
//	}
//}
//
//public class Innerclass_Question {
//	public static void main(String[] args) {
//		Output op = new Output();
//		op.print();
//	}
//}

// [답]
abstract class dataClass {
	int data = 50000;
	public abstract void printData();
}

class Outer{
	dataClass inner = new dataClass() {
		public void printData() {
			System.out.println("data : " + data);
		}
	};  // 익명 클래스????????????????? 왜???????????????????
}

public class Innerclass_Question {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.inner.printData();
	}
}