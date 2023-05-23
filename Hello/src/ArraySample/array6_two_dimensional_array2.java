package ArraySample;

import java.util.Arrays;
import java.util.Scanner;

public class array6_two_dimensional_array2 {

	public static void main(String args[]) {

		int[][] score = new int[][] { { 70, 80 }, { 60, 70, 80 }, { 50 }, { 50, 50, 60 } };

		for(int i = 0; i < score.length; i++) {

			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]);
			}
			System.out.println();

		}
		System.out.println(score.length);  // 4
		System.out.println(score[0].length);  // 2
		System.out.println(score[1].length);  // 3
		System.out.println(score[2].length);  // 1
		System.out.println(score[3].length);  // 3
		
//		String a = args[0];
//		String b = args[1];
//		
//		System.out.println(a);
//		System.out.println(b);
		
		String str1 = args[0];
		int kor = Integer.parseInt(str1); // 문자열을 숫자로 파싱
		
		String str2 = args[1];
		int math = Integer.parseInt(str2);
		
		int sum = kor + math;
		System.out.println("합계는 : " + sum);
		////////////////////////////////// 
		
		String str3 = String.valueOf(kor); // 문자열로 변환
		String str4 = String.valueOf(math);
		String sum2 = str3 + str4;
		System.out.println(sum2);
	}
}
