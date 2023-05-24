package ArraySample;

//[문제] 3과목의 데이터를 입력받아서 
//총점과 평균을 구하여 출력하세요

import java.util.Scanner;

public class class_sample1_question4_1 {
// field area : 클래스 변수, 클래스 메서드

	// 클래스 변수 3가지
	static int java;
	static int jsp;
	static int spring;
	static int addAll;
	static int aver;

	// 클래스 메서드
	private static void sungjukProcess() {
		addAll = java + jsp + spring;
		aver = addAll / 3;
	}

	private static void sungjukOutput() {
		System.out.println("총합 = " + addAll);
		System.out.println("평균 = " + aver);
	}

	static void sungjukInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("java 점수를 입력해주세요");
		java = sc.nextInt();

		System.out.println("jsp 점수를 입력하세요");
		jsp = sc.nextInt();

		System.out.println("spring 점수를 입력하세요");
		spring = sc.nextInt();
	}

	public static void main(String[] args) {
		sungjukInput();
		sungjukProcess();
		sungjukOutput();
	}

}
