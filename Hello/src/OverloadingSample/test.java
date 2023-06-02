package OverloadingSample;

class A111 {
	static int speed;
	
	int Car(int speed) {
		this.speed = speed;
		return speed;
	}
	
}

public class test {
	public static void main(String[] args) {
		test111 A = new test111();
		test222 B = new test222();
		
		A.main();
		B.main1();
	}

}
class test111 {
	public static void main() {

		A111 mycar = new A111();
		mycar.speed = 100;
		
		System.out.println(mycar.speed);
	}

}
class test222{
	public static void main1() {

		A111 mycar1 = new A111();

		System.out.println(mycar1.speed);
	}

}