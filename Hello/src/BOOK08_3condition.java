import java.util.Scanner;

/*
 * 삼항 연산자 : 복잡한 형태의 조건문을 단순화 시키는 것이 목적이다.
 * ? = (수식) ? 찹 : 거짓 
 * 
 */
public class BOOK08_3condition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("처리할 데이터를 입력해 주세요.");
		int x1 = sc.nextInt();
		
		/*
		 * int result = (x1 % 2 == 0) ? 10: 20; 
		 * System.out.println("결과는 = " + result);
		 */
		
		if(x1 % 2 == 0) {
			System.out.println("10");
		} else {
			System.out.println("20");
		}
	}

}

