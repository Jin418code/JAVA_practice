import java.util.Scanner;

/* [문제] 숫자를 입력 받아서 그 숫자가 홀수인지,
 * 짝수 인지 판별하여 출력하세요.
 * 단,반복 처리하세요*../
 */

public class J99_Question1_ANS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 반복 횟수를 지정해주세요.");
		
		int num = sc.nextInt();
		
		int count = 1;

		while (count <= num) {
			System.out.println(count + "번째 숫자를 입력해 주세요.");
			int su = sc.nextInt();

			if (su % 2 != 0) {
				System.out.println("홀수입니다.");
			} else if (su == 0) {
				System.out.println("0을 입력하셨습니다.");
			} else {
				System.out.println("홀수가 아닙니다.");
			}
			count++;
		}
	}
}