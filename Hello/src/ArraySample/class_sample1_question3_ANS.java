package ArraySample;

//[문제] 데이터를 2개 입력받아서 가감승제산을 하여 출력하세요.
//<조건> oo, ox, xo, xx 골라서 처리

import java.util.Scanner;

public class class_sample1_question3_ANS {

	private static int adder(int num1, int num2) {  // 클래스 메서드
		int sum = num1 + num2;
		return sum;		
	}	
	
	private static int suber(int num1, int num2) {
		int sum = num1 - num2;
		return sum;		
	}
	
	private static int muler(int num1, int num2) {
		int sum = num1 * num2;
		return sum;		
	}
	
	private static int diver1(int num1, int num2) {
		int sum = num1 / num2;
		return sum;		
	}
	
	private static int diver2(int num1, int num2) {
		int sum = num1 % num2;
		return sum;		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 데이터를 입력해주세요");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 데이터를 입력해주세요");
		int num2 = sc.nextInt();
				
		int sum = adder(num1, num2);
		System.out.println("adder(): " + sum);
		int sum2 = suber(num1, num2);
		System.out.println("adder(): " + sum2);
		int sum3 = muler(num1, num2);
		System.out.println("adder(): " + sum3);
		int sum4 = diver1(num1, num2);
		System.out.println("adder(): " + sum4);
		int sum5 = diver2(num1, num2);
		System.out.println("adder(): " + sum5);

	}




}
