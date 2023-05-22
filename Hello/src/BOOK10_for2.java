import java.util.Scanner;

/*
 * 삼항 연산자 : 복잡한 형태의 조건문을 단순화 시키는 것이 목적이다.
 * ? = (수식) ? 찹 : 거짓 
 * 
 */
public class BOOK10_for2 {

	public static void main(String[] args) {

		/*
		 * int a; for (a = 0; a < 3; a++) { System.out.print(a + " "); }
		 * System.out.println();
		 * 
		 * 
		 * 
		 * for (int i = 0; i < 3; i++) { System.out.print(i + " "); }
		 * System.out.println();
		 * 
		 * for (int i = 0; i < 100; i++) { System.out.print(i + " "); }
		 * System.out.println();
		 * 
		 * for (int i = 10; i > 0; i--) { System.out.print(i + " "); }
		 * System.out.println();
		 * 
		 * for (int i = 0; i < 10; i += 2) { System.out.print(i + " "); }
		 * System.out.println();
		 * 
		 * for (int i = 0, j = 0; i < 10; i++, j++) { System.out.print(i + j + " "); }
		 * System.out.println();
		 * 
		 * 
		 * 
		 * for (int i = 0; ; i++) { System.out.print(i + " "); }
		 * 
		 * for (; ;) { System.out.print(" 무한 루프 "); }
		 */

		/*
		 * for (int i = 0; ; i++) { // (int i = 0; i > 10; i++)과 같음 if (i > 10) { break;
		 * } System.out.println(i + " "); }
		 */
//		System.out.println();

		// 이중 반복문
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i + " " + j);
				if (i == j) {
					System.out.println("i = j");
				}
			}
		}
	}
}
