package Exception;

import java.lang.SuppressWarnings;
import java.util.Scanner;

class Radius {

	double radius;

	protected void calCulator1(double radius) {
		double circle = radius * radius * 3.14;
		{
			System.out.println(circle);
		}
	}

	protected void calCulator2(double radius) {
		double circle = radius * radius * Math.PI;
		{
			System.out.println(circle);
		}
	}
}

public class ExceptionSample3 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean isDouble;
		System.out.println("반지름을 입력하세요");
		double radius = sc.nextDouble();

		Radius rad = new Radius();
		rad.calCulator1(radius);
		rad.calCulator2(radius);

	}
}