package ArraySample;

//[문제] 3과목의 데이터를 입력받아서 
//총점과 평균을 구하여 출력하세요

import java.util.Scanner;

public class class_sample1_question4_2_repeat {
// field area : 클래스 변수, 클래스 메서드

	// 클래스 변수 3가지
	private static int java;
	private static int jsp;
	private static int spring;
	private static int addAll;
	private static int aver;

	static Scanner sc = new Scanner(System.in);

	// 클래스 메서드
	private static void sungjukProcess() {
		addAll = java + jsp + spring;
		aver = addAll / 3;
	}

	private static void sungjukOutput() {
		System.out.println("총합 = " + addAll);
		System.out.println("평균 = " + aver);
	}

	private static void sungjukInput() {

		System.out.println("국어 점수를 입력해주세요");
		java = sc.nextInt();

		System.out.println("수학 점수를 입력하세요");
		jsp = sc.nextInt();

		System.out.println("영어 점수를 입력하세요");
		spring = sc.nextInt();
	}

	public static void main(String[] args) {

//		for (int i = 0; ;) {
//		sungjukInput();
//		sungjukProcess();
//		sungjukOutput();
//		}

		while (true) {
			sungjukInput();
			sungjukProcess();
			sungjukOutput();

			System.out.println("다시 진행하시겠으면 y를 입력해주세요");
			String repeat = sc.next();

			if (repeat.equals("y")) {
				continue;
			} else {
				System.out.println("종료합니다.");
				System.exit(0);
//				break;
			}
		}
	}
}
