package OverloadingSample;

public class Overloading0 {

	private float plus(float f, float g) {
		float sum = f + g;

		return sum;
	}

	private int plus(int i, int j) {
		int sum = i + j;

		return sum;
	}

	private double plus(double d, double e) {
		double sum = d + e;

		return sum;
	}

	public static void main(String[] args) { // 오버로딩
		Overloading0 so = new Overloading0();

		int sum1 = so.plus(30, 50);
		float sum2 = so.plus(0.1f, 0.2f);
		double sum3 = so.plus(0.5, 0.7);

		System.out.println("정수형 오버로딩 : " + sum1);
		System.out.println("float형 오버로딩 : " + sum2);
		System.out.println("double형 오버로딩 : " + sum3);
	}

}
