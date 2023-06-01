package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// [문제] 7개의 데이터를 입력받아 숫자중에서 음수와 양수를 구분하여 출력하세요
// <조건> 1. 배열 적용
//        2. 예외 처리 적용
//        3. 양수인 경우에는 합계를 구하고, 갯수를 파악
//        3. 음수인 경우 다음 데이터 읽기로 이동

public class xxxxx_Exception_Question_M {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0; // 입력 값 합산
		int score = 0; // 입력 횟수
		int[] intArray = new int[7];

		try {
			for (int i = 0; i < 7; i++) {
				System.out.println("원하는 숫자를 입력하세요");
				intArray[i] = sc.nextInt();
				if (intArray[i] < 0) {
					continue;
				} else {
					sum += intArray[i];
					score = intArray[i];
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("양수가 아닌 값은 합산되지않습니다");
			
			System.out.println(sum);
			System.out.println(score);
		}
	}
}
