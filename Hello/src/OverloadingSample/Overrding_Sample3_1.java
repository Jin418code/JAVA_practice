package OverloadingSample;

class A1 {
	int d1;
	int s;
	
	A1(int s1) {
		System.out.println("클래스 A1의 생성자수행");
		s = s1;
		d1 = s * s;
	}
}

class A2 extends A1 {
	int d2;
	int t;
	
	A2(int s1, int t1) {
		super(s1);  // 슈퍼클래스 생성자 명시적 호출
		System.out.println("클래스 A2의 생성자수행");
		t = t1;
		d2 = t * t;
	}
}

public class Overrding_Sample3_1 {
	public static void main(String[] args) {
		
		A2 super2 = new A2(10,20);
		System.out.println("10의 제곱은 : " + super2.d1);
		System.out.println("20의 제곱은 : " + super2.d2);
	}
}