package ArraySample;

/* [문제] Hello라는 문자열을 입력받아서 전송하고 
 * "반갑습니다" 라는 문자열을 추가하여 반환하세요 
 */

import java.util.Scanner;

public class class_sample1_question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("'Hello'를 입력해주세요.");

		String input;

		input = sc.nextLine();
		
		if("Hello".equals(input)) {
			System.out.println("박수연님 반갑습니다.");
		} else {
			System.out.println("입력값이 다릅니다.");
		}

	}

}
