package Exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/* 문제> 로또 복권을 추첨합니다.
 *     복권이 중복되지 않도록 출력하세요. 
 *     
 * 조건> 1.Random 클래스 적용 	 
 	    2.예외처리를 적용
 	    3.중복되지 않아야 합니다.
 	    4.범위: 1 ~ 45
 */

public class x_Exception_Question2_ANS {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			try {
				System.out.println("lotto 자릿수를 입력해 주세요.");
				String num = sc.next();
				int n = Integer.parseInt(num);

				int lotto[] = new int[n];// lotto 번호 저장 배열

				System.out.print("Lottocount = ");// lotto 발행횟수
				int lottoCount = sc.nextInt();//

				for (int cnt = 0; cnt < lottoCount; cnt++) {

					loop_lotte: for (int idx = 0; idx < lotto.length; idx++) {

						int lot = rand.nextInt(45) + 1;

						// 로또 중복 확인
						for (int i = 1; i <= idx; i++) {
							if (lot == lotto[i]) {
								idx--;
								continue loop_lotte;
							}
						} // i end
						lotto[idx] = lot;
					} // idx end

					Arrays.sort(lotto);// 오름차순 정렬

					System.out.println((cnt + 1) + "로또 발행 번호 ");

					for (int i = 0; i < lotto.length; i++) {
						System.out.print(lotto[i] + ", ");
					}
					System.out.println();
				}
				System.out.println("====================");
			} catch (InputMismatchException n) {
				System.out.println("정수형으로 반드시 입력해 주어야 합니다~~");
			}
		}
		sc.nextLine();
	}// main end

}
// class end
