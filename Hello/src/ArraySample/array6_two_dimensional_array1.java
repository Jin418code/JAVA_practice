package ArraySample;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class array6_two_dimensional_array1 {

	public static void main(String args[]) {

//		boolean[][] array7 = new boolean[3][4];
//		int[][] array = new int[2][4];
//		double[][] array9 = new double[3][5];
//		String[][] array10 = new String[2][6];

//		int[][] a = new int[2][3];
//		a[0][0] = 100;
//		a[0][1] = 200;
//		a[0][2] = 300;
//		a[1][0] = 400;
//		a[1][1] = 500;
//		a[1][2] = 600;
//
//		System.out.println("a의 배열의 크기가 =" + a.length); // 2 / 몇 행인지
//		System.out.println("a[0]의 배열의 크기가 = " + a[0].length); // 3 / 몇 열인지
//		System.out.println("a[1]의 배열의 크기가 = " + a[1].length); // 3

		int[][] score = new int[][] { { 70, 80, 90 }, { 60, 70, 80 }, { 50, 60, 70 }, { 50, 50, 60 } };
		System.out.println("---------------------------");
		System.out.println("번호 자바 스프링 스프링부트 총점");
		System.out.println("---------------------------");

		
		for (int i = 0; i < score.length; i++) { // row 행
			int sum = 0;

			System.out.print((i + 1) + " : ");

			for (int j = 0; j < score[i].length; j++) { // column 열
				System.out.print(score[i][j] + "      ");

				sum += score[i][j];
			}
			System.out.print(sum);
			System.out.println();
		}
		System.out.println("---------------------------");
	}
}
