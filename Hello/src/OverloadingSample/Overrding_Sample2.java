package OverloadingSample;

class Super4 {
	public int x = 100;
}

class Super5 extends Super4 {
	public int y = 200;
}

class Super6 extends Super5 {
	public int z = 300;
}

public class Overrding_Sample2 {

	public static void main(String[] args) {
		Super4 s1 = new Super4();
		Super5 s2 = new Super5();
		Super6 s3 = new Super6();

		System.out.println("s1의 변수 : " + s1.x);
		System.out.println("s2의 변수 : " + s2.x + " " + s2.y);
		System.out.println("s3의 변수 : " + s3.x + " " + s3.y + " " + s3.z);

	}
}