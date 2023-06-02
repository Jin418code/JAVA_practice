package OverloadingSample;

class A {
	int m;

	void work() {
		System.out.println(m);
	}
}

class B {
	int m;

	void work() {

	}

	B() {

	}
}

class C {
	int m;

	void work() {
		System.out.println(m);
	}

}

public class Overrding_Sample4_BOOK_249 {
	public static void main(String[] args) {

		A a = new A();
		B b = new B();
//		C c = new C(3);

		C c = new C();

	}

}