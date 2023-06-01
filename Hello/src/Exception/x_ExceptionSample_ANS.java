package Exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class x_ExceptionSample_ANS {

	public static void main(String[] args) {
		int sum = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			try {
				System.out.println("처리할 데이터의 갯수를 입력해주세요");
				String num = sc.next();
				int x = Integer.parseInt(num);

				int data[] = new int[x];

				System.out.println(x + "개의 데이터를 입력하세요");
				for (int i = 0; i < data.length; i++) {
					data[i] = sc.nextInt();
				}
				for (int i = 0; i < data.length; i++) {
					if (data[i] < 0) {
						System.out.println("음수(-) 입니다");
						continue;
					} else {
						System.out.println("양수(+) 입니다");
						sum += data[i];
						count++;
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("데이터는 반드시 정수형이어야 합니다");
			} catch (NumberFormatException n) {
				System.out.println("정수형으로 반드시 입력해주어야 합니다");
			}
			System.out.println("합계는 " + sum + " / " + "갯수는 " +count);
		}
	}
}