package ArraySample;

//[문제] Hello라는 문자열을 입력받아서 5번 출력하세요

import java.util.Scanner;

public class class_sample1_question2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력해주세요");
		int inputNum = sc.nextInt();
		
		System.out.println("문자를 입력해주세요.");
		String input = sc.next();
		
		for (int i=0; i < inputNum; i++) {
			System.out.println(input);
		}

	}

}
