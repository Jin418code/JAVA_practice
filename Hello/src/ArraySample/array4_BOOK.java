package ArraySample;

import java.util.Arrays;
import java.util.Scanner;

public class array4_BOOK {

	public static void main(String args[]) {
		
//		int a = 300;
//		int b = a;
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//		
//		b = 700;
//		System.out.println("a2 = " + a);
//		System.out.println("b2 = " + b);
//		
//		// 참조 자료형 변수 복사
//		int[] x = {300, 400, 500};
//		int[] y = x;
//		System.out.println("x = " + x[0] + x[1] + x[2]);
//		System.out.println("y = " + y[0] + y[1] + y[2]);
//
//		y[0] = 700;
//		System.out.println("x = " + x[0] + x[1] + x[2]);
//		System.out.println("x = " + y[0] + y[1] + y[2]);	
//		
		
		
//		System.out.println("===========================");
//		
//		int[] a = new int[10];
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("10개의 데이터를 입력해주세요");
//		for(int i = 0; i < a.length; i++) {
//			int score = sc.nextInt();
//			a[i] = score;
//		}
//
//		for(int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("처리할 데이터 갯수를 입력해주세요.");
		
		int num = sc.nextInt();
		
		int[] a = new int[num];
		int sum = 0;
		
		System.out.println(num + "개의 데이터를 입력해주세요.");
		for(int i = 0; i < a.length; i++) {
			int score = sc.nextInt();  //
			a[i] = score;  //
			
			sum += a[i];
		}
		System.out.println("합계 : " + sum);
	}
}
