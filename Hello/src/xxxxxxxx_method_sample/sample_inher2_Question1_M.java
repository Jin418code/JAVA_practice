package xxxxxxxx_method_sample;

import java.util.Scanner;

/* 2개의 숫자를 입력 받아서 가감승제산(메서드 이용)을 하는 프로그램을 작성.
 * 부모 클래스 = 두 수를 입력 받아서 가감승제산
 * -----------------
 * 덧셈 : adder();
 * 뺄셈 : suber();
 * 곱셈 : muler();
 * 나눗셈 몫 : Caldiver1();
 * 나눗셈 나머지 : Caldiver2();
 * 
 * 자식 클래스 = 가감승제산 메서드를 호출하여 결과를 출력
 * 상속을 이용한 프로그램 작성
 * 가감승제산 메서드
 * 덧셈 : adder();
 * 뺄셈 : suber();
 * 곱셈 : muler();
 * 나눗셈 몫 : diver1();
 * 나눗셈 나머지 : diver2();
*/

class cal extends inputNum {

	public static int adder(int inputNum1, int inputNum2) {
		int sum = inputNum1 + inputNum2;
		return sum;
	}

	public static int suber(int inputNum1, int inputNum2) {
		int sum = inputNum1 - inputNum2;
		return sum;
	}

	public static int muler(int inputNum1, int inputNum2) {
		int sum = inputNum1 * inputNum2;
		return sum;
	}

	public static int diver1(int inputNum1, int inputNum2) {
		int sum = inputNum1 / inputNum2;
		return sum;
	}

	public static int diver2(int inputNum1, int inputNum2) {
		int sum = inputNum1 % inputNum2;
		return sum;
	}
}

class inputNum {

	public static void inputNum() {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요");
		int inputNum1 = sc.nextInt();

		System.out.println("두번째 숫자를 입력하세요");
		int inputNum2 = sc.nextInt();
	}
}

public class sample_inher2_Question1_M extends inputNum{

	public static void main() {
		inputNum();
	}
}