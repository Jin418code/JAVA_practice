package ArraySample;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * [문제] 원하는 점수를 찾아서 그 index와 정수를 출력하세요.
 * 그리고 계속 처리를 원하면 반복 처리되도록 해주세요.
 */
public class array5_QUESTION1_EXCEPTION {

	public static void main(String args[]) {

		int[] array = { 1, 2, 3, 4, 5 };

		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);

		int inputNum = 0;
		String inputStr = null;

		try {
			inputNum = scNum.nextInt();
			inputStr = scStr.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("올바른 형식으로 입력해주세요.");
			scNum.close();
			scStr.close();
			return;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == inputNum) {
				System.out.println("입력하신 " + inputNum + "는 " + array[i] + "번째에 있습니다.");
			} else if (inputNum != array[i]) {
				System.out.println("입력하신 점수는 index에 없습니다.");
			}
		}

		if (inputStr != null) {
		}
		System.out.println("반복을 원하실 경우 아무키를 눌러주세요.");

		scNum.close();
		scStr.close();
	}
}
