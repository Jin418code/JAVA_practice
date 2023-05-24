package ArraySample;

//[문제] 데이터를 2개 입력받아서 가감승제산을 하여 출력하세요.
//<조건> oo, ox, xo, xx 골라서 처리

import java.util.Scanner;

public class class_sample1_question3_0 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("어떠한 계산을 원하시나요?");
		String howTo = sc.nextLine();

		System.out.println("첫번째 숫자를 입력해주세요");
		int inputNum1 = sc.nextInt();

		System.out.println("두번째 숫자를 입력해주세요");
		int inputNum2 = sc.nextInt();

		switch (howTo) {
		case "+":
			System.out.println((inputNum1 + inputNum2));
			break;
		case "-":
			System.out.println((inputNum1 - inputNum2));
			break;
		case "*":
			System.out.println((inputNum1 * inputNum2));
			break;
		case "/":
			System.out.println((inputNum1 / inputNum2));
			break;
		case "%":
			System.out.println((inputNum1 % inputNum2));
			break;

		}
	}

}
