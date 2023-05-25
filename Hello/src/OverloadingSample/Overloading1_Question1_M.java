package OverloadingSample;

import java.util.Scanner;

/* [문제] 
 * 두 수를 입력받아서 정수형 오버로딩을 하고 실수형 오버로딩을 합니다.
 * <조건>
 * 1. 정수형 타입으로
 * 2. 실수형 타입으로
 */
public class Overloading1_Question1_M {

	static double num1;
	static double num2;
	static Scanner sc = new Scanner(System.in);

	private void plusInt() {
		int sum = ((int) (num1 + num2));
		System.out.println("int 타입 계산 = " + sum);
	}

	private void plusFloat() {
		float sum = ((float) (num1 + num2));
		System.out.println("float 타입 계산 = " + sum);
	}
	
	private void plueDouble() {
		double sum = num1 + num2;
		System.out.println("double 타입 계산 = " + sum);
	}
	public void inputNum() {
		System.out.println("첫번째 숫자를 입력하세요");
		num1 = sc.nextFloat();
		System.out.println("두번째 숫자를 입력하세요");
		num2 = sc.nextFloat();
	}

	public static void main(String[] args) { // 오버로딩
		Overloading1_Question1_M so = new Overloading1_Question1_M();

		so.inputNum();
		so.plusInt();
		so.plusFloat();
		so.plueDouble();
	}

}
