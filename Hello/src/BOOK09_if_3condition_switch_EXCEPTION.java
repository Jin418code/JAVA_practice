import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 삼항 연산자 : 복잡한 형태의 조건문을 단순화 시키는 것이 목적이다.
 * ? = (수식) ? 찹 : 거짓 
 * 
 */
public class BOOK09_if_3condition_switch_EXCEPTION {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("처리할 성적 데이터를 입력해주세요: ");

			int score = sc.nextInt();

			switch (score / 10) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("입력한 값이 유효하지 않습니다. 정수를 입력해주세요.");
			e.printStackTrace();
		}
	}

}
