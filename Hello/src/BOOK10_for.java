import java.util.Scanner;

/*
 * 삼항 연산자 : 복잡한 형태의 조건문을 단순화 시키는 것이 목적이다.
 * ? = (수식) ? 찹 : 거짓 
 * 
 */
public class BOOK10_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반복 처리할 숫자를 입력해주세요.");
		
		int x = sc.nextInt();
		int i;
		
		for (i=0; i < x; i++) { // (int i=0; i < x; i++) 처럼 int로 다시 선언하면 오류 발생
			System.out.println("실행");
		}
		
		System.out.println(i);
		
		/*
		 * int i;
		 * 
		 * for (i = 0; i < 3; i++) { System.out.println("실행"); } System.out.println(i);
		 */
	}

}
