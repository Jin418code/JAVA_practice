import java.util.Scanner;

/*
 * 삼항 연산자 : 복잡한 형태의 조건문을 단순화 시키는 것이 목적이다.
 * ? = (수식) ? 찹 : 거짓 
 * 
 */
public class BOOK13_continue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복 처리할 숫자를 입력해주세요 : ");
		int x = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i <= x; i++) {
			sum += i;
			
			if(i == 5) {
				continue;
			}
			
			sum += i;
			
			System.out.println(i + "의 합계: " + sum);
		}
		System.out.println("탈출했어요");
	}
}
