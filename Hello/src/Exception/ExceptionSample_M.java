package Exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionSample_M {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean run = true;

		while (true) {
			int score = 0;

			try {
				System.out.println("처리할 성적 데이터를 입력해주세요");
				score = sc.nextInt();

				String grade = (score >= 90) ? "A학점" : (score >= 80) ? "B학점" : (score >= 70) ? "C학점" : (score >= 60) ? "D학점" : "E학점";
				if (score > 100) {
					System.out.println("성적을 잘못 입력하셨습니다");
					continue;
				}
				System.out.println("학점: " + grade);
				System.out.println("성적을 계속 처리하시겠습니까?(y/n)");

				String str = sc.next();

				if (str.equals("y")) {
					continue;
				} else {
					run = false;
					System.out.println("성적 프로그램을 종료합니다");
					break;
				}
				
			} catch (InputMismatchException e) {
				String str = "성적은 정수값만 가능합니다";
				System.out.println(str);
			}
			sc.nextLine();
		}
	}
}
