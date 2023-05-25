package inheritanceSample;

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

class sample_inher2_ANS extends CalAdder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int x = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int y = sc.nextInt();
		
		adder(x, y);
		suber(x, y);
		muler(x, y);
		diver1(x, y);
		diver2(x, y);
		
	}
}