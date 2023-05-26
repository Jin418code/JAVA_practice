package OverloadingSample;

class Super111 {
	int x = 12;

	void p() {
		System.out.println("Super1 p() is called");
	}
}

class Super222 extends Super111 {
	int x = 24;

	void p() {
		System.out.println("Super2 p() is called");
	}

	void test() {
		System.out.println(" super x = " + super.x);
		System.out.println(" current x = " + x);
		super.p(); // 상위 클래스 p() 호출
		this.p(); // 현재 클래스 p() 호출
	}
}

public class SuperTest1 {
	public static void main(String[] args) {
		Super222 s2 = new Super222();
		s2.test();
	}
}
