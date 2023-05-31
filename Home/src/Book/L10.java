package Book;

// p313 [클래스의 상속과 사용할 수 있는 멤버]
//class Human {
//
//	String name;
//	int age;
//
//	void eat() {
//	}
//
//	void sleep() {
//	}
//
//}
//
//class Student extends Human {
//	int studentID;
//
//	void goToSchool() {
//		System.out.println("school");
//	}
//}
//
//class Worker extends Human {
//	int workerID;
//
//	void goToWork() {
//		System.out.println("company");
//	}
//}
//
//public class L10 {
//	public static void main(String[] args) {
//
//		Human h = new Human();
//		h.name = "K";
//		h.age = 11;
//		h.eat();
//		h.sleep();
//		
//		System.out.println("================");
//
//		Student s = new Student();
//		s.name = "J";
//		s.age = 16;
//		s.studentID = 128;
//		s.eat();
//		s.sleep();
//		s.goToSchool();
//
//		System.out.println("================");
//		
//		Worker w = new Worker();
//		w.name = "w";
//		w.age = 45;
//		w.workerID = 128;
//		w.eat();
//		w.sleep();
//		w.goToWork();
//
//	}
//}

// =============================================================
// p325 [선언 타입에 따른 사용할 수 있는 멤버]

//class A00 {
//	int m = 3;
//	void abc() {
//		System.out.println("A");
//	}
//}
//
//class B00 extends A00{
//	int n = 4;
//	void bcd() {
//		System.out.println("B");
//	}
//}
//
//public class L10 {
//	public static void main(String[] args) {
//		A00 aa = new A00();
//		System.out.println(aa.m);
//		aa.abc();
//		
//		B00 bb = new B00();
//		System.out.println(bb.n);
//		bb.bcd();
//	}
//}

class aaa {
	static int a = 0;
	final static int b = 3;

	void A() {
		System.out.println("sss");
	}

	static void aa() {
		System.out.println(b);
	}
}

class L10 extends aaa {
	public static void main(String[] args) {

		aaa s2 = new aaa();
		bbb s3 = new bbb();
		s2.a = 5;
		int d = (s2.b + s2.a);

		System.out.println(aaa.a);
		System.out.println(d);

		s3.sss();
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}

class bbb extends aaa {
	void sss() {

	}
}