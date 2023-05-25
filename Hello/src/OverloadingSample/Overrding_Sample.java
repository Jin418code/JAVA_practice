package OverloadingSample;

abstract class Super1 {
	public abstract void p(float x, int y);
}

// final class Super2 extends Super1 {  // [x] 이 코드 실행시 중간에 중단됨
class Super2 extends Super1 {
	void p(int x, double y) {
		System.out.println("Super2 p() is called");
	}

	@Override
	public void p(float x, int y) {
		System.out.println("Super1 p() is called");
	}
}

class Super3 extends Super2 {
	void p(int x, double y) {
		System.out.println("Super3 p() is called");
	}
}

public class Overrding_Sample {

	public static void main(String[] args) {
		Super3 s3 = new Super3();
		s3.p('k', 2.3); // 문자형 인자가 정수형으로 확장 해석
		s3.p(100, 4.8);
		s3.p(3.4f, 100);
		s3.p(8.4f, 500);

	}
}