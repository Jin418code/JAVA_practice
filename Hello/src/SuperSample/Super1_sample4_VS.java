package SuperSample;

class Shape111 {
	public void draw() {
		System.out.println("모양을그립니다");
	}

	public void delete() {
		System.out.println("모양을지웁니다");
	}
}

class Circle111 extends Shape111 {
	public void draw() {
		System.out.println("원을 그립니다");
	}

	public void delete() {
		System.out.println("원을 지웁니다");
	}

	public void sayCircle() {
		System.out.println("안녕하세요 원입니다");
	}
}

public class Super1_sample4_VS {
	public static void main(String[] args) {
		Shape111 s = new Shape111();
		s.draw();  // 모양을그립니다
		s.delete();  // 모양을지웁니다
		System.out.println();
		
//클래스의 기본적인 사용법
		Circle111 c = new Circle111();
		c.draw();  // 원을 그립니다
		c.delete();  // 원을 지웁니다
		c.sayCircle();  // 안녕하세요 원입니다
		System.out.println();
		
//Upcasting의 사용
		Shape111 c1 = new Circle111();
		c1.draw();  // 원을 그립니다
		c1.delete();  // 원을 지웁니다
		
//c1.sayCircle(); //에러가 발생합니다.
		System.out.println();
		
//		Circle111 cc = new Shape111()p;  // 에러 발생
	}
}
