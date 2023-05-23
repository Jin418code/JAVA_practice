package ArraySample;

import java.util.Arrays;

import java.util.Scanner;

/*
 * [문제] 원하는 점수를 찾아서 그 index와 정수를 출력하세요.
 * 그리고 계속 처리를 원하면 반복 처리되도록 해주세요.
 */
public class array5_QUESTION1 {

	public static void main(String args[]) {

		int[] array = { 1, 2, 3, 4, 5 };

		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);

		int inputNum = 0;
		String inputStr = null;

		inputNum = scNum.nextInt();
		inputStr = scStr.nextLine();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == inputNum) {
				System.out.println("입력하신 " + inputNum + "는 " + array[i] + "번째에 있습니다.");
//				System.out.println(Arrays.asList(array).indexOf("scNum"));
			
			} else if(inputNum != array[i]) {
				System.out.println("입력하신 점수는 index에 없습니다.");
				// #####1 프린트가 4번 실행되는 이유 찾기
			}
		}

		if (inputStr != null) {
			// 점수 찾아 index와 정수 출력하는 함수
		}
		System.out.println("반복을 원하실 경우 아무키를 눌러주세요.");

	}
}
