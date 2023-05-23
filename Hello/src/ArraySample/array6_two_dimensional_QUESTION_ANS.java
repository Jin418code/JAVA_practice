package ArraySample;

import java.util.Arrays;
import java.util.Scanner;

public class array6_two_dimensional_QUESTION_ANS {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		while (true) {

			System.out.println("학생수를 입력하세요.");
			int su = sc.nextInt(); // 학생수입력

			System.out.println("배열에 저장할 과목수를 입력하세요.");
			int n = sc.nextInt();

			String name[] = new String[su];
			double sungjukdata[][] = new double[su][5];

			for (int i = 0; i < name.length; i++) {

				double sum = 0.0;
				double average = 0.0;

				System.out.println("학생 이름을 입력하세요.");
				name[i] = sc.next();

				for (int j = 0; j < n; j++) {
					if (j == 0) {
						System.out.println("Java : ");
						sungjukdata[i][0] = sc.nextDouble();
						sum += sungjukdata[i][j];

					}
					if (j == 1) {
						System.out.println("Spring : ");
						sungjukdata[i][1] = sc.nextDouble();
						sum += sungjukdata[i][j];
					}
					if (j == 2) {
						System.out.println("Jsp : ");
						sungjukdata[i][2] = sc.nextDouble();
						sum += sungjukdata[i][j];
					}

					sungjukdata[i][3] = sum;
					average = sum / 3.0;
					sungjukdata[i][4] = average;
				}
			}
			System.out.println("-----------------------------------");
			System.out.println("이름\t자바\t스프링\tJSP\t총점\t평균");
			System.out.println("-----------------------------------");

			for (int i = 0; i < name.length; i++) {
				System.out.print(name[i] + "\t" + sungjukdata[i][0] + "\t" + sungjukdata[i][1] + "\t" + sungjukdata[i][2]);
				
				System.out.println("\t" + String.format("%5.2f", sungjukdata[i][3]) + "\t" + String.format("%5.2f", sungjukdata[i][4]));  // 평균 값
			}
			System.out.println("성적 데이터 처리를 계속하시겠습니까?(yes/no)");
			String stop = sc.next();

			if (stop.equals("yes")) {
				continue;
			} else {
				break;
			}
		}

	}
}
