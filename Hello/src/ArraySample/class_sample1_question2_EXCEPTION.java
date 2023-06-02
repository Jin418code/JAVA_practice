package ArraySample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class class_sample1_question2_EXCEPTION {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inputNum = 0;
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.println("반복 횟수를 입력해주세요");
				inputNum = sc.nextInt();
				validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("올바른 형식으로 입력해주세요.");
				sc.nextLine();
			}
		}

		System.out.println("문자를 입력해주세요.");
		String input = sc.next();

		for (int i = 0; i < inputNum; i++) {
			System.out.println(input);
		}

		sc.close();
	}

}