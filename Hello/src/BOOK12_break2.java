import java.util.Scanner;

/*
 * 삼항 연산자 : 복잡한 형태의 조건문을 단순화 시키는 것이 목적이다.
 * ? = (수식) ? 찹 : 거짓 
 * 
 */
public class BOOK12_break2 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break;
		}

		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i + " ");
		}
		
		System.out.println();
		System.out.println();

		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();

		
		POS1: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break POS1;
				}
				System.out.println(i + ", " + j);
			}

		}
		System.out.println();
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 2) {
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();

	}
}
